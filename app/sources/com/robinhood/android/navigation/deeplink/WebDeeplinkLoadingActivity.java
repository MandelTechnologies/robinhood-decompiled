package com.robinhood.android.navigation.deeplink;

import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import com.robinhood.android.common.p088ui.BaseActivity;
import com.robinhood.android.navigation.IntentResolver;
import com.robinhood.android.utils.web.WebUtils;
import com.robinhood.disposer.LifecycleEvent;
import com.robinhood.disposer.LifecycleHost;
import com.robinhood.experiments.Experiment;
import com.robinhood.experiments.ExperimentsProvider;
import com.robinhood.librobinhood.data.store.ExperimentsStore;
import com.robinhood.shared.common.contracts.WebDeeplinkIntentKey;
import com.robinhood.utils.extensions.Activity;
import com.robinhood.utils.extensions.SinglesAndroid;
import com.robinhood.utils.http.HttpUrls2;
import io.reactivex.Single;
import kotlin.Lazy;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import okhttp3.HttpUrl;

/* compiled from: WebDeeplinkLoadingActivity.kt */
@Metadata(m3635d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0007\u0018\u0000 \u00162\u00020\u0001:\u0001\u0016B\u0007¢\u0006\u0004\b\u0002\u0010\u0003J\b\u0010\u0010\u001a\u00020\u0011H\u0016J\u0012\u0010\u0012\u001a\u00020\u00132\b\u0010\u0014\u001a\u0004\u0018\u00010\u0015H\u0014R\u001b\u0010\u0004\u001a\u00020\u00058BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b\b\u0010\t\u001a\u0004\b\u0006\u0010\u0007R\u001e\u0010\n\u001a\u00020\u000b8\u0006@\u0006X\u0087.¢\u0006\u000e\n\u0000\u001a\u0004\b\f\u0010\r\"\u0004\b\u000e\u0010\u000f¨\u0006\u0017"}, m3636d2 = {"Lcom/robinhood/android/navigation/deeplink/WebDeeplinkLoadingActivity;", "Lcom/robinhood/android/common/ui/BaseActivity;", "<init>", "()V", "urlString", "", "getUrlString", "()Ljava/lang/String;", "urlString$delegate", "Lkotlin/Lazy;", "experimentsStore", "Lcom/robinhood/librobinhood/data/store/ExperimentsStore;", "getExperimentsStore", "()Lcom/robinhood/librobinhood/data/store/ExperimentsStore;", "setExperimentsStore", "(Lcom/robinhood/librobinhood/data/store/ExperimentsStore;)V", "requiresAuthentication", "", "onCreate", "", "savedInstanceState", "Landroid/os/Bundle;", "Companion", "feature-deep-link-resolver_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
/* loaded from: classes8.dex */
public final class WebDeeplinkLoadingActivity extends BaseActivity {
    public static final String ARG_URL = "url";
    public ExperimentsStore experimentsStore;

    /* renamed from: urlString$delegate, reason: from kotlin metadata */
    private final Lazy urlString;

    /* renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);
    public static final int $stable = 8;

    @Override // com.robinhood.android.common.p088ui.BaseActivity
    public boolean requiresAuthentication() {
        return false;
    }

    public WebDeeplinkLoadingActivity() {
        super(C22559R.layout.activity_web_deeplink_loading);
        this.urlString = Activity.intentExtra(this, "url");
    }

    private final String getUrlString() {
        return (String) this.urlString.getValue();
    }

    public final ExperimentsStore getExperimentsStore() {
        ExperimentsStore experimentsStore = this.experimentsStore;
        if (experimentsStore != null) {
            return experimentsStore;
        }
        Intrinsics.throwUninitializedPropertyAccessException("experimentsStore");
        return null;
    }

    public final void setExperimentsStore(ExperimentsStore experimentsStore) {
        Intrinsics.checkNotNullParameter(experimentsStore, "<set-?>");
        this.experimentsStore = experimentsStore;
    }

    @Override // com.robinhood.android.common.p088ui.BaseActivity, com.robinhood.android.common.p088ui.RxActivity, androidx.fragment.app.FragmentActivity, androidx.view.ComponentActivity, androidx.core.app.ComponentActivity, android.app.Activity
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        Single singleFirstOrError = ExperimentsProvider.DefaultImpls.streamState$default(getExperimentsStore(), new Experiment[]{Experiment.URL_REDIRECT_SERVICE.INSTANCE}, false, null, 6, null).firstOrError();
        Intrinsics.checkNotNullExpressionValue(singleFirstOrError, "firstOrError(...)");
        LifecycleHost.DefaultImpls.bind$default(this, SinglesAndroid.observeOnMainThread(singleFirstOrError), (LifecycleEvent) null, 1, (Object) null).subscribeKotlin(new Function1() { // from class: com.robinhood.android.navigation.deeplink.WebDeeplinkLoadingActivity$$ExternalSyntheticLambda0
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return WebDeeplinkLoadingActivity.onCreate$lambda$0(this.f$0, (Boolean) obj);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit onCreate$lambda$0(WebDeeplinkLoadingActivity webDeeplinkLoadingActivity, Boolean bool) {
        WebDeeplinkLoadingActivity webDeeplinkLoadingActivity2;
        HttpUrl httpUrl = HttpUrl.INSTANCE.get(webDeeplinkLoadingActivity.getUrlString());
        if (bool.booleanValue() && !HttpUrls2.isRobinhoodDotCom(httpUrl)) {
            WebUtils.INSTANCE.viewPotentiallyUnsafeUrl(webDeeplinkLoadingActivity, httpUrl);
            webDeeplinkLoadingActivity2 = webDeeplinkLoadingActivity;
        } else {
            webDeeplinkLoadingActivity2 = webDeeplinkLoadingActivity;
            WebUtils.viewUrl$default(WebUtils.INSTANCE, webDeeplinkLoadingActivity2, httpUrl, 0, 4, null);
        }
        webDeeplinkLoadingActivity2.finish();
        return Unit.INSTANCE;
    }

    /* compiled from: WebDeeplinkLoadingActivity.kt */
    @Metadata(m3635d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0086\u0003\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0003\u0010\u0004J\u0018\u0010\u0007\u001a\u00020\b2\u0006\u0010\t\u001a\u00020\n2\u0006\u0010\u000b\u001a\u00020\u0002H\u0016R\u000e\u0010\u0005\u001a\u00020\u0006X\u0086T¢\u0006\u0002\n\u0000¨\u0006\f"}, m3636d2 = {"Lcom/robinhood/android/navigation/deeplink/WebDeeplinkLoadingActivity$Companion;", "Lcom/robinhood/android/navigation/IntentResolver;", "Lcom/robinhood/shared/common/contracts/WebDeeplinkIntentKey;", "<init>", "()V", "ARG_URL", "", "getIntent", "Landroid/content/Intent;", "context", "Landroid/content/Context;", "key", "feature-deep-link-resolver_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    public static final class Companion implements IntentResolver<WebDeeplinkIntentKey> {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Companion() {
        }

        @Override // com.robinhood.android.navigation.IntentResolver
        public Intent getIntent(Context context, WebDeeplinkIntentKey key) {
            Intrinsics.checkNotNullParameter(context, "context");
            Intrinsics.checkNotNullParameter(key, "key");
            Intent intent = new Intent(context, (Class<?>) WebDeeplinkLoadingActivity.class);
            intent.putExtra("url", key.getUrl());
            return intent;
        }
    }
}
