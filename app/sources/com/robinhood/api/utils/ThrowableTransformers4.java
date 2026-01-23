package com.robinhood.api.utils;

import com.robinhood.api.utils.RhCallAdapterFactory;
import com.robinhood.experiments.Experiment;
import com.robinhood.experiments.ExperimentsProvider;
import com.robinhood.utils.coroutines.scope.RootCoroutineScope;
import com.robinhood.utils.p408rx.ScopedSubscriptionKt;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.CoroutineScope;
import okhttp3.Request;

/* compiled from: ThrowableTransformers.kt */
@kotlin.Metadata(m3635d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010\u0003\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0007\u0018\u00002\u00020\u0001B/\b\u0007\u0012\b\b\u0001\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\b\b\u0001\u0010\u0006\u001a\u00020\u0001\u0012\b\b\u0001\u0010\u0007\u001a\u00020\u0001¢\u0006\u0004\b\b\u0010\tJ\u0018\u0010\u000b\u001a\u00020\f2\u0006\u0010\r\u001a\u00020\u000e2\u0006\u0010\u000f\u001a\u00020\fH\u0016R\u000e\u0010\u0006\u001a\u00020\u0001X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0007\u001a\u00020\u0001X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\n\u001a\u00020\u0001X\u0082\u000e¢\u0006\u0002\n\u0000¨\u0006\u0010"}, m3636d2 = {"Lcom/robinhood/api/utils/SwitchingThrowableTransformer;", "Lcom/robinhood/api/utils/RhCallAdapterFactory$ThrowableTransformer;", "coroutineScope", "Lkotlinx/coroutines/CoroutineScope;", "experimentsProvider", "Lcom/robinhood/experiments/ExperimentsProvider;", "remoteConfigThrowableTransformer", "malformedResponseThrowableTransformer", "<init>", "(Lkotlinx/coroutines/CoroutineScope;Lcom/robinhood/experiments/ExperimentsProvider;Lcom/robinhood/api/utils/RhCallAdapterFactory$ThrowableTransformer;Lcom/robinhood/api/utils/RhCallAdapterFactory$ThrowableTransformer;)V", "delegate", "transform", "", "request", "Lokhttp3/Request;", "throwable", "lib-api_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
/* renamed from: com.robinhood.api.utils.SwitchingThrowableTransformer, reason: use source file name */
/* loaded from: classes20.dex */
public final class ThrowableTransformers4 implements RhCallAdapterFactory.ThrowableTransformer {
    private volatile RhCallAdapterFactory.ThrowableTransformer delegate;
    private final RhCallAdapterFactory.ThrowableTransformer malformedResponseThrowableTransformer;
    private final RhCallAdapterFactory.ThrowableTransformer remoteConfigThrowableTransformer;

    public ThrowableTransformers4(@RootCoroutineScope CoroutineScope coroutineScope, ExperimentsProvider experimentsProvider, @ThrowableTransformers7 RhCallAdapterFactory.ThrowableTransformer remoteConfigThrowableTransformer, @ThrowableTransformers6 RhCallAdapterFactory.ThrowableTransformer malformedResponseThrowableTransformer) {
        Intrinsics.checkNotNullParameter(coroutineScope, "coroutineScope");
        Intrinsics.checkNotNullParameter(experimentsProvider, "experimentsProvider");
        Intrinsics.checkNotNullParameter(remoteConfigThrowableTransformer, "remoteConfigThrowableTransformer");
        Intrinsics.checkNotNullParameter(malformedResponseThrowableTransformer, "malformedResponseThrowableTransformer");
        this.remoteConfigThrowableTransformer = remoteConfigThrowableTransformer;
        this.malformedResponseThrowableTransformer = malformedResponseThrowableTransformer;
        this.delegate = remoteConfigThrowableTransformer;
        ScopedSubscriptionKt.subscribeIn(ExperimentsProvider.DefaultImpls.streamState$default(experimentsProvider, new Experiment[]{ThrowableTransformers2.INSTANCE}, false, null, 6, null), coroutineScope, new Function1() { // from class: com.robinhood.api.utils.SwitchingThrowableTransformer$$ExternalSyntheticLambda0
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return ThrowableTransformers4._init_$lambda$0(this.f$0, ((Boolean) obj).booleanValue());
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit _init_$lambda$0(ThrowableTransformers4 throwableTransformers4, boolean z) {
        throwableTransformers4.delegate = z ? throwableTransformers4.malformedResponseThrowableTransformer : throwableTransformers4.remoteConfigThrowableTransformer;
        return Unit.INSTANCE;
    }

    @Override // com.robinhood.api.utils.RhCallAdapterFactory.ThrowableTransformer
    public Throwable transform(Request request, Throwable throwable) {
        Intrinsics.checkNotNullParameter(request, "request");
        Intrinsics.checkNotNullParameter(throwable, "throwable");
        return this.delegate.transform(request, throwable);
    }
}
