package com.robinhood.android.equities.taxlots;

import com.robinhood.android.equities.taxlots.SelectLotsEvent;
import com.robinhood.compose.bento.component.numpad.BentoNumpadScopeV22;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;
import kotlin.Metadata;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.ContinuationImpl7;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlinx.coroutines.CoroutineScope;

/* compiled from: SelectLotsComposable.kt */
@Metadata(m3635d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, m3636d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
@DebugMetadata(m3644c = "com.robinhood.android.equities.taxlots.SelectLotsComposableKt$SelectLotsComposable$8$1", m3645f = "SelectLotsComposable.kt", m3646l = {}, m3647m = "invokeSuspend")
@SourceDebugExtension
/* loaded from: classes3.dex */
final class SelectLotsComposableKt$SelectLotsComposable$8$1 extends ContinuationImpl7 implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
    final /* synthetic */ SelectLotsEvent $event;
    final /* synthetic */ BentoNumpadScopeV22 $numpadScope;
    int label;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    SelectLotsComposableKt$SelectLotsComposable$8$1(SelectLotsEvent selectLotsEvent, BentoNumpadScopeV22 bentoNumpadScopeV22, Continuation<? super SelectLotsComposableKt$SelectLotsComposable$8$1> continuation) {
        super(2, continuation);
        this.$event = selectLotsEvent;
        this.$numpadScope = bentoNumpadScopeV22;
    }

    @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
        return new SelectLotsComposableKt$SelectLotsComposable$8$1(this.$event, this.$numpadScope, continuation);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
        return ((SelectLotsComposableKt$SelectLotsComposable$8$1) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
    }

    @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
    public final Object invokeSuspend(Object obj) {
        IntrinsicsKt.getCOROUTINE_SUSPENDED();
        if (this.label != 0) {
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
        ResultKt.throwOnFailure(obj);
        Set<Map.Entry<String, String>> setEntrySet = ((SelectLotsEvent.SelectionStrategyChange) this.$event).getLotsToUpdate().entrySet();
        BentoNumpadScopeV22 bentoNumpadScopeV22 = this.$numpadScope;
        Iterator<T> it = setEntrySet.iterator();
        while (it.hasNext()) {
            Map.Entry entry = (Map.Entry) it.next();
            bentoNumpadScopeV22.setInternalValue((String) entry.getKey(), (String) entry.getValue());
        }
        return Unit.INSTANCE;
    }
}
