package com.robinhood.android.event.gamedetail.callbacks;

import com.robinhood.android.event.gamedetail.builders.AboutEventType;
import kotlin.Metadata;

/* compiled from: GdpCommonCallbacks.kt */
@Metadata(m3635d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\bf\u0018\u00002\u00020\u0001J\b\u0010\u0002\u001a\u00020\u0003H&J\u0010\u0010\u0004\u001a\u00020\u00032\u0006\u0010\u0005\u001a\u00020\u0006H&J\b\u0010\u0007\u001a\u00020\u0003H&J\u0010\u0010\b\u001a\u00020\u00032\u0006\u0010\t\u001a\u00020\nH&¨\u0006\u000b"}, m3636d2 = {"Lcom/robinhood/android/event/gamedetail/callbacks/GdpCommonCallbacks;", "", "onOrderSubmitted", "", "onAmericanOddsChanged", "isChecked", "", "onShowDisabledTradeButtonMessage", "onAboutEventTypeSelected", "aboutEventType", "Lcom/robinhood/android/event/gamedetail/builders/AboutEventType;", "feature-game-detail_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
/* loaded from: classes3.dex */
public interface GdpCommonCallbacks {
    void onAboutEventTypeSelected(AboutEventType aboutEventType);

    void onAmericanOddsChanged(boolean isChecked);

    void onOrderSubmitted();

    void onShowDisabledTradeButtonMessage();
}
