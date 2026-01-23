package com.robinhood.android.p273ui;

import com.robinhood.android.udf.StateProvider;
import com.robinhood.compose.bento.component.BentoTabBarState;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.collections.immutable.extensions2;

/* compiled from: MainTabBarStateProvider.kt */
@Metadata(m3635d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0007\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001B\t\b\u0007¢\u0006\u0004\b\u0004\u0010\u0005J\u0010\u0010\u0006\u001a\u00020\u00032\u0006\u0010\u0007\u001a\u00020\u0002H\u0016¨\u0006\b"}, m3636d2 = {"Lcom/robinhood/android/ui/MainTabBarStateProvider;", "Lcom/robinhood/android/udf/StateProvider;", "Lcom/robinhood/android/ui/MainTabBarDataState;", "Lcom/robinhood/android/ui/MainTabBarViewState;", "<init>", "()V", "reduce", "dataState", "feature-tab-ui_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
/* loaded from: classes9.dex */
public final class MainTabBarStateProvider implements StateProvider<MainTabBarDataState, MainTabBarViewState> {
    public static final int $stable = 0;

    @Override // com.robinhood.android.udf.StateProvider
    public MainTabBarViewState reduce(MainTabBarDataState dataState) {
        Intrinsics.checkNotNullParameter(dataState, "dataState");
        return new MainTabBarViewState(new BentoTabBarState(extensions2.toPersistentList(dataState.getTabsForLocality()), dataState.getSelectedIndex(), extensions2.toPersistentMap(dataState.getBadges())), dataState.getTabStack(), dataState.getShowWatchlistTabTooltip(), dataState.getCreditCardTabStyle());
    }
}
