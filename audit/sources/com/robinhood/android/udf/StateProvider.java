package com.robinhood.android.udf;

import kotlin.Metadata;

/* compiled from: StateProvider.kt */
@Metadata(m3635d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0000\n\u0002\b\u0005\bæ\u0080\u0001\u0018\u0000*\n\b\u0000\u0010\u0001 \u0000*\u00020\u0002*\n\b\u0001\u0010\u0003 \u0001*\u00020\u00022\u00020\u0002J\u0015\u0010\u0004\u001a\u00028\u00012\u0006\u0010\u0005\u001a\u00028\u0000H&¢\u0006\u0002\u0010\u0006¨\u0006\u0007"}, m3636d2 = {"Lcom/robinhood/android/udf/StateProvider;", "DS", "", "VS", "reduce", "dataState", "(Ljava/lang/Object;)Ljava/lang/Object;", "lib-udf_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
/* loaded from: classes20.dex */
public interface StateProvider<DS, VS> {
    VS reduce(DS dataState);
}
