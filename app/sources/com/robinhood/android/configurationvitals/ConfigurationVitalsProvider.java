package com.robinhood.android.configurationvitals;

import com.robinhood.models.api.ConfigurationVitals;
import kotlin.Metadata;
import kotlin.coroutines.Continuation;

/* compiled from: ConfigurationVitalsProvider.kt */
@Metadata(m3635d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\bf\u0018\u00002\u00020\u0001J\u000e\u0010\u0002\u001a\u00020\u0003H¦@¢\u0006\u0002\u0010\u0004¨\u0006\u0005"}, m3636d2 = {"Lcom/robinhood/android/configurationvitals/ConfigurationVitalsProvider;", "", "getConfigurationVitals", "Lcom/robinhood/models/api/ConfigurationVitals;", "(Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "lib-configuration-vitals_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
/* loaded from: classes17.dex */
public interface ConfigurationVitalsProvider {
    Object getConfigurationVitals(Continuation<? super ConfigurationVitals> continuation);
}
