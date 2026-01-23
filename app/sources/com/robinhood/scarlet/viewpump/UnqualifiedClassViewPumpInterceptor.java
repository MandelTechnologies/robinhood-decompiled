package com.robinhood.scarlet.viewpump;

import android.content.Context;
import android.util.AttributeSet;
import com.robinhood.android.common.util.TransitionReason;
import com.robinhood.scarlet.view.UnqualifiedClassTag;
import io.github.inflationx.viewpump.InflateRequest;
import io.github.inflationx.viewpump.InflateResult;
import io.github.inflationx.viewpump.Interceptor;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: UnqualifiedClassViewPumpInterceptor.kt */
@Metadata(m3635d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\bÇ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0010\u0010\u0004\u001a\u00020\u00052\u0006\u0010\u0006\u001a\u00020\u0007H\u0016¨\u0006\b"}, m3636d2 = {"Lcom/robinhood/scarlet/viewpump/UnqualifiedClassViewPumpInterceptor;", "Lio/github/inflationx/viewpump/Interceptor;", "<init>", "()V", "intercept", "Lio/github/inflationx/viewpump/InflateResult;", TransitionReason.OPTION_TRADE_CHAIN, "Lio/github/inflationx/viewpump/Interceptor$Chain;", "lib-scarlet_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
/* loaded from: classes21.dex */
public final class UnqualifiedClassViewPumpInterceptor implements Interceptor {
    public static final int $stable = 0;
    public static final UnqualifiedClassViewPumpInterceptor INSTANCE = new UnqualifiedClassViewPumpInterceptor();

    private UnqualifiedClassViewPumpInterceptor() {
    }

    @Override // io.github.inflationx.viewpump.Interceptor
    public InflateResult intercept(Interceptor.Chain chain) {
        Intrinsics.checkNotNullParameter(chain, "chain");
        InflateRequest request = chain.getRequest();
        String name = request.getName();
        AttributeSet attrs = request.getAttrs();
        UnqualifiedClassTag unqualifiedClassTagFrom = UnqualifiedClassTag.INSTANCE.from(name, attrs);
        if (unqualifiedClassTagFrom == null) {
            return chain.proceed(request);
        }
        Context context = request.getContext();
        return new InflateResult(unqualifiedClassTagFrom.create(context, attrs), name, context, attrs);
    }
}
