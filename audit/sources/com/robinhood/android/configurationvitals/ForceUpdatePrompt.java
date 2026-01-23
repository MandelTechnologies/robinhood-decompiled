package com.robinhood.android.configurationvitals;

import androidx.fragment.app.FragmentActivity;
import com.robinhood.models.api.UnsupportedVersionContent;
import kotlin.Metadata;

/* compiled from: ForceUpdatePrompt.kt */
@Metadata(m3635d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\bf\u0018\u00002\u00020\u0001J\u0018\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u00052\u0006\u0010\u0006\u001a\u00020\u0007H&J\u0010\u0010\b\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u0005H&¨\u0006\t"}, m3636d2 = {"Lcom/robinhood/android/configurationvitals/ForceUpdatePrompt;", "", "show", "", "activity", "Landroidx/fragment/app/FragmentActivity;", "unsupportedVersionContent", "Lcom/robinhood/models/api/UnsupportedVersionContent;", "dismiss", "lib-configuration-vitals_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
/* loaded from: classes17.dex */
public interface ForceUpdatePrompt {
    void dismiss(FragmentActivity activity);

    void show(FragmentActivity activity, UnsupportedVersionContent unsupportedVersionContent);
}
