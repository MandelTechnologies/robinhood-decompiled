package com.robinhood.android.plt.contract;

import com.robinhood.rosetta.eventlogging.Screen;
import kotlin.Metadata;
import kotlinx.coroutines.flow.Flow;

/* compiled from: PltManager.kt */
@Metadata(m3635d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\bf\u0018\u00002\u00020\u0001J\u0010\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u0005H&J\u0010\u0010\u0006\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u0005H&J\u0018\u0010\u0007\u001a\u00020\u00032\u0006\u0010\b\u001a\u00020\t2\u0006\u0010\n\u001a\u00020\u000bH&J\u0010\u0010\f\u001a\u00020\u00032\u0006\u0010\b\u001a\u00020\tH&J\u000e\u0010\r\u001a\b\u0012\u0004\u0012\u00020\u000b0\u000eH&¨\u0006\u000f"}, m3636d2 = {"Lcom/robinhood/android/plt/contract/PltManager;", "", "onElementLoadStarted", "", "identifier", "", "onElementLoadEnded", "onScreenAppear", "screen", "Lcom/robinhood/rosetta/eventlogging/Screen;", "hasZeroPlt", "", "onScreenDisappear", "streamLoadingState", "Lkotlinx/coroutines/flow/Flow;", "lib-perceived-loading-time-contract_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
/* loaded from: classes11.dex */
public interface PltManager {
    void onElementLoadEnded(String identifier);

    void onElementLoadStarted(String identifier);

    void onScreenAppear(Screen screen, boolean hasZeroPlt);

    void onScreenDisappear(Screen screen);

    Flow<Boolean> streamLoadingState();
}
