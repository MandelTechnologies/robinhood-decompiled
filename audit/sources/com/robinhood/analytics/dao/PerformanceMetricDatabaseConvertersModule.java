package com.robinhood.analytics.dao;

import com.robinhood.analytics.models.PerformanceMetric2;
import com.robinhood.analytics.models.PerformanceSpan2;
import com.robinhood.database.ForDatabase;
import com.robinhood.database.InjectedTypeConverter;
import com.robinhood.utils.room.CommonRoomConverters;
import java.util.Set;
import kotlin.Metadata;

/* compiled from: PerformanceMetricDatabaseConvertersModule.kt */
@Metadata(m3635d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\"\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\bg\u0018\u00002\u00020\u0001J(\u0010\u0002\u001a\r\u0012\u0004\u0012\u00020\u00040\u0003¢\u0006\u0002\b\u00052\u0013\b\u0001\u0010\u0006\u001a\r\u0012\u0004\u0012\u00020\u00040\u0003¢\u0006\u0002\b\u0005H'J\u0013\u0010\u0007\u001a\r\u0012\u0004\u0012\u00020\u00040\u0003¢\u0006\u0002\b\u0005H'J\u0010\u0010\b\u001a\u00020\u00042\u0006\u0010\t\u001a\u00020\nH'J\u0010\u0010\u000b\u001a\u00020\u00042\u0006\u0010\t\u001a\u00020\fH'J\u0010\u0010\r\u001a\u00020\u00042\u0006\u0010\t\u001a\u00020\u000eH'¨\u0006\u000f"}, m3636d2 = {"Lcom/robinhood/analytics/dao/PerformanceMetricDatabaseConvertersModule;", "", "bindSetIntoMap", "", "Lcom/robinhood/database/InjectedTypeConverter;", "Lkotlin/jvm/JvmSuppressWildcards;", "set", "bindSet", "bind_com_robinhood_utils_room__CommonRoomConverters", "converter", "Lcom/robinhood/utils/room/CommonRoomConverters;", "bind_com_robinhood_analytics_models__PerformanceMetricConverters", "Lcom/robinhood/analytics/models/PerformanceMetricConverters;", "bind_com_robinhood_analytics_models__PerformanceSpanConverters", "Lcom/robinhood/analytics/models/PerformanceSpanConverters;", "lib-analytics_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
/* loaded from: classes24.dex */
public interface PerformanceMetricDatabaseConvertersModule {
    @ForDatabase(PerformanceMetricDatabase.class)
    Set<InjectedTypeConverter> bindSet();

    Set<InjectedTypeConverter> bindSetIntoMap(@ForDatabase(PerformanceMetricDatabase.class) Set<InjectedTypeConverter> set);

    @ForDatabase(PerformanceMetricDatabase.class)
    InjectedTypeConverter bind_com_robinhood_analytics_models__PerformanceMetricConverters(PerformanceMetric2 converter);

    @ForDatabase(PerformanceMetricDatabase.class)
    InjectedTypeConverter bind_com_robinhood_analytics_models__PerformanceSpanConverters(PerformanceSpan2 converter);

    @ForDatabase(PerformanceMetricDatabase.class)
    InjectedTypeConverter bind_com_robinhood_utils_room__CommonRoomConverters(CommonRoomConverters converter);
}
