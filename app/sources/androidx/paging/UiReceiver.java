package androidx.paging;

import com.robinhood.android.common.util.analytics.AnalyticsStrings;
import kotlin.Metadata;

/* compiled from: UiReceiver.kt */
@Metadata(m3635d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\b`\u0018\u00002\u00020\u0001J\b\u0010\u0002\u001a\u00020\u0003H&J\b\u0010\u0004\u001a\u00020\u0003H&ø\u0001\u0000\u0082\u0002\u0006\n\u0004\b!0\u0001¨\u0006\u0005À\u0006\u0001"}, m3636d2 = {"Landroidx/paging/UiReceiver;", "", "refresh", "", AnalyticsStrings.BUTTON_MENU_OF_OPTIONS_RETRY, "paging-common_release"}, m3637k = 1, m3638mv = {1, 8, 0}, m3640xi = 48)
/* loaded from: classes4.dex */
public interface UiReceiver {
    void refresh();

    void retry();
}
