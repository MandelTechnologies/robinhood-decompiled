package com.withpersona.sdk2.inquiry.governmentid.live_hint;

import android.content.Context;
import com.withpersona.sdk2.camera.GovernmentIdFeed;
import com.withpersona.sdk2.inquiry.governmentid.IdConfig;
import dagger.internal.Provider;

/* renamed from: com.withpersona.sdk2.inquiry.governmentid.live_hint.GovernmentIdHintWorker_Factory, reason: case insensitive filesystem */
/* loaded from: classes18.dex */
public final class C50848GovernmentIdHintWorker_Factory {
    private final Provider<Context> contextProvider;
    private final Provider<GovernmentIdFeed> governmentIdFeedProvider;

    public C50848GovernmentIdHintWorker_Factory(Provider<Context> provider, Provider<GovernmentIdFeed> provider2) {
        this.contextProvider = provider;
        this.governmentIdFeedProvider = provider2;
    }

    public GovernmentIdHintWorker get(IdConfig.Side side) {
        return newInstance(this.contextProvider.get(), this.governmentIdFeedProvider.get(), side);
    }

    public static C50848GovernmentIdHintWorker_Factory create(Provider<Context> provider, Provider<GovernmentIdFeed> provider2) {
        return new C50848GovernmentIdHintWorker_Factory(provider, provider2);
    }

    public static GovernmentIdHintWorker newInstance(Context context, GovernmentIdFeed governmentIdFeed, IdConfig.Side side) {
        return new GovernmentIdHintWorker(context, governmentIdFeed, side);
    }
}
