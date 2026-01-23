package com.robinhood.android.microgramsdui.control;

import com.robinhood.models.serverdriven.experimental.api.ComponentState;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.Map;
import kotlin.Metadata;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.collections.MapsKt;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.ContinuationImpl7;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlinx.coroutines.CoroutineScope;
import microgram.p507ui.p508v1.ScreenEventMessageDto;
import rh_server_driven_ui.p531v1.StateContextDto;

/* compiled from: IdlUiController.kt */
@Metadata(m3635d1 = {"\u0000\n\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, m3636d2 = {"<anonymous>", "Lmicrogram/ui/v1/ScreenEventMessageDto$ConcreteDto$StateUpdated;", "Lkotlinx/coroutines/CoroutineScope;"}, m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
@DebugMetadata(m3644c = "com.robinhood.android.microgramsdui.control.IdlUiController$notifyScreenStatesUpdated$event$1", m3645f = "IdlUiController.kt", m3646l = {}, m3647m = "invokeSuspend")
@SourceDebugExtension
/* loaded from: classes8.dex */
final class IdlUiController$notifyScreenStatesUpdated$event$1 extends ContinuationImpl7 implements Function2<CoroutineScope, Continuation<? super ScreenEventMessageDto.ConcreteDto.StateUpdated>, Object> {
    final /* synthetic */ Map<String, ComponentState> $states;
    int label;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    IdlUiController$notifyScreenStatesUpdated$event$1(Map<String, ? extends ComponentState> map, Continuation<? super IdlUiController$notifyScreenStatesUpdated$event$1> continuation) {
        super(2, continuation);
        this.$states = map;
    }

    @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
        return new IdlUiController$notifyScreenStatesUpdated$event$1(this.$states, continuation);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(CoroutineScope coroutineScope, Continuation<? super ScreenEventMessageDto.ConcreteDto.StateUpdated> continuation) {
        return ((IdlUiController$notifyScreenStatesUpdated$event$1) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
    }

    @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
    public final Object invokeSuspend(Object obj) {
        IntrinsicsKt.getCOROUTINE_SUSPENDED();
        if (this.label != 0) {
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
        ResultKt.throwOnFailure(obj);
        Map<String, ComponentState> map = this.$states;
        LinkedHashMap linkedHashMap = new LinkedHashMap(MapsKt.mapCapacity(map.size()));
        Iterator<T> it = map.entrySet().iterator();
        while (it.hasNext()) {
            Map.Entry entry = (Map.Entry) it.next();
            linkedHashMap.put(entry.getKey(), IdlUiControllerKt.toDto((ComponentState) entry.getValue()));
        }
        return new ScreenEventMessageDto.ConcreteDto.StateUpdated(new ScreenEventMessageDto.ScreenStateUpdatedMessageDto(new StateContextDto(linkedHashMap)));
    }
}
