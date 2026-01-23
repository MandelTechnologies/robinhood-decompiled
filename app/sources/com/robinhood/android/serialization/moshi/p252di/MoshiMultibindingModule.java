package com.robinhood.android.serialization.moshi.p252di;

import com.robinhood.utils.moshi.JsonAdapterBinding;
import com.squareup.moshi.JsonAdapter;
import java.util.Set;
import kotlin.Metadata;

/* compiled from: MoshiMultibindingModule.kt */
@Metadata(m3635d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\"\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\bg\u0018\u00002\u00020\u0001J\u0013\u0010\u0002\u001a\r\u0012\u0004\u0012\u00020\u00040\u0003¢\u0006\u0002\b\u0005H'J\u0013\u0010\u0006\u001a\r\u0012\u0004\u0012\u00020\u00070\u0003¢\u0006\u0002\b\u0005H'¨\u0006\b"}, m3636d2 = {"Lcom/robinhood/android/serialization/moshi/di/MoshiMultibindingModule;", "", "bindAdapters", "", "Lcom/robinhood/utils/moshi/JsonAdapterBinding;", "Lkotlin/jvm/JvmSuppressWildcards;", "bindAdapterFactories", "Lcom/squareup/moshi/JsonAdapter$Factory;", "lib-serialization-provisions_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
/* loaded from: classes5.dex */
public interface MoshiMultibindingModule {
    Set<JsonAdapter.Factory> bindAdapterFactories();

    Set<JsonAdapterBinding> bindAdapters();
}
