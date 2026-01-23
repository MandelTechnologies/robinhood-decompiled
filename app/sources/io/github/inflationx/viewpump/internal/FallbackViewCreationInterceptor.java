package io.github.inflationx.viewpump.internal;

import android.content.Context;
import android.util.AttributeSet;
import android.view.View;
import com.robinhood.android.common.util.TransitionReason;
import io.github.inflationx.viewpump.FallbackViewCreator;
import io.github.inflationx.viewpump.InflateRequest;
import io.github.inflationx.viewpump.InflateResult;
import io.github.inflationx.viewpump.Interceptor;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: -FallbackViewCreationInterceptor.kt */
@Metadata(m3635d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\b\u0000\u0018\u00002\u00020\u0001B\u0005¢\u0006\u0002\u0010\u0002J\u0010\u0010\u0003\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u0006H\u0016¨\u0006\u0007"}, m3636d2 = {"Lio/github/inflationx/viewpump/internal/-FallbackViewCreationInterceptor;", "Lio/github/inflationx/viewpump/Interceptor;", "()V", "intercept", "Lio/github/inflationx/viewpump/InflateResult;", TransitionReason.OPTION_TRADE_CHAIN, "Lio/github/inflationx/viewpump/Interceptor$Chain;", "viewpump_release"}, m3637k = 1, m3638mv = {1, 8, 0}, m3640xi = 48)
/* renamed from: io.github.inflationx.viewpump.internal.-FallbackViewCreationInterceptor, reason: invalid class name */
/* loaded from: classes21.dex */
public final class FallbackViewCreationInterceptor implements Interceptor {
    @Override // io.github.inflationx.viewpump.Interceptor
    public InflateResult intercept(Interceptor.Chain chain) {
        Intrinsics.checkNotNullParameter(chain, "chain");
        InflateRequest inflateRequestRequest = chain.getRequest();
        FallbackViewCreator fallbackViewCreator = inflateRequestRequest.getFallbackViewCreator();
        View parent = inflateRequestRequest.getParent();
        String name = inflateRequestRequest.getName();
        Context context = inflateRequestRequest.getContext();
        AttributeSet attrs = inflateRequestRequest.getAttrs();
        if (attrs != null) {
            View viewOnCreateView = fallbackViewCreator.onCreateView(parent, name, context, attrs);
            String name2 = viewOnCreateView != null ? viewOnCreateView.getClass().getName() : null;
            if (name2 == null) {
                name2 = inflateRequestRequest.getName();
            }
            return new InflateResult(viewOnCreateView, name2, inflateRequestRequest.getContext(), inflateRequestRequest.getAttrs());
        }
        throw new IllegalStateException("Required value was null.");
    }
}
