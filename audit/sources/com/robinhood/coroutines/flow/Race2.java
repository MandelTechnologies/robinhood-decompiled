package com.robinhood.coroutines.flow;

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
import kotlin.jvm.functions.Function2;
import kotlinx.coroutines.channels.Channel5;

/* JADX INFO: Add missing generic type declarations: [T] */
/* compiled from: Race.kt */
@Metadata(m3635d1 = {"\u0000\u0012\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0000\u001a\u0014\u0012\u0004\u0012\u00020\u0002\u0012\n\u0012\b\u0012\u0004\u0012\u0002H\u00040\u00030\u0001\"\u0004\b\u0000\u0010\u00042\f\u0010\u0005\u001a\b\u0012\u0004\u0012\u0002H\u00040\u0003H\n"}, m3636d2 = {"<anonymous>", "Lkotlin/Pair;", "", "Lkotlinx/coroutines/channels/ChannelResult;", "T", "it"}, m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
@DebugMetadata(m3644c = "com.robinhood.coroutines.flow.RaceKt$race$2$1$2$1$1", m3645f = "Race.kt", m3646l = {}, m3647m = "invokeSuspend")
/* renamed from: com.robinhood.coroutines.flow.RaceKt$race$2$1$2$1$1, reason: use source file name */
/* loaded from: classes15.dex */
final class Race2<T> extends ContinuationImpl7 implements Function2<Channel5<? extends T>, Continuation<? super Tuples2<? extends Integer, ? extends Channel5<? extends T>>>, Object> {
    final /* synthetic */ int $index;
    /* synthetic */ Object L$0;
    int label;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    Race2(int i, Continuation<? super Race2> continuation) {
        super(2, continuation);
        this.$index = i;
    }

    @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
        Race2 race2 = new Race2(this.$index, continuation);
        race2.L$0 = obj;
        return race2;
    }

    @Override // kotlin.jvm.functions.Function2
    public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
        return m22189invokeWpGqRn0(((Channel5) obj).getHolder(), (Continuation) obj2);
    }

    /* renamed from: invoke-WpGqRn0, reason: not valid java name */
    public final Object m22189invokeWpGqRn0(Object obj, Continuation<? super Tuples2<Integer, ? extends Channel5<? extends T>>> continuation) {
        return ((Race2) create(Channel5.m28802boximpl(obj), continuation)).invokeSuspend(Unit.INSTANCE);
    }

    @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
    public final Object invokeSuspend(Object obj) {
        IntrinsicsKt.getCOROUTINE_SUSPENDED();
        if (this.label != 0) {
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
        ResultKt.throwOnFailure(obj);
        return Tuples4.m3642to(boxing.boxInt(this.$index), Channel5.m28802boximpl(((Channel5) this.L$0).getHolder()));
    }
}
