package com.robinhood.android.moria.network;

import com.plaid.internal.EnumC7081g;
import com.robinhood.android.moria.network.bouncer.internal.DebounceDecider;
import com.robinhood.android.moria.network.bouncer.internal.MetadataMap;
import com.robinhood.android.moria.network.bouncer.internal.RealMetadataMap;
import com.robinhood.coroutines.flow.ErrorHandling3;
import com.robinhood.coroutines.flow.Polling2;
import com.robinhood.models.card.p311db.Card;
import com.robinhood.utils.LogoutKillswitch;
import com.robinhood.utils.extensions.ResourceTypes;
import com.robinhood.utils.extensions.Throwables;
import dispatch.core.Suspend;
import kotlin.Metadata;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.coroutines.jvm.internal.ContinuationImpl7;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.functions.Function3;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.BuildersKt__Builders_commonKt;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.Job;
import kotlinx.coroutines.flow.Flow;
import kotlinx.coroutines.flow.FlowKt;
import p479j$.time.Clock;
import p479j$.time.Duration;

/* compiled from: Endpoint.kt */
@Metadata(m3635d1 = {"\u0000^\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\b\u0002\n\u0002\u0010\t\n\u0002\u0010\u000b\n\u0002\b\n\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0002\u0018\u0000*\b\b\u0000\u0010\u0002*\u00020\u0001*\b\b\u0001\u0010\u0003*\u00020\u00012\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u00010\u0004B\u0091\u0001\u0012\"\u0010\u0007\u001a\u001e\b\u0001\u0012\u0004\u0012\u00028\u0000\u0012\n\u0012\b\u0012\u0004\u0012\u00028\u00010\u0006\u0012\u0006\u0012\u0004\u0018\u00010\u00010\u0005\u0012\u0006\u0010\t\u001a\u00020\b\u0012(\u0010\f\u001a$\b\u0001\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u0001\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u000b0\u0006\u0012\u0006\u0012\u0004\u0018\u00010\u00010\n\u0012\u0006\u0010\u000e\u001a\u00020\r\u0012*\u0010\u0011\u001a&\b\u0001\u0012\u0006\u0012\u0004\u0018\u00010\u000f\u0012\u0004\u0012\u00028\u0000\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00100\u0006\u0012\u0006\u0012\u0004\u0018\u00010\u00010\n¢\u0006\u0004\b\u0012\u0010\u0013J\u0018\u0010\u0015\u001a\u00028\u00012\u0006\u0010\u0014\u001a\u00028\u0000H\u0096@¢\u0006\u0004\b\u0015\u0010\u0016JB\u0010\u0018\u001a\u00028\u00012\u0006\u0010\u0014\u001a\u00028\u00002(\u0010\u0017\u001a$\b\u0001\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u0001\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u000b0\u0006\u0012\u0006\u0012\u0004\u0018\u00010\u00010\nH\u0096@¢\u0006\u0004\b\u0018\u0010\u0019JD\u0010\u001a\u001a\u0004\u0018\u00018\u00012\u0006\u0010\u0014\u001a\u00028\u00002(\u0010\u0017\u001a$\b\u0001\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u0001\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u000b0\u0006\u0012\u0006\u0012\u0004\u0018\u00010\u00010\nH\u0096@¢\u0006\u0004\b\u001a\u0010\u0019JO\u0010\u001e\u001a\b\u0012\u0004\u0012\u00028\u00010\u001d2\u0006\u0010\u0014\u001a\u00028\u00002\u0006\u0010\u001c\u001a\u00020\u001b2(\u0010\u0017\u001a$\b\u0001\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u0001\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u000b0\u0006\u0012\u0006\u0012\u0004\u0018\u00010\u00010\nH\u0016¢\u0006\u0004\b\u001e\u0010\u001fJe\u0010!\u001a\b\u0012\u0004\u0012\u00028\u00010\u001d2\u001c\u0010\u0014\u001a\u0018\b\u0001\u0012\n\u0012\b\u0012\u0004\u0012\u00028\u00000\u0006\u0012\u0006\u0012\u0004\u0018\u00010\u00010 2\u0006\u0010\u001c\u001a\u00020\u001b2(\u0010\u0017\u001a$\b\u0001\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u0001\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u000b0\u0006\u0012\u0006\u0012\u0004\u0018\u00010\u00010\nH\u0016¢\u0006\u0004\b!\u0010\"JI\u0010%\u001a\u00020$2\u0006\u0010\u0014\u001a\u00028\u00002\u0006\u0010#\u001a\u00020\u00102(\u0010\u0017\u001a$\b\u0001\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u0001\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u000b0\u0006\u0012\u0006\u0012\u0004\u0018\u00010\u00010\nH\u0016¢\u0006\u0004\b%\u0010&J\u000f\u0010'\u001a\u00020\u000bH\u0016¢\u0006\u0004\b'\u0010(R0\u0010\u0007\u001a\u001e\b\u0001\u0012\u0004\u0012\u00028\u0000\u0012\n\u0012\b\u0012\u0004\u0012\u00028\u00010\u0006\u0012\u0006\u0012\u0004\u0018\u00010\u00010\u00058\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0007\u0010)R\u0014\u0010\t\u001a\u00020\b8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\t\u0010*R>\u0010\u0011\u001a&\b\u0001\u0012\u0006\u0012\u0004\u0018\u00010\u000f\u0012\u0004\u0012\u00028\u0000\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00100\u0006\u0012\u0006\u0012\u0004\u0018\u00010\u00010\n8\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u0011\u0010+\u001a\u0004\b,\u0010-R\u001a\u0010/\u001a\b\u0012\u0004\u0012\u00028\u00000.8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b/\u00100R<\u0010\f\u001a$\b\u0001\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u0001\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u000b0\u0006\u0012\u0006\u0012\u0004\u0018\u00010\u00010\n8\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\f\u0010+\u001a\u0004\b1\u0010-¨\u00062"}, m3636d2 = {"Lcom/robinhood/android/moria/network/BaseEndpoint;", "", "P", "T", "Lcom/robinhood/android/moria/network/Endpoint;", "Lkotlin/Function2;", "Lkotlin/coroutines/Continuation;", "networkCall", "Lcom/robinhood/utils/LogoutKillswitch;", "logoutKillswitch", "Lkotlin/Function3;", "", "defaultSaveAction", "j$/time/Clock", Card.Icon.CLOCK, "", "", "staleDecider", "<init>", "(Lkotlin/jvm/functions/Function2;Lcom/robinhood/utils/LogoutKillswitch;Lkotlin/jvm/functions/Function3;Lj$/time/Clock;Lkotlin/jvm/functions/Function3;)V", "params", ResourceTypes.RAW, "(Ljava/lang/Object;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "saveAction", "forceFetch", "(Ljava/lang/Object;Lkotlin/jvm/functions/Function3;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "fetch", "j$/time/Duration", "duration", "Lkotlinx/coroutines/flow/Flow;", "poll", "(Ljava/lang/Object;Lj$/time/Duration;Lkotlin/jvm/functions/Function3;)Lkotlinx/coroutines/flow/Flow;", "Lkotlin/Function1;", "pollWithDynamicParams", "(Lkotlin/jvm/functions/Function1;Lj$/time/Duration;Lkotlin/jvm/functions/Function3;)Lkotlinx/coroutines/flow/Flow;", "force", "Lkotlinx/coroutines/Job;", "refresh", "(Ljava/lang/Object;ZLkotlin/jvm/functions/Function3;)Lkotlinx/coroutines/Job;", "markAllParamsAsStale", "()V", "Lkotlin/jvm/functions/Function2;", "Lcom/robinhood/utils/LogoutKillswitch;", "Lkotlin/jvm/functions/Function3;", "getStaleDecider", "()Lkotlin/jvm/functions/Function3;", "Lcom/robinhood/android/moria/network/bouncer/internal/MetadataMap;", "metadataMap", "Lcom/robinhood/android/moria/network/bouncer/internal/MetadataMap;", "getDefaultSaveAction", "lib-moria"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
/* renamed from: com.robinhood.android.moria.network.BaseEndpoint, reason: use source file name */
/* loaded from: classes17.dex */
final class Endpoint2<P, T> implements Endpoint<P, T> {
    private final Function3<P, T, Continuation<? super Unit>, Object> defaultSaveAction;
    private final LogoutKillswitch logoutKillswitch;
    private final MetadataMap<P> metadataMap;
    private final Function2<P, Continuation<? super T>, Object> networkCall;
    private final Function3<Long, P, Continuation<? super Boolean>, Object> staleDecider;

    /* compiled from: Endpoint.kt */
    @Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
    @DebugMetadata(m3644c = "com.robinhood.android.moria.network.BaseEndpoint", m3645f = "Endpoint.kt", m3646l = {182, 182}, m3647m = "fetch")
    /* renamed from: com.robinhood.android.moria.network.BaseEndpoint$fetch$1 */
    /* loaded from: classes8.dex */
    static final class C222151 extends ContinuationImpl {
        Object L$0;
        Object L$1;
        int label;
        /* synthetic */ Object result;
        final /* synthetic */ Endpoint2<P, T> this$0;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        C222151(Endpoint2<P, T> endpoint2, Continuation<? super C222151> continuation) {
            super(continuation);
            this.this$0 = endpoint2;
        }

        @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
        public final Object invokeSuspend(Object obj) {
            this.result = obj;
            this.label |= Integer.MIN_VALUE;
            return this.this$0.fetch(null, null, this);
        }
    }

    /* compiled from: Endpoint.kt */
    @Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
    @DebugMetadata(m3644c = "com.robinhood.android.moria.network.BaseEndpoint", m3645f = "Endpoint.kt", m3646l = {EnumC7081g.SDK_ASSET_ILLUSTRATION_CONSENT_HEADER_WEB3_DARK_APPEARANCE_VALUE, EnumC7081g.SDK_ASSET_ILLUSTRATION_NETWORK_SWITCH_VALUE}, m3647m = "forceFetch")
    /* renamed from: com.robinhood.android.moria.network.BaseEndpoint$forceFetch$1 */
    static final class C222161 extends ContinuationImpl {
        Object L$0;
        Object L$1;
        int label;
        /* synthetic */ Object result;
        final /* synthetic */ Endpoint2<P, T> this$0;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        C222161(Endpoint2<P, T> endpoint2, Continuation<? super C222161> continuation) {
            super(continuation);
            this.this$0 = endpoint2;
        }

        @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
        public final Object invokeSuspend(Object obj) {
            this.result = obj;
            this.label |= Integer.MIN_VALUE;
            return this.this$0.forceFetch(null, null, this);
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public Endpoint2(Function2<? super P, ? super Continuation<? super T>, ? extends Object> networkCall, LogoutKillswitch logoutKillswitch, Function3<? super P, ? super T, ? super Continuation<? super Unit>, ? extends Object> defaultSaveAction, Clock clock, Function3<? super Long, ? super P, ? super Continuation<? super Boolean>, ? extends Object> staleDecider) {
        Intrinsics.checkNotNullParameter(networkCall, "networkCall");
        Intrinsics.checkNotNullParameter(logoutKillswitch, "logoutKillswitch");
        Intrinsics.checkNotNullParameter(defaultSaveAction, "defaultSaveAction");
        Intrinsics.checkNotNullParameter(clock, "clock");
        Intrinsics.checkNotNullParameter(staleDecider, "staleDecider");
        this.networkCall = networkCall;
        this.logoutKillswitch = logoutKillswitch;
        this.staleDecider = staleDecider;
        this.metadataMap = new RealMetadataMap(clock);
        this.defaultSaveAction = new Endpoint3(defaultSaveAction, null);
    }

    @Override // com.robinhood.android.moria.network.Endpoint
    public Function3<Long, P, Continuation<? super Boolean>, Object> getStaleDecider() {
        return this.staleDecider;
    }

    @Override // com.robinhood.android.moria.network.Endpoint
    public Function3<P, T, Continuation<? super Unit>, Object> getDefaultSaveAction() {
        return this.defaultSaveAction;
    }

    @Override // com.robinhood.android.moria.network.Endpoint
    public Object raw(P p, Continuation<? super T> continuation) {
        return this.metadataMap.track(p, this.networkCall, continuation);
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    @Override // com.robinhood.android.moria.network.Endpoint
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public Object forceFetch(P p, Function3<? super P, ? super T, ? super Continuation<? super Unit>, ? extends Object> function3, Continuation<? super T> continuation) {
        C222161 c222161;
        if (continuation instanceof C222161) {
            c222161 = (C222161) continuation;
            int i = c222161.label;
            if ((i & Integer.MIN_VALUE) != 0) {
                c222161.label = i - Integer.MIN_VALUE;
            } else {
                c222161 = new C222161(this, continuation);
            }
        }
        Object objRaw = c222161.result;
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i2 = c222161.label;
        if (i2 == 0) {
            ResultKt.throwOnFailure(objRaw);
            c222161.L$0 = p;
            c222161.L$1 = function3;
            c222161.label = 1;
            objRaw = raw(p, c222161);
            if (objRaw != coroutine_suspended) {
            }
        }
        if (i2 != 1) {
            if (i2 != 2) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            Object obj = c222161.L$0;
            ResultKt.throwOnFailure(objRaw);
            return obj;
        }
        function3 = (Function3) c222161.L$1;
        p = (P) c222161.L$0;
        ResultKt.throwOnFailure(objRaw);
        Endpoint4 endpoint4 = new Endpoint4(function3, p, objRaw, null);
        c222161.L$0 = objRaw;
        c222161.L$1 = null;
        c222161.label = 2;
        return Suspend.withIO$default(null, endpoint4, c222161, 1, null) == coroutine_suspended ? coroutine_suspended : objRaw;
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    @Override // com.robinhood.android.moria.network.Endpoint
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public Object fetch(P p, Function3<? super P, ? super T, ? super Continuation<? super Unit>, ? extends Object> function3, Continuation<? super T> continuation) {
        C222151 c222151;
        if (continuation instanceof C222151) {
            c222151 = (C222151) continuation;
            int i = c222151.label;
            if ((i & Integer.MIN_VALUE) != 0) {
                c222151.label = i - Integer.MIN_VALUE;
            } else {
                c222151 = new C222151(this, continuation);
            }
        }
        Object objInvoke2 = c222151.result;
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i2 = c222151.label;
        if (i2 == 0) {
            ResultKt.throwOnFailure(objInvoke2);
            DebounceDecider debounceDecider = new DebounceDecider(this.metadataMap.getMetadata(p), getStaleDecider());
            c222151.L$0 = p;
            c222151.L$1 = function3;
            c222151.label = 1;
            objInvoke2 = debounceDecider.invoke2((DebounceDecider) p, (Continuation<? super Boolean>) c222151);
            if (objInvoke2 != coroutine_suspended) {
            }
        }
        if (i2 != 1) {
            if (i2 != 2) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            ResultKt.throwOnFailure(objInvoke2);
            return objInvoke2;
        }
        function3 = (Function3) c222151.L$1;
        p = (P) c222151.L$0;
        ResultKt.throwOnFailure(objInvoke2);
        if (((Boolean) objInvoke2).booleanValue()) {
            return null;
        }
        c222151.L$0 = null;
        c222151.L$1 = null;
        c222151.label = 2;
        Object objForceFetch = forceFetch(p, function3, c222151);
        return objForceFetch == coroutine_suspended ? coroutine_suspended : objForceFetch;
    }

    /* compiled from: Endpoint.kt */
    @Metadata(m3635d1 = {"\u0000\b\n\u0002\b\u0002\n\u0002\u0010\u0000\u0010\u0000\u001a\u0002H\u0001\"\b\b\u0000\u0010\u0001*\u00020\u0002H\n"}, m3636d2 = {"<anonymous>", "P", ""}, m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
    @DebugMetadata(m3644c = "com.robinhood.android.moria.network.BaseEndpoint$poll$1", m3645f = "Endpoint.kt", m3646l = {}, m3647m = "invokeSuspend")
    /* renamed from: com.robinhood.android.moria.network.BaseEndpoint$poll$1 */
    /* loaded from: classes8.dex */
    static final class C222171 extends ContinuationImpl7 implements Function1<Continuation<? super P>, Object> {
        final /* synthetic */ P $params;
        int label;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        C222171(P p, Continuation<? super C222171> continuation) {
            super(1, continuation);
            this.$params = p;
        }

        @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
        public final Continuation<Unit> create(Continuation<?> continuation) {
            return new C222171(this.$params, continuation);
        }

        @Override // kotlin.jvm.functions.Function1
        public final Object invoke(Continuation<? super P> continuation) {
            return ((C222171) create(continuation)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
        public final Object invokeSuspend(Object obj) {
            IntrinsicsKt.getCOROUTINE_SUSPENDED();
            if (this.label != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            ResultKt.throwOnFailure(obj);
            return this.$params;
        }
    }

    @Override // com.robinhood.android.moria.network.Endpoint
    public Flow<T> poll(P params, Duration duration, Function3<? super P, ? super T, ? super Continuation<? super Unit>, ? extends Object> saveAction) {
        Intrinsics.checkNotNullParameter(params, "params");
        Intrinsics.checkNotNullParameter(duration, "duration");
        Intrinsics.checkNotNullParameter(saveAction, "saveAction");
        return pollWithDynamicParams(new C222171(params, null), duration, saveAction);
    }

    /* compiled from: Endpoint.kt */
    @Metadata(m3635d1 = {"\u0000\b\n\u0002\b\u0002\n\u0002\u0010\u0000\u0010\u0000\u001a\u0002H\u0001\"\b\b\u0000\u0010\u0001*\u00020\u0002H\n"}, m3636d2 = {"<anonymous>", "T", ""}, m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
    @DebugMetadata(m3644c = "com.robinhood.android.moria.network.BaseEndpoint$pollWithDynamicParams$1", m3645f = "Endpoint.kt", m3646l = {EnumC7081g.SDK_ASSET_ICON_CANCEL_VALUE, EnumC7081g.SDK_ASSET_ICON_CANCEL_VALUE}, m3647m = "invokeSuspend")
    /* renamed from: com.robinhood.android.moria.network.BaseEndpoint$pollWithDynamicParams$1 */
    /* loaded from: classes8.dex */
    static final class C222181 extends ContinuationImpl7 implements Function1<Continuation<? super T>, Object> {
        final /* synthetic */ Function1<Continuation<? super P>, Object> $params;
        final /* synthetic */ Function3<P, T, Continuation<? super Unit>, Object> $saveAction;
        Object L$0;
        int label;
        final /* synthetic */ Endpoint2<P, T> this$0;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        C222181(Endpoint2<P, T> endpoint2, Function1<? super Continuation<? super P>, ? extends Object> function1, Function3<? super P, ? super T, ? super Continuation<? super Unit>, ? extends Object> function3, Continuation<? super C222181> continuation) {
            super(1, continuation);
            this.this$0 = endpoint2;
            this.$params = function1;
            this.$saveAction = function3;
        }

        @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
        public final Continuation<Unit> create(Continuation<?> continuation) {
            return new C222181(this.this$0, this.$params, this.$saveAction, continuation);
        }

        @Override // kotlin.jvm.functions.Function1
        public final Object invoke(Continuation<? super T> continuation) {
            return ((C222181) create(continuation)).invokeSuspend(Unit.INSTANCE);
        }

        /* JADX WARN: Multi-variable type inference failed */
        /* JADX WARN: Type inference failed for: r1v2, types: [com.robinhood.android.moria.network.BaseEndpoint] */
        /* JADX WARN: Type inference failed for: r1v7 */
        /* JADX WARN: Type inference failed for: r1v8 */
        @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
        public final Object invokeSuspend(Object obj) {
            ?? r1;
            Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
            int i = this.label;
            if (i == 0) {
                ResultKt.throwOnFailure(obj);
                Endpoint2<P, T> endpoint2 = this.this$0;
                Function1<Continuation<? super P>, Object> function1 = this.$params;
                this.L$0 = endpoint2;
                this.label = 1;
                obj = function1.invoke(this);
                r1 = endpoint2;
                if (obj != coroutine_suspended) {
                }
            }
            if (i != 1) {
                if (i != 2) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                ResultKt.throwOnFailure(obj);
                return obj;
            }
            boolean z = (Endpoint2<P, T>) ((Endpoint2) this.L$0);
            ResultKt.throwOnFailure(obj);
            r1 = z;
            Function3<P, T, Continuation<? super Unit>, Object> function3 = this.$saveAction;
            this.L$0 = null;
            this.label = 2;
            Object objForceFetch = r1.forceFetch(obj, function3, this);
            return objForceFetch == coroutine_suspended ? coroutine_suspended : objForceFetch;
        }
    }

    @Override // com.robinhood.android.moria.network.Endpoint
    public Flow<T> pollWithDynamicParams(Function1<? super Continuation<? super P>, ? extends Object> params, Duration duration, Function3<? super P, ? super T, ? super Continuation<? super Unit>, ? extends Object> saveAction) {
        Intrinsics.checkNotNullParameter(params, "params");
        Intrinsics.checkNotNullParameter(duration, "duration");
        Intrinsics.checkNotNullParameter(saveAction, "saveAction");
        return FlowKt.filterNotNull(ErrorHandling3.ignoreNetworkExceptions(Polling2.networkPoll(duration, new C222181(this, params, saveAction, null)), duration));
    }

    /* compiled from: Endpoint.kt */
    @Metadata(m3635d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, m3636d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
    @DebugMetadata(m3644c = "com.robinhood.android.moria.network.BaseEndpoint$refresh$1", m3645f = "Endpoint.kt", m3646l = {EnumC7081g.SDK_ASSET_ICON_INCOMPLETE_VALUE, EnumC7081g.SDK_ASSET_ICON_INCOMPLETE_VALUE}, m3647m = "invokeSuspend")
    /* renamed from: com.robinhood.android.moria.network.BaseEndpoint$refresh$1 */
    static final class C222191 extends ContinuationImpl7 implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
        final /* synthetic */ boolean $force;
        final /* synthetic */ P $params;
        final /* synthetic */ Function3<P, T, Continuation<? super Unit>, Object> $saveAction;
        int label;
        final /* synthetic */ Endpoint2<P, T> this$0;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        C222191(boolean z, Endpoint2<P, T> endpoint2, P p, Function3<? super P, ? super T, ? super Continuation<? super Unit>, ? extends Object> function3, Continuation<? super C222191> continuation) {
            super(2, continuation);
            this.$force = z;
            this.this$0 = endpoint2;
            this.$params = p;
            this.$saveAction = function3;
        }

        @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            return new C222191(this.$force, this.this$0, this.$params, this.$saveAction, continuation);
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
            return ((C222191) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        /* JADX WARN: Code restructure failed: missing block: B:19:0x003e, code lost:
        
            if (r5.fetch(r1, r3, r4) == r0) goto L20;
         */
        /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:22:0x0045 -> B:23:0x0047). Please report as a decompilation issue!!! */
        @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
        /*
            Code decompiled incorrectly, please refer to instructions dump.
        */
        public final Object invokeSuspend(Object obj) throws Exception {
            Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
            int i = this.label;
            try {
                if (i == 0) {
                    ResultKt.throwOnFailure(obj);
                    if (this.$force) {
                        Endpoint2<P, T> endpoint2 = this.this$0;
                        P p = this.$params;
                        Function3<P, T, Continuation<? super Unit>, Object> function3 = this.$saveAction;
                        this.label = 1;
                        if (endpoint2.forceFetch(p, function3, this) == coroutine_suspended) {
                            return coroutine_suspended;
                        }
                    } else {
                        Endpoint2<P, T> endpoint22 = this.this$0;
                        P p2 = this.$params;
                        Function3<P, T, Continuation<? super Unit>, Object> function32 = this.$saveAction;
                        this.label = 2;
                    }
                } else {
                    if (i != 1 && i != 2) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    ResultKt.throwOnFailure(obj);
                }
            } catch (Exception e) {
                if (!Throwables.isNetworkRelated(e)) {
                    throw e;
                }
            }
            return Unit.INSTANCE;
        }
    }

    @Override // com.robinhood.android.moria.network.Endpoint
    public Job refresh(P params, boolean force, Function3<? super P, ? super T, ? super Continuation<? super Unit>, ? extends Object> saveAction) {
        Intrinsics.checkNotNullParameter(params, "params");
        Intrinsics.checkNotNullParameter(saveAction, "saveAction");
        return BuildersKt__Builders_commonKt.launch$default(this.logoutKillswitch.getLoggedInScope(), null, null, new C222191(force, this, params, saveAction, null), 3, null);
    }

    @Override // com.robinhood.android.moria.network.Endpoint
    public void markAllParamsAsStale() {
        this.metadataMap.clearMap();
    }
}
