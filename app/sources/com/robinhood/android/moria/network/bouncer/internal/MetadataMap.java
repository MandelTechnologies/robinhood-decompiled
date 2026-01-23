package com.robinhood.android.moria.network.bouncer.internal;

import com.robinhood.android.moria.network.bouncer.Metadata2;
import kotlin.Metadata;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.ContinuationImpl7;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;

/* compiled from: MetadataMap.kt */
@Metadata(m3635d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0000\bf\u0018\u0000*\b\b\u0000\u0010\u0001*\u00020\u00022\u00020\u0002J\u0015\u0010\u0003\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00028\u0000H&¢\u0006\u0002\u0010\u0006J@\u0010\u0007\u001a\u0002H\b\"\u0004\b\u0001\u0010\b2\u0006\u0010\u0005\u001a\u00028\u00002\"\u0010\t\u001a\u001e\b\u0001\u0012\u0004\u0012\u00028\u0000\u0012\n\u0012\b\u0012\u0004\u0012\u0002H\b0\u000b\u0012\u0006\u0012\u0004\u0018\u00010\u00020\nH\u0096@¢\u0006\u0002\u0010\fJ\b\u0010\r\u001a\u00020\u000eH&¨\u0006\u000f"}, m3636d2 = {"Lcom/robinhood/android/moria/network/bouncer/internal/MetadataMap;", "P", "", "getMetadata", "Lcom/robinhood/android/moria/network/bouncer/Metadata;", "key", "(Ljava/lang/Object;)Lcom/robinhood/android/moria/network/bouncer/Metadata;", "track", "R", "block", "Lkotlin/Function2;", "Lkotlin/coroutines/Continuation;", "(Ljava/lang/Object;Lkotlin/jvm/functions/Function2;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "clearMap", "", "lib-moria"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
/* loaded from: classes17.dex */
public interface MetadataMap<P> {
    void clearMap();

    com.robinhood.android.moria.network.bouncer.Metadata getMetadata(P key);

    <R> Object track(P p, Function2<? super P, ? super Continuation<? super R>, ? extends Object> function2, Continuation<? super R> continuation);

    /* compiled from: MetadataMap.kt */
    @Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
    public static final class DefaultImpls {
        public static <P, R> Object track(MetadataMap<P> metadataMap, P p, Function2<? super P, ? super Continuation<? super R>, ? extends Object> function2, Continuation<? super R> continuation) {
            return Metadata2.track(metadataMap.getMetadata(p), new C222292(function2, p, null), continuation);
        }
    }

    /* JADX INFO: Add missing generic type declarations: [R] */
    /* compiled from: MetadataMap.kt */
    @Metadata(m3635d1 = {"\u0000\u0004\n\u0002\b\u0002\u0010\u0000\u001a\u0002H\u0001\"\u0004\b\u0000\u0010\u0001H\n"}, m3636d2 = {"<anonymous>", "R"}, m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
    @DebugMetadata(m3644c = "com.robinhood.android.moria.network.bouncer.internal.MetadataMap$track$2", m3645f = "MetadataMap.kt", m3646l = {23}, m3647m = "invokeSuspend")
    /* renamed from: com.robinhood.android.moria.network.bouncer.internal.MetadataMap$track$2 */
    static final class C222292<R> extends ContinuationImpl7 implements Function1<Continuation<? super R>, Object> {
        final /* synthetic */ Function2<P, Continuation<? super R>, Object> $block;
        final /* synthetic */ P $key;
        int label;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        C222292(Function2<? super P, ? super Continuation<? super R>, ? extends Object> function2, P p, Continuation<? super C222292> continuation) {
            super(1, continuation);
            this.$block = function2;
            this.$key = p;
        }

        @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
        public final Continuation<Unit> create(Continuation<?> continuation) {
            return new C222292(this.$block, this.$key, continuation);
        }

        @Override // kotlin.jvm.functions.Function1
        public final Object invoke(Continuation<? super R> continuation) {
            return ((C222292) create(continuation)).invokeSuspend(Unit.INSTANCE);
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
            Function2<P, Continuation<? super R>, Object> function2 = this.$block;
            P p = this.$key;
            this.label = 1;
            Object objInvoke = function2.invoke(p, this);
            return objInvoke == coroutine_suspended ? coroutine_suspended : objInvoke;
        }
    }
}
