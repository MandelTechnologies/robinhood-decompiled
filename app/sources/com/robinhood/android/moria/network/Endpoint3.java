package com.robinhood.android.moria.network;

import com.plaid.internal.EnumC7081g;
import dispatch.core.Suspend;
import kotlin.Metadata;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.ContinuationImpl7;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.functions.Function3;
import kotlinx.coroutines.CoroutineScope;

/* JADX INFO: Add missing generic type declarations: [P, T] */
/* compiled from: Endpoint.kt */
@Metadata(m3635d1 = {"\u0000\u0010\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u0000\n\u0002\b\u0003\u0010\u0000\u001a\u00020\u0001\"\b\b\u0000\u0010\u0002*\u00020\u0003\"\b\b\u0001\u0010\u0004*\u00020\u00032\u0006\u0010\u0005\u001a\u0002H\u00022\u0006\u0010\u0006\u001a\u0002H\u0004H\n"}, m3636d2 = {"<anonymous>", "", "P", "", "T", "params", "value"}, m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
@DebugMetadata(m3644c = "com.robinhood.android.moria.network.BaseEndpoint$defaultSaveAction$1", m3645f = "Endpoint.kt", m3646l = {EnumC7081g.SDK_ASSET_ILLUSTRATION_SUPPORT_VALUE}, m3647m = "invokeSuspend")
/* renamed from: com.robinhood.android.moria.network.BaseEndpoint$defaultSaveAction$1, reason: use source file name */
/* loaded from: classes17.dex */
final class Endpoint3<P, T> extends ContinuationImpl7 implements Function3<P, T, Continuation<? super Unit>, Object> {
    final /* synthetic */ Function3<P, T, Continuation<? super Unit>, Object> $defaultSaveAction;
    /* synthetic */ Object L$0;
    /* synthetic */ Object L$1;
    int label;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    Endpoint3(Function3<? super P, ? super T, ? super Continuation<? super Unit>, ? extends Object> function3, Continuation<? super Endpoint3> continuation) {
        super(3, continuation);
        this.$defaultSaveAction = function3;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // kotlin.jvm.functions.Function3
    public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2, Continuation<? super Unit> continuation) {
        return invoke2((Endpoint3<P, T>) obj, obj2, continuation);
    }

    /* renamed from: invoke, reason: avoid collision after fix types in other method */
    public final Object invoke2(P p, T t, Continuation<? super Unit> continuation) {
        Endpoint3 endpoint3 = new Endpoint3(this.$defaultSaveAction, continuation);
        endpoint3.L$0 = p;
        endpoint3.L$1 = t;
        return endpoint3.invokeSuspend(Unit.INSTANCE);
    }

    /* compiled from: Endpoint.kt */
    @Metadata(m3635d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, m3636d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
    @DebugMetadata(m3644c = "com.robinhood.android.moria.network.BaseEndpoint$defaultSaveAction$1$1", m3645f = "Endpoint.kt", m3646l = {EnumC7081g.SDK_ASSET_ILLUSTRATION_PAYWITHPLAID_LOGO_VALUE}, m3647m = "invokeSuspend")
    /* renamed from: com.robinhood.android.moria.network.BaseEndpoint$defaultSaveAction$1$1 */
    static final class C222141 extends ContinuationImpl7 implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
        final /* synthetic */ Function3<P, T, Continuation<? super Unit>, Object> $defaultSaveAction;
        final /* synthetic */ P $params;
        final /* synthetic */ T $value;
        int label;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        C222141(Function3<? super P, ? super T, ? super Continuation<? super Unit>, ? extends Object> function3, P p, T t, Continuation<? super C222141> continuation) {
            super(2, continuation);
            this.$defaultSaveAction = function3;
            this.$params = p;
            this.$value = t;
        }

        @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            return new C222141(this.$defaultSaveAction, this.$params, this.$value, continuation);
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
            return ((C222141) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
        public final Object invokeSuspend(Object obj) {
            Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
            int i = this.label;
            if (i == 0) {
                ResultKt.throwOnFailure(obj);
                Function3<P, T, Continuation<? super Unit>, Object> function3 = this.$defaultSaveAction;
                P p = this.$params;
                T t = this.$value;
                this.label = 1;
                if (function3.invoke(p, t, this) == coroutine_suspended) {
                    return coroutine_suspended;
                }
            } else {
                if (i != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                ResultKt.throwOnFailure(obj);
            }
            return Unit.INSTANCE;
        }
    }

    @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
    public final Object invokeSuspend(Object obj) {
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i = this.label;
        if (i == 0) {
            ResultKt.throwOnFailure(obj);
            C222141 c222141 = new C222141(this.$defaultSaveAction, this.L$0, this.L$1, null);
            this.L$0 = null;
            this.label = 1;
            if (Suspend.withIO$default(null, c222141, this, 1, null) == coroutine_suspended) {
                return coroutine_suspended;
            }
        } else {
            if (i != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            ResultKt.throwOnFailure(obj);
        }
        return Unit.INSTANCE;
    }
}
