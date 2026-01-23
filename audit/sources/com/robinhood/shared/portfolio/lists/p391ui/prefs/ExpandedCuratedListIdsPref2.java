package com.robinhood.shared.portfolio.lists.p391ui.prefs;

import android.content.SharedPreferences;
import com.robinhood.prefs.StringToBooleanMapPreference;
import com.robinhood.prefs.annotation.UserPrefs;
import com.robinhood.utils.moshi.LazyMoshi;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: ExpandedCuratedListIdsPref.kt */
@Metadata(m3635d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\bÇ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u001a\u0010\u0004\u001a\u00020\u00052\b\b\u0001\u0010\u0006\u001a\u00020\u00072\u0006\u0010\b\u001a\u00020\tH\u0007¨\u0006\n"}, m3636d2 = {"Lcom/robinhood/shared/portfolio/lists/ui/prefs/CuratedListModule;", "", "<init>", "()V", "provideExpandedCuratedListIdsPref", "Lcom/robinhood/prefs/StringToBooleanMapPreference;", "preferences", "Landroid/content/SharedPreferences;", "moshi", "Lcom/robinhood/utils/moshi/LazyMoshi;", "lib-lists-ui_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
/* renamed from: com.robinhood.shared.portfolio.lists.ui.prefs.CuratedListModule, reason: use source file name */
/* loaded from: classes6.dex */
public final class ExpandedCuratedListIdsPref2 {
    public static final int $stable = 0;
    public static final ExpandedCuratedListIdsPref2 INSTANCE = new ExpandedCuratedListIdsPref2();

    private ExpandedCuratedListIdsPref2() {
    }

    @ExpandedCuratedListIdsPref
    public final StringToBooleanMapPreference provideExpandedCuratedListIdsPref(@UserPrefs SharedPreferences preferences, LazyMoshi moshi) {
        Intrinsics.checkNotNullParameter(preferences, "preferences");
        Intrinsics.checkNotNullParameter(moshi, "moshi");
        return new StringToBooleanMapPreference(preferences, "expandedCuratedListIds", null, moshi, null, 20, null);
    }
}
