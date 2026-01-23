package com.stripe.android.stripe3ds2.views;

import android.content.Context;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.view.View;
import android.widget.FrameLayout;
import com.stripe.android.stripe3ds2.databinding.StripeChallengeZoneWebViewBinding;
import com.stripe.android.stripe3ds2.views.ThreeDS2WebViewClient;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import kotlin.Metadata;
import kotlin.jvm.JvmOverloads;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.Regex;

/* compiled from: ChallengeZoneWebView.kt */
@Metadata(m3635d1 = {"\u0000@\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0006\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u000f\b\u0000\u0018\u0000 '2\u00020\u00012\u00020\u0002:\u0001'B'\b\u0007\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u0005\u0012\b\b\u0002\u0010\b\u001a\u00020\u0007¢\u0006\u0004\b\t\u0010\nJ\u0017\u0010\r\u001a\u00020\u000b2\u0006\u0010\f\u001a\u00020\u000bH\u0002¢\u0006\u0004\b\r\u0010\u000eJ\u0017\u0010\u000f\u001a\u00020\u000b2\u0006\u0010\f\u001a\u00020\u000bH\u0002¢\u0006\u0004\b\u000f\u0010\u000eJ\u0017\u0010\u0011\u001a\u00020\u000b2\u0006\u0010\f\u001a\u00020\u000bH\u0001¢\u0006\u0004\b\u0010\u0010\u000eJ\u0017\u0010\u0013\u001a\u00020\u00122\b\u0010\f\u001a\u0004\u0018\u00010\u000b¢\u0006\u0004\b\u0013\u0010\u0014J\u0019\u0010\u0017\u001a\u00020\u00122\b\u0010\u0016\u001a\u0004\u0018\u00010\u0015H\u0016¢\u0006\u0004\b\u0017\u0010\u0018R\u0017\u0010\u001a\u001a\u00020\u00198\u0006¢\u0006\f\n\u0004\b\u001a\u0010\u001b\u001a\u0004\b\u001c\u0010\u001dR$\u0010\u001f\u001a\u00020\u000b2\u0006\u0010\u001e\u001a\u00020\u000b8\u0016@RX\u0096\u000e¢\u0006\f\n\u0004\b\u001f\u0010 \u001a\u0004\b!\u0010\"R$\u0010\u0016\u001a\u0004\u0018\u00010\u00158\u0000@\u0000X\u0080\u000e¢\u0006\u0012\n\u0004\b\u0016\u0010#\u001a\u0004\b$\u0010%\"\u0004\b&\u0010\u0018¨\u0006("}, m3636d2 = {"Lcom/stripe/android/stripe3ds2/views/ChallengeZoneWebView;", "Landroid/widget/FrameLayout;", "", "Landroid/content/Context;", "context", "Landroid/util/AttributeSet;", "attrs", "", "defStyleAttr", "<init>", "(Landroid/content/Context;Landroid/util/AttributeSet;I)V", "", "html", "transformFormMethod", "(Ljava/lang/String;)Ljava/lang/String;", "transformFormActionUrl", "transformHtml$3ds2sdk_release", "transformHtml", "", "loadHtml", "(Ljava/lang/String;)V", "Landroid/view/View$OnClickListener;", "onClickListener", "setOnClickListener", "(Landroid/view/View$OnClickListener;)V", "Lcom/stripe/android/stripe3ds2/views/ThreeDS2WebView;", "webView", "Lcom/stripe/android/stripe3ds2/views/ThreeDS2WebView;", "getWebView", "()Lcom/stripe/android/stripe3ds2/views/ThreeDS2WebView;", "<set-?>", "userEntry", "Ljava/lang/String;", "getUserEntry", "()Ljava/lang/String;", "Landroid/view/View$OnClickListener;", "getOnClickListener$3ds2sdk_release", "()Landroid/view/View$OnClickListener;", "setOnClickListener$3ds2sdk_release", "Companion", "3ds2sdk_release"}, m3637k = 1, m3638mv = {1, 9, 0}, m3640xi = 48)
/* loaded from: classes26.dex */
public final class ChallengeZoneWebView extends FrameLayout {
    private View.OnClickListener onClickListener;
    private String userEntry;
    private final ThreeDS2WebView webView;
    private static final Companion Companion = new Companion(null);
    private static final Pattern PATTERN_METHOD_POST = Pattern.compile("method=\"post\"", 10);
    private static final Pattern PATTERN_FORM_ACTION = Pattern.compile("action=\"(.+?)\"", 10);

    public /* synthetic */ ChallengeZoneWebView(Context context, AttributeSet attributeSet, int i, int i2, DefaultConstructorMarker defaultConstructorMarker) {
        this(context, (i2 & 2) != 0 ? null : attributeSet, (i2 & 4) != 0 ? 0 : i);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    @JvmOverloads
    public ChallengeZoneWebView(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        Intrinsics.checkNotNullParameter(context, "context");
        this.userEntry = "";
        StripeChallengeZoneWebViewBinding stripeChallengeZoneWebViewBindingInflate = StripeChallengeZoneWebViewBinding.inflate(LayoutInflater.from(context), this);
        Intrinsics.checkNotNullExpressionValue(stripeChallengeZoneWebViewBindingInflate, "inflate(...)");
        ThreeDS2WebView webView = stripeChallengeZoneWebViewBindingInflate.webView;
        Intrinsics.checkNotNullExpressionValue(webView, "webView");
        this.webView = webView;
        webView.setOnHtmlSubmitListener$3ds2sdk_release(new ThreeDS2WebViewClient.OnHtmlSubmitListener() { // from class: com.stripe.android.stripe3ds2.views.ChallengeZoneWebView$$ExternalSyntheticLambda0
            @Override // com.stripe.android.stripe3ds2.views.ThreeDS2WebViewClient.OnHtmlSubmitListener
            public final void onHtmlSubmit(String str) {
                ChallengeZoneWebView._init_$lambda$0(this.f$0, str);
            }
        });
    }

    public final ThreeDS2WebView getWebView() {
        return this.webView;
    }

    public String getUserEntry() {
        return this.userEntry;
    }

    /* renamed from: getOnClickListener$3ds2sdk_release, reason: from getter */
    public final View.OnClickListener getOnClickListener() {
        return this.onClickListener;
    }

    public final void setOnClickListener$3ds2sdk_release(View.OnClickListener onClickListener) {
        this.onClickListener = onClickListener;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void _init_$lambda$0(ChallengeZoneWebView this$0, String str) {
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        if (str == null) {
            str = "";
        }
        this$0.userEntry = str;
        View.OnClickListener onClickListener = this$0.onClickListener;
        if (onClickListener != null) {
            onClickListener.onClick(this$0);
        }
    }

    public final String transformHtml$3ds2sdk_release(String html) {
        Intrinsics.checkNotNullParameter(html, "html");
        return transformFormActionUrl(transformFormMethod(html));
    }

    private final String transformFormMethod(String html) {
        String strReplaceAll = PATTERN_METHOD_POST.matcher(html).replaceAll("method=\"get\"");
        Intrinsics.checkNotNullExpressionValue(strReplaceAll, "replaceAll(...)");
        return strReplaceAll;
    }

    private final String transformFormActionUrl(String html) {
        String strGroup;
        Matcher matcher = PATTERN_FORM_ACTION.matcher(html);
        return (!matcher.find() || (strGroup = matcher.group(1)) == null || Intrinsics.areEqual("https://emv3ds/challenge", strGroup)) ? html : new Regex(strGroup).replace(html, "https://emv3ds/challenge");
    }

    public final void loadHtml(String html) {
        if (html == null) {
            return;
        }
        this.webView.loadDataWithBaseURL(null, transformHtml$3ds2sdk_release(html), "text/html", "UTF-8", null);
    }

    @Override // android.view.View
    public void setOnClickListener(View.OnClickListener onClickListener) {
        this.onClickListener = onClickListener;
    }

    /* compiled from: ChallengeZoneWebView.kt */
    @Metadata(m3635d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0082\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002R\u000e\u0010\u0003\u001a\u00020\u0004X\u0082T¢\u0006\u0002\n\u0000R\u000e\u0010\u0005\u001a\u00020\u0004X\u0082T¢\u0006\u0002\n\u0000R\u000e\u0010\u0006\u001a\u00020\u0004X\u0082T¢\u0006\u0002\n\u0000R\u0016\u0010\u0007\u001a\n \t*\u0004\u0018\u00010\b0\bX\u0082\u0004¢\u0006\u0002\n\u0000R\u0016\u0010\n\u001a\n \t*\u0004\u0018\u00010\b0\bX\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006\u000b"}, m3636d2 = {"Lcom/stripe/android/stripe3ds2/views/ChallengeZoneWebView$Companion;", "", "()V", "ENCODING", "", "HTML_MIME_TYPE", "METHOD_GET", "PATTERN_FORM_ACTION", "Ljava/util/regex/Pattern;", "kotlin.jvm.PlatformType", "PATTERN_METHOD_POST", "3ds2sdk_release"}, m3637k = 1, m3638mv = {1, 9, 0}, m3640xi = 48)
    private static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Companion() {
        }
    }
}
