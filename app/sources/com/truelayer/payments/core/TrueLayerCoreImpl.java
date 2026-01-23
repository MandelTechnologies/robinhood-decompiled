package com.truelayer.payments.core;

import android.content.Context;
import com.google.android.libraries.places.api.model.PlaceTypes;
import com.truelayer.payments.analytics.sender.EventSenderWorker;
import com.truelayer.payments.core.configuration.Configuration;
import com.truelayer.payments.core.network.Network;
import com.truelayer.payments.core.network.NetworkImpl;
import com.truelayer.payments.core.store.Store;
import kotlin.Lazy;
import kotlin.LazyKt;
import kotlin.Metadata;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: TrueLayerCoreImpl.kt */
@Metadata(m3635d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0000\u0018\u00002\u00020\u0001B\u0015\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005¢\u0006\u0002\u0010\u0006R\u001b\u0010\u0007\u001a\u00020\b8VX\u0096\u0084\u0002¢\u0006\f\n\u0004\b\u000b\u0010\f\u001a\u0004\b\t\u0010\nR\u0014\u0010\r\u001a\u00020\u000eX\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u000f\u0010\u0010¨\u0006\u0011"}, m3636d2 = {"Lcom/truelayer/payments/core/TrueLayerCoreImpl;", "Lcom/truelayer/payments/core/TrueLayerCore;", EventSenderWorker.INPUT_DATA_KEY_CONFIGURATION, "Lcom/truelayer/payments/core/configuration/Configuration;", "applicationContext", "Landroid/content/Context;", "(Lcom/truelayer/payments/core/configuration/Configuration;Landroid/content/Context;)V", "network", "Lcom/truelayer/payments/core/network/Network;", "getNetwork", "()Lcom/truelayer/payments/core/network/Network;", "network$delegate", "Lkotlin/Lazy;", PlaceTypes.STORE, "Lcom/truelayer/payments/core/store/Store;", "getStore", "()Lcom/truelayer/payments/core/store/Store;", "payments-core_release"}, m3637k = 1, m3638mv = {1, 9, 0}, m3640xi = 48)
/* loaded from: classes6.dex */
public final class TrueLayerCoreImpl implements TrueLayerCore {

    /* renamed from: network$delegate, reason: from kotlin metadata */
    private final Lazy network;
    private final Store store;

    public TrueLayerCoreImpl(final Configuration configuration, Context applicationContext) {
        Intrinsics.checkNotNullParameter(configuration, "configuration");
        Intrinsics.checkNotNullParameter(applicationContext, "applicationContext");
        this.network = LazyKt.lazy(new Function0<NetworkImpl>() { // from class: com.truelayer.payments.core.TrueLayerCoreImpl$network$2
            {
                super(0);
            }

            /* JADX WARN: Can't rename method to resolve collision */
            @Override // kotlin.jvm.functions.Function0
            public final NetworkImpl invoke() {
                return new NetworkImpl(configuration);
            }
        });
        this.store = Store.INSTANCE.shared(applicationContext);
    }

    @Override // com.truelayer.payments.core.TrueLayerCore
    public Network getNetwork() {
        return (Network) this.network.getValue();
    }

    @Override // com.truelayer.payments.core.TrueLayerCore
    public Store getStore() {
        return this.store;
    }
}
