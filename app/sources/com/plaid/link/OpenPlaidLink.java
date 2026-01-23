package com.plaid.link;

import android.app.Application;
import android.content.Context;
import android.content.Intent;
import androidx.view.result.contract.ActivityResultContract;
import com.plaid.internal.C5876J2;
import com.plaid.internal.C5953R5;
import com.plaid.internal.link.LinkActivity;
import com.plaid.link.configuration.LinkTokenConfiguration;
import com.plaid.link.exception.LinkException;
import com.plaid.link.result.LinkExit;
import com.plaid.link.result.LinkResult;
import com.plaid.link.result.LinkSuccess;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

@Metadata(m3635d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0002\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001B\u0005¢\u0006\u0002\u0010\u0004J\u0018\u0010\u0005\u001a\u00020\u00062\u0006\u0010\u0007\u001a\u00020\b2\u0006\u0010\t\u001a\u00020\u0002H\u0016J\u001a\u0010\n\u001a\u00020\u00032\u0006\u0010\u000b\u001a\u00020\f2\b\u0010\r\u001a\u0004\u0018\u00010\u0006H\u0016¨\u0006\u000e"}, m3636d2 = {"Lcom/plaid/link/OpenPlaidLink;", "Landroidx/activity/result/contract/ActivityResultContract;", "Lcom/plaid/link/configuration/LinkTokenConfiguration;", "Lcom/plaid/link/result/LinkResult;", "()V", "createIntent", "Landroid/content/Intent;", "context", "Landroid/content/Context;", "linkConfiguration", "parseResult", "resultCode", "", "result", "link-sdk_release"}, m3637k = 1, m3638mv = {1, 9, 0}, m3640xi = 48)
/* loaded from: classes24.dex */
public final class OpenPlaidLink extends ActivityResultContract<LinkTokenConfiguration, LinkResult> {
    @Override // androidx.view.result.contract.ActivityResultContract
    public Intent createIntent(Context context, LinkTokenConfiguration linkConfiguration) throws InterruptedException, LinkException {
        Intrinsics.checkNotNullParameter(context, "context");
        Intrinsics.checkNotNullParameter(linkConfiguration, "linkConfiguration");
        Plaid plaid = Plaid.INSTANCE;
        Context applicationContext = context.getApplicationContext();
        Intrinsics.checkNotNull(applicationContext, "null cannot be cast to non-null type android.app.Application");
        plaid.createWithoutPreload$link_sdk_release((Application) applicationContext, linkConfiguration);
        int i = LinkActivity.f2928e;
        Intrinsics.checkNotNullParameter(context, "context");
        plaid.trackSdkOpen$link_sdk_release();
        Intent intent = new Intent(context, (Class<?>) LinkActivity.class);
        intent.setFlags(67108864);
        return intent;
    }

    /* JADX WARN: Can't rename method to resolve collision */
    @Override // androidx.view.result.contract.ActivityResultContract
    public LinkResult parseResult(int resultCode, Intent result) {
        if (result == null) {
            C5953R5.a.m1304b(C5953R5.f1671a, "Null result returned " + resultCode);
            return C5876J2.m1228b(new LinkException("No result returned."), null);
        }
        try {
            if (resultCode == 96171) {
                LinkSuccess linkSuccess = (LinkSuccess) result.getParcelableExtra("link_result");
                Intrinsics.checkNotNull(linkSuccess);
                return linkSuccess;
            }
            LinkExit linkExit = (LinkExit) result.getParcelableExtra("link_result");
            Intrinsics.checkNotNull(linkExit);
            return linkExit;
        } catch (Throwable th) {
            C5953R5.a.m1302a(C5953R5.f1671a, th, "Invalid result returned " + resultCode);
            return C5876J2.m1228b(new LinkException("Invalid result returned, please ensure you aren't using 3364 as a request code to open other activities"), null);
        }
    }
}
