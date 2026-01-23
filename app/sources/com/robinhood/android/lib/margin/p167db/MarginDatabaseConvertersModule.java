package com.robinhood.android.lib.margin.p167db;

import com.robinhood.database.ForDatabase;
import com.robinhood.database.InjectedTypeConverter;
import com.robinhood.models.converter.MoneyTypeConverter;
import java.util.Set;
import kotlin.Metadata;

/* compiled from: MarginDatabaseConvertersModule.kt */
@Metadata(m3635d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\"\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\bg\u0018\u00002\u00020\u0001J(\u0010\u0002\u001a\r\u0012\u0004\u0012\u00020\u00040\u0003¢\u0006\u0002\b\u00052\u0013\b\u0001\u0010\u0006\u001a\r\u0012\u0004\u0012\u00020\u00040\u0003¢\u0006\u0002\b\u0005H'J\u0013\u0010\u0007\u001a\r\u0012\u0004\u0012\u00020\u00040\u0003¢\u0006\u0002\b\u0005H'J\u0010\u0010\b\u001a\u00020\u00042\u0006\u0010\t\u001a\u00020\nH'¨\u0006\u000b"}, m3636d2 = {"Lcom/robinhood/android/lib/margin/db/MarginDatabaseConvertersModule;", "", "bindSetIntoMap", "", "Lcom/robinhood/database/InjectedTypeConverter;", "Lkotlin/jvm/JvmSuppressWildcards;", "set", "bindSet", "bind_com_robinhood_models_converter__MoneyTypeConverter", "converter", "Lcom/robinhood/models/converter/MoneyTypeConverter;", "lib-margin_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
/* loaded from: classes8.dex */
public interface MarginDatabaseConvertersModule {
    @ForDatabase(MarginDatabase.class)
    Set<InjectedTypeConverter> bindSet();

    Set<InjectedTypeConverter> bindSetIntoMap(@ForDatabase(MarginDatabase.class) Set<InjectedTypeConverter> set);

    @ForDatabase(MarginDatabase.class)
    InjectedTypeConverter bind_com_robinhood_models_converter__MoneyTypeConverter(MoneyTypeConverter converter);
}
