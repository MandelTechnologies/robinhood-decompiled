package io.github.inflationx.viewpump;

import com.robinhood.android.common.util.TransitionReason;
import kotlin.Metadata;

/* compiled from: Interceptor.kt */
@Metadata(m3635d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\bf\u0018\u00002\u00020\u0001:\u0001\u0007J\u0017\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H&¢\u0006\u0004\b\u0005\u0010\u0006¨\u0006\b"}, m3636d2 = {"Lio/github/inflationx/viewpump/Interceptor;", "", "Lio/github/inflationx/viewpump/Interceptor$Chain;", TransitionReason.OPTION_TRADE_CHAIN, "Lio/github/inflationx/viewpump/InflateResult;", "intercept", "(Lio/github/inflationx/viewpump/Interceptor$Chain;)Lio/github/inflationx/viewpump/InflateResult;", "Chain", "viewpump_release"}, m3637k = 1, m3638mv = {1, 8, 0}, m3640xi = 48)
/* loaded from: classes21.dex */
public interface Interceptor {

    /* compiled from: Interceptor.kt */
    @Metadata(m3635d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\bf\u0018\u00002\u00020\u0001J\u0010\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u0005H&J\b\u0010\u0004\u001a\u00020\u0005H&¨\u0006\u0006"}, m3636d2 = {"Lio/github/inflationx/viewpump/Interceptor$Chain;", "", "proceed", "Lio/github/inflationx/viewpump/InflateResult;", "request", "Lio/github/inflationx/viewpump/InflateRequest;", "viewpump_release"}, m3637k = 1, m3638mv = {1, 8, 0}, m3640xi = 48)
    public interface Chain {
        InflateResult proceed(InflateRequest request);

        InflateRequest request();
    }

    InflateResult intercept(Chain chain);
}
