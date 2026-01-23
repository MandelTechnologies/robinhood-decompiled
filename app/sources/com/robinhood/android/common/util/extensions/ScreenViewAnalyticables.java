package com.robinhood.android.common.util.extensions;

import com.robinhood.android.common.util.UiCallbacks;
import com.robinhood.rosetta.eventlogging.Screen;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: ScreenViewAnalyticables.kt */
@Metadata(m3635d1 = {"\u0000\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\"\u0015\u0010\u0000\u001a\u00020\u0001*\u00020\u00028F¢\u0006\u0006\u001a\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, m3636d2 = {"screenData", "Lcom/robinhood/rosetta/eventlogging/Screen;", "Lcom/robinhood/android/common/util/UiCallbacks$ScreenViewAnalyticable;", "getScreenData", "(Lcom/robinhood/android/common/util/UiCallbacks$ScreenViewAnalyticable;)Lcom/robinhood/rosetta/eventlogging/Screen;", "lib-common_externalRelease"}, m3637k = 2, m3638mv = {2, 1, 0}, m3640xi = 48)
/* renamed from: com.robinhood.android.common.util.extensions.ScreenViewAnalyticablesKt, reason: use source file name */
/* loaded from: classes17.dex */
public final class ScreenViewAnalyticables {
    public static final Screen getScreenData(UiCallbacks.ScreenViewAnalyticable screenViewAnalyticable) {
        Intrinsics.checkNotNullParameter(screenViewAnalyticable, "<this>");
        return new Screen(Screen.Name.NAME_UNSPECIFIED, null, screenViewAnalyticable.getScreenName(), null, 10, null);
    }
}
