package com.salesforce.android.smi.core;

import android.content.Context;
import com.robinhood.android.common.util.analytics.AnalyticsStrings;
import com.truelayer.payments.analytics.sender.EventSenderWorker;
import kotlin.Metadata;

/* compiled from: CoreClientFactory.kt */
@Metadata(m3635d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\bf\u0018\u00002\u00020\u0001J\u001f\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u0004H&¢\u0006\u0004\b\u0007\u0010\b¨\u0006\t"}, m3636d2 = {"Lcom/salesforce/android/smi/core/CoreClientFactory;", "", "Landroid/content/Context;", "context", "Lcom/salesforce/android/smi/core/Configuration;", EventSenderWorker.INPUT_DATA_KEY_CONFIGURATION, "Lcom/salesforce/android/smi/core/CoreClient;", AnalyticsStrings.BUTTON_NEW_LIST_CREATE, "(Landroid/content/Context;Lcom/salesforce/android/smi/core/Configuration;)Lcom/salesforce/android/smi/core/CoreClient;", "core_release"}, m3637k = 1, m3638mv = {2, 0, 0}, m3640xi = 48)
/* loaded from: classes12.dex */
public interface CoreClientFactory {
    CoreClient create(Context context, Configuration configuration);
}
