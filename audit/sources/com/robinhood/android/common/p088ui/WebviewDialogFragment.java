package com.robinhood.android.common.p088ui;

import android.content.res.Resources;
import android.os.Bundle;
import android.os.Environment;
import android.view.View;
import android.webkit.WebView;
import android.widget.Button;
import androidx.appcompat.app.AppCompatActivity;
import androidx.fragment.app.FragmentActivity;
import androidx.fragment.app.FragmentManager;
import com.robinhood.android.common.C11048R;
import com.robinhood.android.common.util.extensions.Fragments2;
import com.robinhood.utils.ClipboardUtil;
import com.robinhood.utils.extensions.Files;
import com.robinhood.utils.p409ui.view.OnClickListeners;
import java.io.File;
import kotlin.Lazy;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.JvmStatic;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlin.p481io.FilesKt;
import kotlin.text.StringsKt;
import p479j$.time.LocalDateTime;

/* compiled from: WebviewDialogFragment.kt */
@Metadata(m3635d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0005\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0007\u0018\u0000 \u00112\u00020\u0001:\u0001\u0011B\u0007¢\u0006\u0004\b\u0002\u0010\u0003J\u001a\u0010\n\u001a\u00020\u000b2\u0006\u0010\f\u001a\u00020\r2\b\u0010\u000e\u001a\u0004\u0018\u00010\u000fH\u0016J\u0010\u0010\u0010\u001a\u00020\u000b2\u0006\u0010\u0004\u001a\u00020\u0005H\u0002R\u001b\u0010\u0004\u001a\u00020\u00058BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b\b\u0010\t\u001a\u0004\b\u0006\u0010\u0007¨\u0006\u0012"}, m3636d2 = {"Lcom/robinhood/android/common/ui/WebviewDialogFragment;", "Lcom/robinhood/android/common/ui/BaseDialogFragment;", "<init>", "()V", "html", "", "getHtml", "()Ljava/lang/String;", "html$delegate", "Lkotlin/Lazy;", "onViewCreated", "", "view", "Landroid/view/View;", "savedInstanceState", "Landroid/os/Bundle;", "shareFile", "Companion", "lib-common_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
/* loaded from: classes2.dex */
public final class WebviewDialogFragment extends BaseDialogFragment {
    private static final String EXTRA_HTML = "extraHtml";

    /* renamed from: html$delegate, reason: from kotlin metadata */
    private final Lazy html;

    /* renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);
    public static final int $stable = 8;

    @JvmStatic
    public static final WebviewDialogFragment show(String str, AppCompatActivity appCompatActivity) {
        return INSTANCE.show(str, appCompatActivity);
    }

    public WebviewDialogFragment() {
        super(C11048R.layout.dialog_webview);
        this.html = Fragments2.argument(this, EXTRA_HTML);
    }

    private final String getHtml() {
        return (String) this.html.getValue();
    }

    @Override // com.robinhood.android.common.p088ui.BaseDialogFragment, androidx.fragment.app.Fragment
    public void onViewCreated(final View view, Bundle savedInstanceState) {
        Intrinsics.checkNotNullParameter(view, "view");
        super.onViewCreated(view, savedInstanceState);
        String html = getHtml();
        if (!StringsKt.startsWith$default(getHtml(), "<", false, 2, (Object) null)) {
            html = StringsKt.replace$default(getHtml(), "\n", "<br>", false, 4, (Object) null);
        }
        ((WebView) view.findViewById(C11048R.id.webView)).loadDataWithBaseURL(null, html, "text/html; charset=utf-8", "UTF-8", null);
        Button button = (Button) view.findViewById(C11048R.id.copy_button);
        Intrinsics.checkNotNull(button);
        OnClickListeners.onClick(button, new Function0() { // from class: com.robinhood.android.common.ui.WebviewDialogFragment$$ExternalSyntheticLambda0
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                return WebviewDialogFragment.onViewCreated$lambda$0(this.f$0, view);
            }
        });
        Button button2 = (Button) view.findViewById(C11048R.id.share_button);
        Intrinsics.checkNotNull(button2);
        OnClickListeners.onClick(button2, new Function0() { // from class: com.robinhood.android.common.ui.WebviewDialogFragment$$ExternalSyntheticLambda1
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                return WebviewDialogFragment.onViewCreated$lambda$1(this.f$0);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit onViewCreated$lambda$0(WebviewDialogFragment webviewDialogFragment, View view) throws Resources.NotFoundException {
        ClipboardUtil.copyToClipboardWithHapticFeedback$default(ClipboardUtil.INSTANCE, webviewDialogFragment.getHtml(), "debug_info", view, false, 8, null);
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit onViewCreated$lambda$1(WebviewDialogFragment webviewDialogFragment) {
        webviewDialogFragment.shareFile(webviewDialogFragment.getHtml());
        return Unit.INSTANCE;
    }

    private final void shareFile(String html) {
        FragmentActivity fragmentActivityRequireActivity = requireActivity();
        Intrinsics.checkNotNullExpressionValue(fragmentActivityRequireActivity, "requireActivity(...)");
        String str = "debug_info_" + LocalDateTime.now() + ".txt";
        File file = new File(fragmentActivityRequireActivity.getExternalFilesDir(Environment.DIRECTORY_DOWNLOADS), str);
        FilesKt.writeText$default(file, html, null, 2, null);
        fragmentActivityRequireActivity.startActivity(Files.getShareIntent$default(file, fragmentActivityRequireActivity, str, "text/plain", null, 8, null));
    }

    /* compiled from: WebviewDialogFragment.kt */
    @Metadata(m3635d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0018\u0010\u0006\u001a\u00020\u00072\u0006\u0010\b\u001a\u00020\u00052\u0006\u0010\t\u001a\u00020\nH\u0007R\u000e\u0010\u0004\u001a\u00020\u0005X\u0082T¢\u0006\u0002\n\u0000¨\u0006\u000b"}, m3636d2 = {"Lcom/robinhood/android/common/ui/WebviewDialogFragment$Companion;", "", "<init>", "()V", "EXTRA_HTML", "", "show", "Lcom/robinhood/android/common/ui/WebviewDialogFragment;", "html", "activity", "Landroidx/appcompat/app/AppCompatActivity;", "lib-common_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    @SourceDebugExtension
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Companion() {
        }

        @JvmStatic
        public final WebviewDialogFragment show(String html, AppCompatActivity activity) {
            Intrinsics.checkNotNullParameter(html, "html");
            Intrinsics.checkNotNullParameter(activity, "activity");
            WebviewDialogFragment webviewDialogFragment = new WebviewDialogFragment();
            Bundle bundle = new Bundle();
            bundle.putString(WebviewDialogFragment.EXTRA_HTML, html);
            webviewDialogFragment.setArguments(bundle);
            try {
                FragmentManager supportFragmentManager = activity.getSupportFragmentManager();
                Intrinsics.checkNotNullExpressionValue(supportFragmentManager, "getSupportFragmentManager(...)");
                webviewDialogFragment.show(supportFragmentManager, "webview-dialog");
            } catch (IllegalStateException unused) {
            }
            return webviewDialogFragment;
        }
    }
}
