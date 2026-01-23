package com.robinhood.shared.home.deeplink.prompt;

import androidx.fragment.app.FragmentActivity;
import kotlin.Metadata;

/* compiled from: BlockedExternalDeeplinkPrompt.kt */
@Metadata(m3635d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\bf\u0018\u00002\u00020\u0001J\u0018\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u00052\u0006\u0010\u0006\u001a\u00020\u0007H&¨\u0006\b"}, m3636d2 = {"Lcom/robinhood/shared/home/deeplink/prompt/BlockedExternalDeeplinkPrompt;", "", "show", "", "activity", "Landroidx/fragment/app/FragmentActivity;", "blockedUrl", "", "lib-deeplink-prompt_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
/* loaded from: classes21.dex */
public interface BlockedExternalDeeplinkPrompt {
    void show(FragmentActivity activity, String blockedUrl);
}
