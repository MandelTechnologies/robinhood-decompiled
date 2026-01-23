package com.robinhood.android.formentry;

import kotlin.Metadata;
import kotlin.ResultKt;
import kotlin.Tuples2;
import kotlin.Tuples4;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.ContinuationImpl7;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.CoroutineScope;
import microgram.contracts.money_movement.form_entry.proto.p500v1.FormService;
import microgram.contracts.money_movement.form_entry.proto.p500v1.GetWireAccountAndRoutingNumberRequestDto;
import microgram.contracts.money_movement.form_entry.proto.p500v1.GetWireAccountAndRoutingNumberResponseDto;

/* compiled from: FormEntryDuxo.kt */
@Metadata(m3635d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, m3636d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
@DebugMetadata(m3644c = "com.robinhood.android.formentry.FormEntryDuxo$getAccountAndRoutingForRequest$1$1", m3645f = "FormEntryDuxo.kt", m3646l = {115}, m3647m = "invokeSuspend")
/* renamed from: com.robinhood.android.formentry.FormEntryDuxo$getAccountAndRoutingForRequest$1$1, reason: use source file name */
/* loaded from: classes3.dex */
final class FormEntryDuxo2 extends ContinuationImpl7 implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
    final /* synthetic */ Function1<Tuples2<String, String>, Unit> $callback;
    final /* synthetic */ FormEntryDataState $dataState;
    int label;
    final /* synthetic */ FormEntryDuxo this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    FormEntryDuxo2(FormEntryDuxo formEntryDuxo, FormEntryDataState formEntryDataState, Function1<? super Tuples2<String, String>, Unit> function1, Continuation<? super FormEntryDuxo2> continuation) {
        super(2, continuation);
        this.this$0 = formEntryDuxo;
        this.$dataState = formEntryDataState;
        this.$callback = function1;
    }

    @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
        return new FormEntryDuxo2(this.this$0, this.$dataState, this.$callback, continuation);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
        return ((FormEntryDuxo2) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
    }

    @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
    public final Object invokeSuspend(Object obj) {
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i = this.label;
        if (i == 0) {
            ResultKt.throwOnFailure(obj);
            FormService formService = this.this$0.formService;
            if (formService == null) {
                Intrinsics.throwUninitializedPropertyAccessException("formService");
                formService = null;
            }
            GetWireAccountAndRoutingNumberRequestDto getWireAccountAndRoutingNumberRequestDto = new GetWireAccountAndRoutingNumberRequestDto(this.$dataState.getFields());
            this.label = 1;
            obj = formService.GetWireAccountAndRoutingNumber(getWireAccountAndRoutingNumberRequestDto, this);
            if (obj == coroutine_suspended) {
                return coroutine_suspended;
            }
        } else {
            if (i != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            ResultKt.throwOnFailure(obj);
        }
        GetWireAccountAndRoutingNumberResponseDto getWireAccountAndRoutingNumberResponseDto = (GetWireAccountAndRoutingNumberResponseDto) obj;
        this.$callback.invoke(Tuples4.m3642to(getWireAccountAndRoutingNumberResponseDto.getAccount_number(), getWireAccountAndRoutingNumberResponseDto.getRouting_number()));
        return Unit.INSTANCE;
    }
}
