package com.robinhood.android.options.optionsdb;

import com.robinhood.database.ForDatabase;
import com.robinhood.database.InjectedTypeConverter;
import java.util.Set;
import kotlin.Metadata;

/* compiled from: OptionsDatabaseConvertersModule.kt */
@Metadata(m3635d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\"\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\bg\u0018\u00002\u00020\u0001J(\u0010\u0002\u001a\r\u0012\u0004\u0012\u00020\u00040\u0003¢\u0006\u0002\b\u00052\u0013\b\u0001\u0010\u0006\u001a\r\u0012\u0004\u0012\u00020\u00040\u0003¢\u0006\u0002\b\u0005H'J\u0013\u0010\u0007\u001a\r\u0012\u0004\u0012\u00020\u00040\u0003¢\u0006\u0002\b\u0005H'J\u0010\u0010\b\u001a\u00020\u00042\u0006\u0010\t\u001a\u00020\nH'¨\u0006\u000b"}, m3636d2 = {"Lcom/robinhood/android/options/optionsdb/OptionsDatabaseConvertersModule;", "", "bindSetIntoMap", "", "Lcom/robinhood/database/InjectedTypeConverter;", "Lkotlin/jvm/JvmSuppressWildcards;", "set", "bindSet", "bind_com_robinhood_android_options_optionsdb__OptionsRoomConverter", "converter", "Lcom/robinhood/android/options/optionsdb/OptionsRoomConverter;", "lib-options-db_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
/* loaded from: classes11.dex */
public interface OptionsDatabaseConvertersModule {
    @ForDatabase(OptionsDatabase.class)
    Set<InjectedTypeConverter> bindSet();

    Set<InjectedTypeConverter> bindSetIntoMap(@ForDatabase(OptionsDatabase.class) Set<InjectedTypeConverter> set);

    @ForDatabase(OptionsDatabase.class)
    /* renamed from: bind_com_robinhood_android_options_optionsdb__OptionsRoomConverter */
    InjectedTypeConverter m2237x69961df9(OptionsRoomConverter converter);
}
