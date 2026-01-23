package com.withpersona.sdk2.inquiry.governmentid;

import android.content.Context;
import com.withpersona.sdk2.camera.GovernmentIdFeed;
import com.withpersona.sdk2.inquiry.governmentid.IdConfig;
import com.withpersona.sdk2.inquiry.shared.files.SdkFilesManager;
import dagger.internal.Provider;

/* renamed from: com.withpersona.sdk2.inquiry.governmentid.GovernmentIdAnalyzeWorker_Factory, reason: case insensitive filesystem */
/* loaded from: classes18.dex */
public final class C50847GovernmentIdAnalyzeWorker_Factory {
    private final Provider<Context> contextProvider;
    private final Provider<GovernmentIdFeed> governmentIdFeedProvider;
    private final Provider<SdkFilesManager> sdkFilesManagerProvider;

    public C50847GovernmentIdAnalyzeWorker_Factory(Provider<Context> provider, Provider<GovernmentIdFeed> provider2, Provider<SdkFilesManager> provider3) {
        this.contextProvider = provider;
        this.governmentIdFeedProvider = provider2;
        this.sdkFilesManagerProvider = provider3;
    }

    public GovernmentIdAnalyzeWorker get(IdConfig.Side side, String str) {
        return newInstance(this.contextProvider.get(), this.governmentIdFeedProvider.get(), this.sdkFilesManagerProvider.get(), side, str);
    }

    public static C50847GovernmentIdAnalyzeWorker_Factory create(Provider<Context> provider, Provider<GovernmentIdFeed> provider2, Provider<SdkFilesManager> provider3) {
        return new C50847GovernmentIdAnalyzeWorker_Factory(provider, provider2, provider3);
    }

    public static GovernmentIdAnalyzeWorker newInstance(Context context, GovernmentIdFeed governmentIdFeed, SdkFilesManager sdkFilesManager, IdConfig.Side side, String str) {
        return new GovernmentIdAnalyzeWorker(context, governmentIdFeed, sdkFilesManager, side, str);
    }
}
