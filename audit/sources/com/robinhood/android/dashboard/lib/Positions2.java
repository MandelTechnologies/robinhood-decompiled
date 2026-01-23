package com.robinhood.android.dashboard.lib;

import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import com.robinhood.android.common.portfolio.positionsList.ReorderablePositionsList;
import com.robinhood.android.common.portfolio.positionsList.ReorderablePositionsList2;
import com.robinhood.android.models.portfolio.api.PositionInstrumentType;
import com.robinhood.android.models.portfolio.api.PositionsLocation;
import com.robinhood.models.home.component.DashboardComponent;
import java.util.ArrayList;
import java.util.LinkedHashMap;
import java.util.Map;
import kotlin.Metadata;
import kotlin.Tuples2;
import kotlin.Tuples4;
import kotlin.collections.CollectionsKt;
import kotlin.collections.MapsKt;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlin.ranges.RangesKt;
import kotlinx.collections.immutable.ImmutableList;

/* compiled from: Positions.kt */
@Metadata(m3635d1 = {"\u0000$\n\u0000\n\u0002\u0010$\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\u001a'\u0010\u0000\u001a\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u00012\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005H\u0007¢\u0006\u0002\u0010\u0007\u001a\u0015\u0010\b\u001a\u00020\u00032\u0006\u0010\t\u001a\u00020\nH\u0007¢\u0006\u0002\u0010\u000b¨\u0006\f"}, m3636d2 = {"createPositionsSections", "", "Lcom/robinhood/android/models/portfolio/api/PositionInstrumentType;", "Lcom/robinhood/android/common/portfolio/positionsList/PositionsListState;", "items", "Lkotlinx/collections/immutable/ImmutableList;", "Lcom/robinhood/models/home/component/DashboardComponent;", "(Lkotlinx/collections/immutable/ImmutableList;Landroidx/compose/runtime/Composer;I)Ljava/util/Map;", "createStaticEquityPositions", "component", "Lcom/robinhood/models/home/component/DashboardComponent$Positions;", "(Lcom/robinhood/models/home/component/DashboardComponent$Positions;Landroidx/compose/runtime/Composer;I)Lcom/robinhood/android/common/portfolio/positionsList/PositionsListState;", "lib-account-home_externalDebug"}, m3637k = 2, m3638mv = {2, 1, 0}, m3640xi = 48)
@SourceDebugExtension
/* renamed from: com.robinhood.android.dashboard.lib.PositionsKt, reason: use source file name */
/* loaded from: classes2.dex */
public final class Positions2 {
    public static final ReorderablePositionsList createStaticEquityPositions(DashboardComponent.Positions component, Composer composer, int i) {
        Intrinsics.checkNotNullParameter(component, "component");
        composer.startReplaceGroup(-275658151);
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventStart(-275658151, i, -1, "com.robinhood.android.dashboard.lib.createStaticEquityPositions (Positions.kt:32)");
        }
        ReorderablePositionsList reorderablePositionsListStreamAndRememberPositionsListState = ReorderablePositionsList2.streamAndRememberPositionsListState(component.getAccountNumber(), component.getPositionsType(), PositionsLocation.HOME_TAB, false, null, composer, 3456, 16);
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventEnd();
        }
        composer.endReplaceGroup();
        return reorderablePositionsListStreamAndRememberPositionsListState;
    }

    public static final Map<PositionInstrumentType, ReorderablePositionsList> createPositionsSections(ImmutableList<? extends DashboardComponent> items, Composer composer, int i) {
        Intrinsics.checkNotNullParameter(items, "items");
        composer.startReplaceGroup(552895087);
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventStart(552895087, i, -1, "com.robinhood.android.dashboard.lib.createPositionsSections (Positions.kt:18)");
        }
        ArrayList<DashboardComponent.Positions> arrayList = new ArrayList();
        for (DashboardComponent dashboardComponent : items) {
            if (dashboardComponent instanceof DashboardComponent.Positions) {
                arrayList.add(dashboardComponent);
            }
        }
        LinkedHashMap linkedHashMap = new LinkedHashMap(RangesKt.coerceAtLeast(MapsKt.mapCapacity(CollectionsKt.collectionSizeOrDefault(arrayList, 10)), 16));
        for (DashboardComponent.Positions positions : arrayList) {
            Composer composer2 = composer;
            Tuples2 tuples2M3642to = Tuples4.m3642to(positions.getPositionsType(), ReorderablePositionsList2.streamAndRememberPositionsListState(positions.getAccountNumber(), positions.getPositionsType(), positions.getPositionsLocation(), false, null, composer2, 0, 24));
            linkedHashMap.put(tuples2M3642to.getFirst(), tuples2M3642to.getSecond());
            composer = composer2;
        }
        Composer composer3 = composer;
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventEnd();
        }
        composer3.endReplaceGroup();
        return linkedHashMap;
    }
}
