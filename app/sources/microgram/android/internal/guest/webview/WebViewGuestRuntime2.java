package microgram.android.internal.guest.webview;

import com.plaid.internal.EnumC7081g;
import com.robinhood.android.common.util.analytics.AnalyticsStrings;
import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import microgram.android.internal.guest.webview.WebViewGuestRuntime;

/* compiled from: WebViewGuestRuntime.kt */
@Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
@DebugMetadata(m3644c = "microgram.android.internal.guest.webview.WebViewGuestRuntime$Factory", m3645f = "WebViewGuestRuntime.kt", m3646l = {EnumC7081g.SDK_ASSET_ILLUSTRATION_PLAID_PINWHEEL_TEXT_VALUE}, m3647m = AnalyticsStrings.BUTTON_NEW_LIST_CREATE)
/* renamed from: microgram.android.internal.guest.webview.WebViewGuestRuntime$Factory$create$1, reason: use source file name */
/* loaded from: classes14.dex */
final class WebViewGuestRuntime2 extends ContinuationImpl {
    Object L$0;
    int label;
    /* synthetic */ Object result;
    final /* synthetic */ WebViewGuestRuntime.Factory this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    WebViewGuestRuntime2(WebViewGuestRuntime.Factory factory, Continuation<? super WebViewGuestRuntime2> continuation) {
        super(continuation);
        this.this$0 = factory;
    }

    @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
    public final Object invokeSuspend(Object obj) {
        this.result = obj;
        this.label |= Integer.MIN_VALUE;
        return this.this$0.create(null, this);
    }
}
