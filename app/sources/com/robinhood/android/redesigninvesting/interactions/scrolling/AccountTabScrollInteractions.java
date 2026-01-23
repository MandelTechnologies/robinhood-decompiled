package com.robinhood.android.redesigninvesting.interactions.scrolling;

import androidx.compose.foundation.ScrollState;
import androidx.compose.foundation.lazy.LazyListState;
import kotlin.Metadata;

/* compiled from: AccountTabScrollInteractions.kt */
@Metadata(m3635d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u000b\n\u0000\bf\u0018\u00002\u00020\u0001J\u0018\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u00052\u0006\u0010\u0006\u001a\u00020\u0007H&J\u0018\u0010\b\u001a\u00020\u00032\u0006\u0010\t\u001a\u00020\n2\u0006\u0010\u0006\u001a\u00020\u0007H&J\u0010\u0010\u000b\u001a\u00020\u00032\u0006\u0010\u0006\u001a\u00020\u0007H&J\u0010\u0010\f\u001a\u00020\u00032\u0006\u0010\u0006\u001a\u00020\u0007H&J\u0010\u0010\r\u001a\u00020\u00032\u0006\u0010\u000e\u001a\u00020\u000fH&¨\u0006\u0010"}, m3636d2 = {"Lcom/robinhood/android/redesigninvesting/interactions/scrolling/AccountTabScrollInteraction;", "", "onLazyListStateCreated", "", "lazyListState", "Landroidx/compose/foundation/lazy/LazyListState;", "id", "", "onVerticalListStateCreated", "scrollState", "Landroidx/compose/foundation/ScrollState;", "onLazyListStateDestroyed", "onVerticalListStateDestroyed", "onInnerElementScrollStateChanged", "scrolling", "", "lib-interactions_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
/* renamed from: com.robinhood.android.redesigninvesting.interactions.scrolling.AccountTabScrollInteraction, reason: use source file name */
/* loaded from: classes5.dex */
public interface AccountTabScrollInteractions {
    void onInnerElementScrollStateChanged(boolean scrolling);

    void onLazyListStateCreated(LazyListState lazyListState, String id);

    void onLazyListStateDestroyed(String id);

    void onVerticalListStateCreated(ScrollState scrollState, String id);

    void onVerticalListStateDestroyed(String id);
}
