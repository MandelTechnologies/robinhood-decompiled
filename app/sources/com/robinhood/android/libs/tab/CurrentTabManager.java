package com.robinhood.android.libs.tab;

import com.robinhood.compose.bento.component.BentoTabBarState;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.flow.FlowKt;
import kotlinx.coroutines.flow.StateFlow;
import kotlinx.coroutines.flow.StateFlow2;
import kotlinx.coroutines.flow.StateFlow4;

/* compiled from: CurrentTabManager.kt */
@Metadata(m3635d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0002\b\u0002\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003J\u000e\u0010\u000b\u001a\u00020\f2\u0006\u0010\r\u001a\u00020\u0006R\u0014\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005X\u0082\u0004¢\u0006\u0002\n\u0000R\u0017\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\u00060\b¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\n¨\u0006\u000e"}, m3636d2 = {"Lcom/robinhood/android/libs/tab/CurrentTabManager;", "", "<init>", "()V", "_state", "Lkotlinx/coroutines/flow/MutableStateFlow;", "Lcom/robinhood/compose/bento/component/BentoTabBarState$Tab;", "currentTab", "Lkotlinx/coroutines/flow/StateFlow;", "getCurrentTab", "()Lkotlinx/coroutines/flow/StateFlow;", "setCurrentTab", "", "tab", "lib-tab_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
/* loaded from: classes8.dex */
public final class CurrentTabManager {
    private final StateFlow2<BentoTabBarState.Tab> _state;
    private final StateFlow<BentoTabBarState.Tab> currentTab;

    public CurrentTabManager() {
        StateFlow2<BentoTabBarState.Tab> stateFlow2MutableStateFlow = StateFlow4.MutableStateFlow(BentoTabBarState.Tab.PORTFOLIO);
        this._state = stateFlow2MutableStateFlow;
        this.currentTab = FlowKt.asStateFlow(stateFlow2MutableStateFlow);
    }

    public final StateFlow<BentoTabBarState.Tab> getCurrentTab() {
        return this.currentTab;
    }

    public final void setCurrentTab(BentoTabBarState.Tab tab) {
        Intrinsics.checkNotNullParameter(tab, "tab");
        this._state.setValue(tab);
    }
}
