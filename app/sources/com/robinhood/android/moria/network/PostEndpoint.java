package com.robinhood.android.moria.network;

import com.robinhood.android.common.util.analytics.AnalyticsStrings;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.functions.Function3;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.flow.Flow;
import p479j$.time.Duration;

/* compiled from: PostEndpoint.kt */
@Metadata(m3635d1 = {"\u00002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0003\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0007\bf\u0018\u0000 \u0016*\u0004\b\u0000\u0010\u0001*\b\b\u0001\u0010\u0003*\u00020\u00022\u00020\u0002:\u0001\u0016JD\u0010\t\u001a\u00028\u00012\u0006\u0010\u0004\u001a\u00028\u00002*\b\u0002\u0010\b\u001a$\b\u0001\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u0001\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00070\u0006\u0012\u0006\u0012\u0004\u0018\u00010\u00020\u0005H¦@¢\u0006\u0004\b\t\u0010\nJS\u0010\u000e\u001a\b\u0012\u0004\u0012\u00028\u00010\r2\u0006\u0010\u0004\u001a\u00028\u00002\b\b\u0002\u0010\f\u001a\u00020\u000b2*\b\u0002\u0010\b\u001a$\b\u0001\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u0001\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00070\u0006\u0012\u0006\u0012\u0004\u0018\u00010\u00020\u0005H&¢\u0006\u0004\b\u000e\u0010\u000fJi\u0010\u0011\u001a\b\u0012\u0004\u0012\u00028\u00010\r2\u001c\u0010\u0004\u001a\u0018\b\u0001\u0012\n\u0012\b\u0012\u0004\u0012\u00028\u00000\u0006\u0012\u0006\u0012\u0004\u0018\u00010\u00020\u00102\b\b\u0002\u0010\f\u001a\u00020\u000b2*\b\u0002\u0010\b\u001a$\b\u0001\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u0001\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00070\u0006\u0012\u0006\u0012\u0004\u0018\u00010\u00020\u0005H&¢\u0006\u0004\b\u0011\u0010\u0012R6\u0010\u0015\u001a$\b\u0001\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u0001\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00070\u0006\u0012\u0006\u0012\u0004\u0018\u00010\u00020\u00058&X¦\u0004¢\u0006\u0006\u001a\u0004\b\u0013\u0010\u0014¨\u0006\u0017"}, m3636d2 = {"Lcom/robinhood/android/moria/network/PostEndpoint;", "P", "", "T", "params", "Lkotlin/Function3;", "Lkotlin/coroutines/Continuation;", "", "saveAction", "post", "(Ljava/lang/Object;Lkotlin/jvm/functions/Function3;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "j$/time/Duration", "duration", "Lkotlinx/coroutines/flow/Flow;", "poll", "(Ljava/lang/Object;Lj$/time/Duration;Lkotlin/jvm/functions/Function3;)Lkotlinx/coroutines/flow/Flow;", "Lkotlin/Function1;", "pollWithDynamicParams", "(Lkotlin/jvm/functions/Function1;Lj$/time/Duration;Lkotlin/jvm/functions/Function3;)Lkotlinx/coroutines/flow/Flow;", "getDefaultSaveAction", "()Lkotlin/jvm/functions/Function3;", "defaultSaveAction", "Companion", "lib-moria"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
/* loaded from: classes17.dex */
public interface PostEndpoint<P, T> {

    /* renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE = Companion.$$INSTANCE;

    Function3<P, T, Continuation<? super Unit>, Object> getDefaultSaveAction();

    Flow<T> poll(P params, Duration duration, Function3<? super P, ? super T, ? super Continuation<? super Unit>, ? extends Object> saveAction);

    Flow<T> pollWithDynamicParams(Function1<? super Continuation<? super P>, ? extends Object> params, Duration duration, Function3<? super P, ? super T, ? super Continuation<? super Unit>, ? extends Object> saveAction);

    Object post(P p, Function3<? super P, ? super T, ? super Continuation<? super Unit>, ? extends Object> function3, Continuation<? super T> continuation);

    /* compiled from: PostEndpoint.kt */
    @Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
    /* loaded from: classes8.dex */
    public static final class DefaultImpls {
        /* JADX WARN: Multi-variable type inference failed */
        public static /* synthetic */ Object post$default(PostEndpoint postEndpoint, Object obj, Function3 function3, Continuation continuation, int i, Object obj2) {
            if (obj2 != null) {
                throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: post");
            }
            if ((i & 2) != 0) {
                function3 = postEndpoint.getDefaultSaveAction();
            }
            return postEndpoint.post(obj, function3, continuation);
        }

        /* JADX WARN: Multi-variable type inference failed */
        public static /* synthetic */ Flow poll$default(PostEndpoint postEndpoint, Object obj, Duration duration, Function3 function3, int i, Object obj2) {
            if (obj2 != null) {
                throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: poll");
            }
            if ((i & 2) != 0) {
                duration = Duration.ofSeconds(5L);
            }
            if ((i & 4) != 0) {
                function3 = postEndpoint.getDefaultSaveAction();
            }
            return postEndpoint.poll(obj, duration, function3);
        }

        /* JADX WARN: Multi-variable type inference failed */
        public static /* synthetic */ Flow pollWithDynamicParams$default(PostEndpoint postEndpoint, Function1 function1, Duration duration, Function3 function3, int i, Object obj) {
            if (obj != null) {
                throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: pollWithDynamicParams");
            }
            if ((i & 2) != 0) {
                duration = Duration.ofSeconds(5L);
            }
            if ((i & 4) != 0) {
                function3 = postEndpoint.getDefaultSaveAction();
            }
            return postEndpoint.pollWithDynamicParams(function1, duration, function3);
        }
    }

    /* compiled from: PostEndpoint.kt */
    @Metadata(m3635d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003Jo\u0010\u0004\u001a\u000e\u0012\u0004\u0012\u0002H\u0006\u0012\u0004\u0012\u0002H\u00070\u0005\"\u0004\b\u0002\u0010\u0006\"\b\b\u0003\u0010\u0007*\u00020\u00012\"\u0010\b\u001a\u001e\b\u0001\u0012\u0004\u0012\u0002H\u0006\u0012\n\u0012\b\u0012\u0004\u0012\u0002H\u00070\n\u0012\u0006\u0012\u0004\u0018\u00010\u00010\t2\"\u0010\u000b\u001a\u001e\b\u0001\u0012\u0004\u0012\u0002H\u0007\u0012\n\u0012\b\u0012\u0004\u0012\u00020\f0\n\u0012\u0006\u0012\u0004\u0018\u00010\u00010\t¢\u0006\u0002\u0010\rJu\u0010\u000e\u001a\u000e\u0012\u0004\u0012\u0002H\u0006\u0012\u0004\u0012\u0002H\u00070\u0005\"\u0004\b\u0002\u0010\u0006\"\b\b\u0003\u0010\u0007*\u00020\u00012\"\u0010\b\u001a\u001e\b\u0001\u0012\u0004\u0012\u0002H\u0006\u0012\n\u0012\b\u0012\u0004\u0012\u0002H\u00070\n\u0012\u0006\u0012\u0004\u0018\u00010\u00010\t2(\u0010\u000b\u001a$\b\u0001\u0012\u0004\u0012\u0002H\u0006\u0012\u0004\u0012\u0002H\u0007\u0012\n\u0012\b\u0012\u0004\u0012\u00020\f0\n\u0012\u0006\u0012\u0004\u0018\u00010\u00010\u000f¢\u0006\u0002\u0010\u0010¨\u0006\u0011"}, m3636d2 = {"Lcom/robinhood/android/moria/network/PostEndpoint$Companion;", "", "<init>", "()V", AnalyticsStrings.BUTTON_NEW_LIST_CREATE, "Lcom/robinhood/android/moria/network/PostEndpoint;", "P", "T", "networkCall", "Lkotlin/Function2;", "Lkotlin/coroutines/Continuation;", "defaultSaveAction", "", "(Lkotlin/jvm/functions/Function2;Lkotlin/jvm/functions/Function2;)Lcom/robinhood/android/moria/network/PostEndpoint;", "createWithParams", "Lkotlin/Function3;", "(Lkotlin/jvm/functions/Function2;Lkotlin/jvm/functions/Function3;)Lcom/robinhood/android/moria/network/PostEndpoint;", "lib-moria"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    public static final class Companion {
        static final /* synthetic */ Companion $$INSTANCE = new Companion();

        private Companion() {
        }

        public final <P, T> PostEndpoint<P, T> create(Function2<? super P, ? super Continuation<? super T>, ? extends Object> networkCall, Function2<? super T, ? super Continuation<? super Unit>, ? extends Object> defaultSaveAction) {
            Intrinsics.checkNotNullParameter(networkCall, "networkCall");
            Intrinsics.checkNotNullParameter(defaultSaveAction, "defaultSaveAction");
            return new PostEndpoint3(networkCall, new PostEndpoint2(defaultSaveAction, null));
        }

        public final <P, T> PostEndpoint<P, T> createWithParams(Function2<? super P, ? super Continuation<? super T>, ? extends Object> networkCall, Function3<? super P, ? super T, ? super Continuation<? super Unit>, ? extends Object> defaultSaveAction) {
            Intrinsics.checkNotNullParameter(networkCall, "networkCall");
            Intrinsics.checkNotNullParameter(defaultSaveAction, "defaultSaveAction");
            return new PostEndpoint3(networkCall, defaultSaveAction);
        }
    }
}
