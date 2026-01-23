package com.withpersona.sdk2.inquiry.launchers;

import androidx.browser.customtabs.CustomTabsIntent;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: CustomTabsLauncherModule.kt */
@Metadata(m3635d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0007\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005¢\u0006\u0004\b\u0006\u0010\u0007R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\b\u0010\tR\u0011\u0010\u0004\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\u000b¨\u0006\f"}, m3636d2 = {"Lcom/withpersona/sdk2/inquiry/launchers/CustomTabsArguments;", "", "intent", "Landroidx/browser/customtabs/CustomTabsIntent;", "url", "", "<init>", "(Landroidx/browser/customtabs/CustomTabsIntent;Ljava/lang/String;)V", "getIntent", "()Landroidx/browser/customtabs/CustomTabsIntent;", "getUrl", "()Ljava/lang/String;", "launchers_release"}, m3637k = 1, m3638mv = {2, 0, 0}, m3640xi = 48)
/* renamed from: com.withpersona.sdk2.inquiry.launchers.CustomTabsArguments, reason: use source file name */
/* loaded from: classes18.dex */
public final class CustomTabsLauncherModule2 {
    private final CustomTabsIntent intent;
    private final String url;

    public CustomTabsLauncherModule2(CustomTabsIntent intent, String url) {
        Intrinsics.checkNotNullParameter(intent, "intent");
        Intrinsics.checkNotNullParameter(url, "url");
        this.intent = intent;
        this.url = url;
    }

    public final CustomTabsIntent getIntent() {
        return this.intent;
    }

    public final String getUrl() {
        return this.url;
    }
}
