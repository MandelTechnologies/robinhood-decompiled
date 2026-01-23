package com.robinhood.shared.equities.instrumentdetail;

import com.robinhood.database.ForDatabase;
import com.robinhood.database.InjectedTypeConverter;
import com.robinhood.utils.room.CommonRoomConverters;
import java.util.Set;
import kotlin.Metadata;

/* compiled from: InstrumentDetailDatabaseConvertersModule.kt */
@Metadata(m3635d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\"\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\bg\u0018\u00002\u00020\u0001J(\u0010\u0002\u001a\r\u0012\u0004\u0012\u00020\u00040\u0003¢\u0006\u0002\b\u00052\u0013\b\u0001\u0010\u0006\u001a\r\u0012\u0004\u0012\u00020\u00040\u0003¢\u0006\u0002\b\u0005H'J\u0013\u0010\u0007\u001a\r\u0012\u0004\u0012\u00020\u00040\u0003¢\u0006\u0002\b\u0005H'J\u0010\u0010\b\u001a\u00020\u00042\u0006\u0010\t\u001a\u00020\nH'J\u0010\u0010\u000b\u001a\u00020\u00042\u0006\u0010\t\u001a\u00020\fH'¨\u0006\r"}, m3636d2 = {"Lcom/robinhood/shared/equities/instrumentdetail/InstrumentDetailDatabaseConvertersModule;", "", "bindSetIntoMap", "", "Lcom/robinhood/database/InjectedTypeConverter;", "Lkotlin/jvm/JvmSuppressWildcards;", "set", "bindSet", "bind_com_robinhood_utils_room__CommonRoomConverters", "converter", "Lcom/robinhood/utils/room/CommonRoomConverters;", "bind_com_robinhood_shared_equities_instrumentdetail__InstrumentDetailRoomConverters", "Lcom/robinhood/shared/equities/instrumentdetail/InstrumentDetailRoomConverters;", "lib-instrument-detail-db_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
/* loaded from: classes6.dex */
public interface InstrumentDetailDatabaseConvertersModule {
    @ForDatabase(InstrumentDetailDatabase.class)
    Set<InjectedTypeConverter> bindSet();

    Set<InjectedTypeConverter> bindSetIntoMap(@ForDatabase(InstrumentDetailDatabase.class) Set<InjectedTypeConverter> set);

    @ForDatabase(InstrumentDetailDatabase.class)
    /* renamed from: bind_com_robinhood_shared_equities_instrumentdetail__InstrumentDetailRoomConverters */
    InjectedTypeConverter m2809x1d8e7299(InstrumentDetailRoomConverters converter);

    @ForDatabase(InstrumentDetailDatabase.class)
    InjectedTypeConverter bind_com_robinhood_utils_room__CommonRoomConverters(CommonRoomConverters converter);
}
