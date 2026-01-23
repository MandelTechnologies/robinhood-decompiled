package com.robinhood.equities.eventupdates;

import com.robinhood.android.udf.StateProvider;
import com.robinhood.equities.eventupdates.EquityEventUpdatesSectionDuxo5;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.collections.immutable.extensions2;

/* compiled from: EquityEventUpdatesSectionDuxo.kt */
@Metadata(m3635d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0007\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001B\t\b\u0007¢\u0006\u0004\b\u0004\u0010\u0005J\u0010\u0010\u0006\u001a\u00020\u00032\u0006\u0010\u0007\u001a\u00020\u0002H\u0016¨\u0006\b"}, m3636d2 = {"Lcom/robinhood/equities/eventupdates/EquityEventUpdatesStateProvider;", "Lcom/robinhood/android/udf/StateProvider;", "Lcom/robinhood/equities/eventupdates/EquityEventUpdatesDataState;", "Lcom/robinhood/equities/eventupdates/EquityEventUpdatesViewState;", "<init>", "()V", "reduce", "dataState", "lib-equity-event-updates_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
/* renamed from: com.robinhood.equities.eventupdates.EquityEventUpdatesStateProvider, reason: use source file name */
/* loaded from: classes15.dex */
public final class EquityEventUpdatesSectionDuxo4 implements StateProvider<EquityEventUpdatesDataState, EquityEventUpdatesSectionDuxo5> {
    public static final int $stable = 0;

    @Override // com.robinhood.android.udf.StateProvider
    public EquityEventUpdatesSectionDuxo5 reduce(EquityEventUpdatesDataState dataState) {
        Intrinsics.checkNotNullParameter(dataState, "dataState");
        if (dataState.getUpdates() == null) {
            return EquityEventUpdatesSectionDuxo5.Loading.INSTANCE;
        }
        if (dataState.getUpdates().isEmpty()) {
            return EquityEventUpdatesSectionDuxo5.Empty.INSTANCE;
        }
        return new EquityEventUpdatesSectionDuxo5.Loaded(extensions2.toPersistentList(dataState.getUpdates().subList(0, Math.min(dataState.getUpdates().size(), 3))), dataState.getUpdates().size() > 3);
    }
}
