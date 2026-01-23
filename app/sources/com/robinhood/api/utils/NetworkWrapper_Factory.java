package com.robinhood.api.utils;

import com.robinhood.android.common.util.analytics.AnalyticsStrings;
import dagger.internal.Factory;
import javax.inject.Provider;
import kotlin.jvm.JvmStatic;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.CoroutineScope;

/* compiled from: NetworkWrapper_Factory.kt */
@kotlin.Metadata(m3635d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\u0018\u0000 \u000b2\b\u0012\u0004\u0012\u00020\u00020\u0001:\u0001\u000bB#\u0012\f\u0010\u0003\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004\u0012\f\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00070\u0004¢\u0006\u0004\b\b\u0010\tJ\b\u0010\n\u001a\u00020\u0002H\u0016R\u0014\u0010\u0003\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004X\u0082\u0004¢\u0006\u0002\n\u0000R\u0014\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00070\u0004X\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006\f"}, m3636d2 = {"Lcom/robinhood/api/utils/NetworkWrapper_Factory;", "Ldagger/internal/Factory;", "Lcom/robinhood/api/utils/NetworkWrapper;", "coroutineScope", "Ljavax/inject/Provider;", "Lkotlinx/coroutines/CoroutineScope;", "metadataMap", "Lcom/robinhood/api/utils/MetadataMap;", "<init>", "(Ljavax/inject/Provider;Ljavax/inject/Provider;)V", "get", "Companion", "lib-api_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
/* loaded from: classes20.dex */
public final class NetworkWrapper_Factory implements Factory<NetworkWrapper> {

    /* renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);
    private final Provider<CoroutineScope> coroutineScope;
    private final Provider<MetadataMap> metadataMap;

    @JvmStatic
    public static final NetworkWrapper_Factory create(Provider<CoroutineScope> provider, Provider<MetadataMap> provider2) {
        return INSTANCE.create(provider, provider2);
    }

    @JvmStatic
    public static final NetworkWrapper newInstance(CoroutineScope coroutineScope, MetadataMap metadataMap) {
        return INSTANCE.newInstance(coroutineScope, metadataMap);
    }

    public NetworkWrapper_Factory(Provider<CoroutineScope> coroutineScope, Provider<MetadataMap> metadataMap) {
        Intrinsics.checkNotNullParameter(coroutineScope, "coroutineScope");
        Intrinsics.checkNotNullParameter(metadataMap, "metadataMap");
        this.coroutineScope = coroutineScope;
        this.metadataMap = metadataMap;
    }

    @Override // javax.inject.Provider
    public NetworkWrapper get() {
        Companion companion = INSTANCE;
        CoroutineScope coroutineScope = this.coroutineScope.get();
        Intrinsics.checkNotNullExpressionValue(coroutineScope, "get(...)");
        MetadataMap metadataMap = this.metadataMap.get();
        Intrinsics.checkNotNullExpressionValue(metadataMap, "get(...)");
        return companion.newInstance(coroutineScope, metadataMap);
    }

    /* compiled from: NetworkWrapper_Factory.kt */
    @kotlin.Metadata(m3635d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J$\u0010\u0004\u001a\u00020\u00052\f\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\b0\u00072\f\u0010\t\u001a\b\u0012\u0004\u0012\u00020\n0\u0007H\u0007J\u0018\u0010\u000b\u001a\u00020\f2\u0006\u0010\u0006\u001a\u00020\b2\u0006\u0010\t\u001a\u00020\nH\u0007¨\u0006\r"}, m3636d2 = {"Lcom/robinhood/api/utils/NetworkWrapper_Factory$Companion;", "", "<init>", "()V", AnalyticsStrings.BUTTON_NEW_LIST_CREATE, "Lcom/robinhood/api/utils/NetworkWrapper_Factory;", "coroutineScope", "Ljavax/inject/Provider;", "Lkotlinx/coroutines/CoroutineScope;", "metadataMap", "Lcom/robinhood/api/utils/MetadataMap;", "newInstance", "Lcom/robinhood/api/utils/NetworkWrapper;", "lib-api_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Companion() {
        }

        @JvmStatic
        public final NetworkWrapper_Factory create(Provider<CoroutineScope> coroutineScope, Provider<MetadataMap> metadataMap) {
            Intrinsics.checkNotNullParameter(coroutineScope, "coroutineScope");
            Intrinsics.checkNotNullParameter(metadataMap, "metadataMap");
            return new NetworkWrapper_Factory(coroutineScope, metadataMap);
        }

        @JvmStatic
        public final NetworkWrapper newInstance(CoroutineScope coroutineScope, MetadataMap metadataMap) {
            Intrinsics.checkNotNullParameter(coroutineScope, "coroutineScope");
            Intrinsics.checkNotNullParameter(metadataMap, "metadataMap");
            return new NetworkWrapper(coroutineScope, metadataMap);
        }
    }
}
