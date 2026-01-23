package com.robinhood.android.moria.network.bouncer;

import java.util.UUID;
import java.util.concurrent.CancellationException;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.coroutines.jvm.internal.ContinuationImpl7;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.CoroutineScope2;

/* compiled from: Metadata.kt */
@kotlin.Metadata(m3635d1 = {"\u0000\u001a\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\u001a6\u0010\u0000\u001a\u0002H\u0001\"\u0004\b\u0000\u0010\u0001*\u00020\u00022\u001c\u0010\u0003\u001a\u0018\b\u0001\u0012\n\u0012\b\u0012\u0004\u0012\u0002H\u00010\u0005\u0012\u0006\u0012\u0004\u0018\u00010\u00060\u0004H\u0086@¢\u0006\u0002\u0010\u0007¨\u0006\b"}, m3636d2 = {"track", "R", "Lcom/robinhood/android/moria/network/bouncer/Metadata;", "block", "Lkotlin/Function1;", "Lkotlin/coroutines/Continuation;", "", "(Lcom/robinhood/android/moria/network/bouncer/Metadata;Lkotlin/jvm/functions/Function1;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "lib-moria"}, m3637k = 2, m3638mv = {2, 1, 0}, m3640xi = 48)
/* renamed from: com.robinhood.android.moria.network.bouncer.MetadataKt, reason: use source file name */
/* loaded from: classes17.dex */
public final class Metadata2 {

    /* compiled from: Metadata.kt */
    @kotlin.Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
    @DebugMetadata(m3644c = "com.robinhood.android.moria.network.bouncer.MetadataKt", m3645f = "Metadata.kt", m3646l = {43}, m3647m = "track")
    /* renamed from: com.robinhood.android.moria.network.bouncer.MetadataKt$track$1 */
    static final class C222251<R> extends ContinuationImpl {
        Object L$0;
        Object L$1;
        int label;
        /* synthetic */ Object result;

        C222251(Continuation<? super C222251> continuation) {
            super(continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
        public final Object invokeSuspend(Object obj) {
            this.result = obj;
            this.label |= Integer.MIN_VALUE;
            return Metadata2.track(null, null, this);
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:27:0x0066 A[Catch: all -> 0x006a, TryCatch #2 {all -> 0x006a, blocks: (B:25:0x0062, B:27:0x0066, B:30:0x006c), top: B:37:0x0062 }] */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final <R> Object track(Metadata metadata, Function1<? super Continuation<? super R>, ? extends Object> function1, Continuation<? super R> continuation) {
        C222251 c222251;
        UUID uuidOnRequestInitiated;
        Object objCoroutineScope;
        if (continuation instanceof C222251) {
            c222251 = (C222251) continuation;
            int i = c222251.label;
            if ((i & Integer.MIN_VALUE) != 0) {
                c222251.label = i - Integer.MIN_VALUE;
            } else {
                c222251 = new C222251(continuation);
            }
        }
        Object obj = c222251.result;
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i2 = c222251.label;
        if (i2 == 0) {
            ResultKt.throwOnFailure(obj);
            uuidOnRequestInitiated = metadata.onRequestInitiated();
            try {
                C222262 c222262 = new C222262(function1, metadata, uuidOnRequestInitiated, null);
                c222251.L$0 = metadata;
                c222251.L$1 = uuidOnRequestInitiated;
                c222251.label = 1;
                objCoroutineScope = CoroutineScope2.coroutineScope(c222262, c222251);
                if (objCoroutineScope == coroutine_suspended) {
                    return coroutine_suspended;
                }
                metadata.onRequestDisposed(uuidOnRequestInitiated);
                return objCoroutineScope;
            } catch (Throwable th) {
                th = th;
                if (!(th instanceof CancellationException)) {
                    metadata.onRequestFailed(uuidOnRequestInitiated, th);
                }
                throw th;
            }
        }
        if (i2 != 1) {
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
        UUID uuid = (UUID) c222251.L$1;
        Metadata metadata2 = (Metadata) c222251.L$0;
        try {
            ResultKt.throwOnFailure(obj);
            uuidOnRequestInitiated = uuid;
            metadata = metadata2;
            objCoroutineScope = obj;
            metadata.onRequestDisposed(uuidOnRequestInitiated);
            return objCoroutineScope;
        } catch (Throwable th2) {
            uuidOnRequestInitiated = uuid;
            metadata = metadata2;
            th = th2;
            try {
                if (!(th instanceof CancellationException)) {
                }
                throw th;
            } catch (Throwable th3) {
                metadata.onRequestDisposed(uuidOnRequestInitiated);
                throw th3;
            }
        }
    }

    /* JADX INFO: Add missing generic type declarations: [R] */
    /* compiled from: Metadata.kt */
    @kotlin.Metadata(m3635d1 = {"\u0000\b\n\u0002\b\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u0002H\u0001\"\u0004\b\u0000\u0010\u0001*\u00020\u0002H\n"}, m3636d2 = {"<anonymous>", "R", "Lkotlinx/coroutines/CoroutineScope;"}, m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
    @DebugMetadata(m3644c = "com.robinhood.android.moria.network.bouncer.MetadataKt$track$2", m3645f = "Metadata.kt", m3646l = {44}, m3647m = "invokeSuspend")
    /* renamed from: com.robinhood.android.moria.network.bouncer.MetadataKt$track$2 */
    static final class C222262<R> extends ContinuationImpl7 implements Function2<CoroutineScope, Continuation<? super R>, Object> {
        final /* synthetic */ Function1<Continuation<? super R>, Object> $block;
        final /* synthetic */ Metadata $this_track;
        final /* synthetic */ UUID $uuid;
        int label;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        C222262(Function1<? super Continuation<? super R>, ? extends Object> function1, Metadata metadata, UUID uuid, Continuation<? super C222262> continuation) {
            super(2, continuation);
            this.$block = function1;
            this.$this_track = metadata;
            this.$uuid = uuid;
        }

        @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            return new C222262(this.$block, this.$this_track, this.$uuid, continuation);
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(CoroutineScope coroutineScope, Continuation<? super R> continuation) {
            return ((C222262) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
        public final Object invokeSuspend(Object obj) {
            Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
            int i = this.label;
            if (i == 0) {
                ResultKt.throwOnFailure(obj);
                Function1<Continuation<? super R>, Object> function1 = this.$block;
                this.label = 1;
                obj = function1.invoke(this);
                if (obj == coroutine_suspended) {
                    return coroutine_suspended;
                }
            } else {
                if (i != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                ResultKt.throwOnFailure(obj);
            }
            this.$this_track.onRequestSucceeded(this.$uuid);
            return obj;
        }
    }
}
