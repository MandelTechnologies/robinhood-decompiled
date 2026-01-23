package com.robinhood.android.dashboard.lib;

import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import com.robinhood.models.home.component.DashboardComponent;
import com.robinhood.shared.portfolio.lists.p391ui.CuratedListSource;
import com.robinhood.shared.portfolio.lists.p391ui.CuratedListState;
import com.robinhood.shared.portfolio.lists.p391ui.UtilsKt;
import java.util.Iterator;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlinx.collections.immutable.ImmutableList;

/* compiled from: CuratedList.kt */
@Metadata(m3635d1 = {"\u0000\u0014\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u001a\u001d\u0010\u0000\u001a\u0004\u0018\u00010\u00012\f\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003H\u0007¢\u0006\u0002\u0010\u0005¨\u0006\u0006"}, m3636d2 = {"createCuratedListSection", "Lcom/robinhood/shared/portfolio/lists/ui/CuratedListState;", "items", "Lkotlinx/collections/immutable/ImmutableList;", "Lcom/robinhood/models/home/component/DashboardComponent;", "(Lkotlinx/collections/immutable/ImmutableList;Landroidx/compose/runtime/Composer;I)Lcom/robinhood/shared/portfolio/lists/ui/CuratedListState;", "lib-account-home_externalDebug"}, m3637k = 2, m3638mv = {2, 1, 0}, m3640xi = 48)
@SourceDebugExtension
/* renamed from: com.robinhood.android.dashboard.lib.CuratedListKt, reason: use source file name */
/* loaded from: classes2.dex */
public final class CuratedList2 {
    public static final CuratedListState createCuratedListSection(ImmutableList<? extends DashboardComponent> items, Composer composer, int i) {
        CuratedListState curatedListStateStreamAndRememberCuratedListState;
        DashboardComponent next;
        Composer composer2;
        Intrinsics.checkNotNullParameter(items, "items");
        composer.startReplaceGroup(-609308093);
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventStart(-609308093, i, -1, "com.robinhood.android.dashboard.lib.createCuratedListSection (CuratedList.kt:12)");
        }
        Iterator<? extends DashboardComponent> it = items.iterator();
        while (true) {
            curatedListStateStreamAndRememberCuratedListState = null;
            if (!it.hasNext()) {
                next = null;
                break;
            }
            next = it.next();
            if (next instanceof DashboardComponent.CuratedList) {
                break;
            }
        }
        DashboardComponent dashboardComponent = next;
        if (dashboardComponent instanceof DashboardComponent.CuratedList) {
            composer2 = composer;
            curatedListStateStreamAndRememberCuratedListState = UtilsKt.streamAndRememberCuratedListState(((DashboardComponent.CuratedList) dashboardComponent).getAccountNumber(), null, false, CuratedListSource.INVEST_TAB, composer2, 3072, 6);
        } else {
            composer2 = composer;
        }
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventEnd();
        }
        composer2.endReplaceGroup();
        return curatedListStateStreamAndRememberCuratedListState;
    }
}
