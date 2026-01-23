package com.robinhood.android.engagement.eoygiveaway;

import java.util.List;
import kotlin.Metadata;

/* compiled from: EoyGiveawayInteractionHandler.kt */
@Metadata(m3635d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0010 \n\u0000\n\u0002\u0010\u000b\n\u0000\bf\u0018\u00002\u00020\u0001J\u0010\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u0005H&J\u0010\u0010\u0006\u001a\u00020\u00032\u0006\u0010\u0007\u001a\u00020\u0005H&J\u001e\u0010\b\u001a\u00020\u00032\f\u0010\t\u001a\b\u0012\u0004\u0012\u00020\u00050\n2\u0006\u0010\u000b\u001a\u00020\fH&¨\u0006\r"}, m3636d2 = {"Lcom/robinhood/android/engagement/eoygiveaway/EoyGiveawayInteractionHandler;", "", "invokeJavascript", "", "script", "", "dismissProgramView", "viewId", "showSystemShareScreen", "contents", "", "includeCanvasImage", "", "lib-eoy-giveaway_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
/* loaded from: classes7.dex */
public interface EoyGiveawayInteractionHandler {
    void dismissProgramView(String viewId);

    void invokeJavascript(String script);

    void showSystemShareScreen(List<String> contents, boolean includeCanvasImage);
}
