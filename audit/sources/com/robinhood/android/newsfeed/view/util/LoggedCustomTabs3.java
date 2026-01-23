package com.robinhood.android.newsfeed.view.util;

import android.content.ComponentName;
import androidx.browser.customtabs.CustomTabsClient;
import androidx.browser.customtabs.CustomTabsServiceConnection;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: LoggedCustomTabs.kt */
@Metadata(m3635d1 = {"\u0000!\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J\u0018\u0010\b\u001a\u00020\t2\u0006\u0010\n\u001a\u00020\u000b2\u0006\u0010\u0002\u001a\u00020\u0003H\u0016J\u0012\u0010\f\u001a\u00020\t2\b\u0010\n\u001a\u0004\u0018\u00010\u000bH\u0016R\u001c\u0010\u0002\u001a\u0004\u0018\u00010\u0003X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0004\u0010\u0005\"\u0004\b\u0006\u0010\u0007¨\u0006\r"}, m3636d2 = {"com/robinhood/android/newsfeed/view/util/LoggedCustomTabs$serviceConnection$1", "Landroidx/browser/customtabs/CustomTabsServiceConnection;", "client", "Landroidx/browser/customtabs/CustomTabsClient;", "getClient", "()Landroidx/browser/customtabs/CustomTabsClient;", "setClient", "(Landroidx/browser/customtabs/CustomTabsClient;)V", "onCustomTabsServiceConnected", "", "name", "Landroid/content/ComponentName;", "onServiceDisconnected", "feature-lib-newsfeed_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
/* renamed from: com.robinhood.android.newsfeed.view.util.LoggedCustomTabs$serviceConnection$1, reason: use source file name */
/* loaded from: classes8.dex */
public final class LoggedCustomTabs3 extends CustomTabsServiceConnection {
    private CustomTabsClient client;

    @Override // android.content.ServiceConnection
    public void onServiceDisconnected(ComponentName name) {
    }

    LoggedCustomTabs3() {
    }

    public final CustomTabsClient getClient() {
        return this.client;
    }

    public final void setClient(CustomTabsClient customTabsClient) {
        this.client = customTabsClient;
    }

    @Override // androidx.browser.customtabs.CustomTabsServiceConnection
    public void onCustomTabsServiceConnected(ComponentName name, CustomTabsClient client) {
        Intrinsics.checkNotNullParameter(name, "name");
        Intrinsics.checkNotNullParameter(client, "client");
        this.client = client;
    }
}
