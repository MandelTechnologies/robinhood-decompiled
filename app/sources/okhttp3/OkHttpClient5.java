package okhttp3;

import com.plaid.internal.EnumC7081g;
import com.robinhood.android.common.util.TransitionReason;
import kotlin.Metadata;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import okhttp3.Interceptor;

/* compiled from: OkHttpClient.kt */
@Metadata(m3635d1 = {"\u0000\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u0003H\n¢\u0006\u0002\b\u0004"}, m3636d2 = {"<anonymous>", "Lokhttp3/Response;", TransitionReason.OPTION_TRADE_CHAIN, "Lokhttp3/Interceptor$Chain;", "intercept"}, m3637k = 3, m3638mv = {1, 8, 0}, m3640xi = EnumC7081g.SDK_ASSET_ILLUSTRATION_PLAID_LOGO_NAVBAR_DARK_APPEARANCE_VALUE)
@SourceDebugExtension
/* renamed from: okhttp3.OkHttpClient$Builder$addNetworkInterceptor$2, reason: use source file name */
/* loaded from: classes25.dex */
public final class OkHttpClient5 implements Interceptor {
    final /* synthetic */ Function1<Interceptor.Chain, Response> $block;

    @Override // okhttp3.Interceptor
    public final Response intercept(Interceptor.Chain chain) {
        Intrinsics.checkNotNullParameter(chain, "chain");
        return this.$block.invoke(chain);
    }
}
