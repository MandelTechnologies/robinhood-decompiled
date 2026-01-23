package com.robinhood.android.event.gamedetail;

import com.robinhood.android.models.event.p186db.arsenal.EventContract;
import com.robinhood.android.models.event.p186db.ceres.UiEventContractPosition;
import java.math.BigDecimal;
import kotlin.Metadata;
import kotlin.ResultKt;
import kotlin.Tuples2;
import kotlin.Tuples4;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.ContinuationImpl7;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.boxing;
import kotlin.jvm.functions.Function3;

/* compiled from: GameDetailDuxo.kt */
@Metadata(m3635d1 = {"\u0000\u001a\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\u0010\u0000\u001a\u0012\u0012\u0006\u0012\u0004\u0018\u00010\u0002\u0012\u0006\u0012\u0004\u0018\u00010\u00030\u00012\b\u0010\u0004\u001a\u0004\u0018\u00010\u00052\b\u0010\u0006\u001a\u0004\u0018\u00010\u0007H\n"}, m3636d2 = {"<anonymous>", "Lkotlin/Pair;", "", "Ljava/math/BigDecimal;", "contract", "Lcom/robinhood/android/models/event/db/arsenal/EventContract;", "position", "Lcom/robinhood/android/models/event/db/ceres/UiEventContractPosition;"}, m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
@DebugMetadata(m3644c = "com.robinhood.android.event.gamedetail.GameDetailDuxo$streamComboRelatedStates$2$4$2$2", m3645f = "GameDetailDuxo.kt", m3646l = {}, m3647m = "invokeSuspend")
/* loaded from: classes3.dex */
final class GameDetailDuxo$streamComboRelatedStates$2$4$2$2 extends ContinuationImpl7 implements Function3<EventContract, UiEventContractPosition, Continuation<? super Tuples2<? extends Boolean, ? extends BigDecimal>>, Object> {
    /* synthetic */ Object L$0;
    /* synthetic */ Object L$1;
    int label;

    GameDetailDuxo$streamComboRelatedStates$2$4$2$2(Continuation<? super GameDetailDuxo$streamComboRelatedStates$2$4$2$2> continuation) {
        super(3, continuation);
    }

    /* renamed from: invoke, reason: avoid collision after fix types in other method */
    public final Object invoke2(EventContract eventContract, UiEventContractPosition uiEventContractPosition, Continuation<? super Tuples2<Boolean, ? extends BigDecimal>> continuation) {
        GameDetailDuxo$streamComboRelatedStates$2$4$2$2 gameDetailDuxo$streamComboRelatedStates$2$4$2$2 = new GameDetailDuxo$streamComboRelatedStates$2$4$2$2(continuation);
        gameDetailDuxo$streamComboRelatedStates$2$4$2$2.L$0 = eventContract;
        gameDetailDuxo$streamComboRelatedStates$2$4$2$2.L$1 = uiEventContractPosition;
        return gameDetailDuxo$streamComboRelatedStates$2$4$2$2.invokeSuspend(Unit.INSTANCE);
    }

    @Override // kotlin.jvm.functions.Function3
    public /* bridge */ /* synthetic */ Object invoke(EventContract eventContract, UiEventContractPosition uiEventContractPosition, Continuation<? super Tuples2<? extends Boolean, ? extends BigDecimal>> continuation) {
        return invoke2(eventContract, uiEventContractPosition, (Continuation<? super Tuples2<Boolean, ? extends BigDecimal>>) continuation);
    }

    @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
    public final Object invokeSuspend(Object obj) {
        BigDecimal quantity;
        IntrinsicsKt.getCOROUTINE_SUSPENDED();
        if (this.label != 0) {
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
        ResultKt.throwOnFailure(obj);
        EventContract eventContract = (EventContract) this.L$0;
        UiEventContractPosition uiEventContractPosition = (UiEventContractPosition) this.L$1;
        BigDecimal bigDecimalAbs = null;
        Boolean boolBoxBoolean = eventContract != null ? boxing.boxBoolean(eventContract.isComboContract()) : null;
        if (uiEventContractPosition != null && (quantity = uiEventContractPosition.getQuantity()) != null) {
            bigDecimalAbs = quantity.abs();
        }
        return Tuples4.m3642to(boolBoxBoolean, bigDecimalAbs);
    }
}
