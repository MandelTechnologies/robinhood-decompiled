package com.robinhood.utils.p409ui.edge2edge;

import kotlin.Metadata;

/* compiled from: EdgeToEdgeHost.kt */
@Metadata(m3635d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\b\bf\u0018\u00002\u00020\u0001J\b\u0010\u0002\u001a\u00020\u0003H&J\u0010\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u0005H&J\u0010\u0010\u0006\u001a\u00020\u00032\u0006\u0010\u0007\u001a\u00020\u0005H&J\u0010\u0010\b\u001a\u00020\u00032\u0006\u0010\u0007\u001a\u00020\u0005H&J\u0010\u0010\t\u001a\u00020\u00032\u0006\u0010\u0007\u001a\u00020\u0005H&J\b\u0010\n\u001a\u00020\u0003H&J\b\u0010\u000b\u001a\u00020\u0003H&J\b\u0010\f\u001a\u00020\u0003H&¨\u0006\r"}, m3636d2 = {"Lcom/robinhood/utils/ui/edge2edge/EdgeToEdgeHost;", "", "initEdgeToEdge", "", "isSystemBarStyleLight", "", "overrideSystemBarsStyle", "isLight", "overrideStatusBarStyle", "overrideNavigationBarStyle", "resetStatusBarStyleOverride", "resetNavigationBarStyleOverride", "resetSystemBarsStyleOverride", "lib-utils-ui_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
/* loaded from: classes12.dex */
public interface EdgeToEdgeHost {
    void initEdgeToEdge();

    void initEdgeToEdge(boolean isSystemBarStyleLight);

    void overrideNavigationBarStyle(boolean isLight);

    void overrideStatusBarStyle(boolean isLight);

    void overrideSystemBarsStyle(boolean isLight);

    void resetNavigationBarStyleOverride();

    void resetStatusBarStyleOverride();

    void resetSystemBarsStyleOverride();
}
