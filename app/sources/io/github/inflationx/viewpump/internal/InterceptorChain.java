package io.github.inflationx.viewpump.internal;

import com.robinhood.models.api.simulatedreturns.ApiOptionSimulatedReturnsConfigurationV3Request;
import io.github.inflationx.viewpump.InflateRequest;
import io.github.inflationx.viewpump.InflateResult;
import io.github.inflationx.viewpump.Interceptor;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: -InterceptorChain.kt */
@Metadata(m3635d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\b\u0000\u0018\u00002\u00020\u0001B#\u0012\f\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003\u0012\u0006\u0010\u0005\u001a\u00020\u0006\u0012\u0006\u0010\u0007\u001a\u00020\b¢\u0006\u0002\u0010\tJ\u0010\u0010\n\u001a\u00020\u000b2\u0006\u0010\u0007\u001a\u00020\bH\u0016J\b\u0010\u0007\u001a\u00020\bH\u0016R\u000e\u0010\u0005\u001a\u00020\u0006X\u0082\u0004¢\u0006\u0002\n\u0000R\u0014\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0007\u001a\u00020\bX\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006\f"}, m3636d2 = {"Lio/github/inflationx/viewpump/internal/-InterceptorChain;", "Lio/github/inflationx/viewpump/Interceptor$Chain;", "interceptors", "", "Lio/github/inflationx/viewpump/Interceptor;", ApiOptionSimulatedReturnsConfigurationV3Request.ApiOptionUnderlying.TYPE_INDEX, "", "request", "Lio/github/inflationx/viewpump/InflateRequest;", "(Ljava/util/List;ILio/github/inflationx/viewpump/InflateRequest;)V", "proceed", "Lio/github/inflationx/viewpump/InflateResult;", "viewpump_release"}, m3637k = 1, m3638mv = {1, 8, 0}, m3640xi = 48)
/* renamed from: io.github.inflationx.viewpump.internal.-InterceptorChain, reason: invalid class name */
/* loaded from: classes21.dex */
public final class InterceptorChain implements Interceptor.Chain {
    private final int index;
    private final List<Interceptor> interceptors;
    private final InflateRequest request;

    /* JADX WARN: Multi-variable type inference failed */
    public InterceptorChain(List<? extends Interceptor> interceptors, int i, InflateRequest request) {
        Intrinsics.checkNotNullParameter(interceptors, "interceptors");
        Intrinsics.checkNotNullParameter(request, "request");
        this.interceptors = interceptors;
        this.index = i;
        this.request = request;
    }

    @Override // io.github.inflationx.viewpump.Interceptor.Chain
    /* renamed from: request, reason: from getter */
    public InflateRequest getRequest() {
        return this.request;
    }

    @Override // io.github.inflationx.viewpump.Interceptor.Chain
    public InflateResult proceed(InflateRequest request) {
        Intrinsics.checkNotNullParameter(request, "request");
        if (this.index >= this.interceptors.size()) {
            throw new AssertionError("no interceptors added to the chain");
        }
        return this.interceptors.get(this.index).intercept(new InterceptorChain(this.interceptors, this.index + 1, request));
    }
}
