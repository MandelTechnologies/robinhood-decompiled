package com.robinhood.api.utils;

import com.robinhood.android.common.util.analytics.AnalyticsStrings;
import com.robinhood.api.utils.RhCallAdapterFactory;
import com.robinhood.experiments.ExperimentsProvider;
import dagger.internal.Factory;
import javax.inject.Provider;
import kotlin.jvm.JvmStatic;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.CoroutineScope;

/* compiled from: SwitchingThrowableTransformer_Factory.kt */
@kotlin.Metadata(m3635d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\u0018\u0000 \u000e2\b\u0012\u0004\u0012\u00020\u00020\u0001:\u0001\u000eB?\u0012\f\u0010\u0003\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004\u0012\f\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00070\u0004\u0012\f\u0010\b\u001a\b\u0012\u0004\u0012\u00020\t0\u0004\u0012\f\u0010\n\u001a\b\u0012\u0004\u0012\u00020\t0\u0004¢\u0006\u0004\b\u000b\u0010\fJ\b\u0010\r\u001a\u00020\u0002H\u0016R\u0014\u0010\u0003\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004X\u0082\u0004¢\u0006\u0002\n\u0000R\u0014\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00070\u0004X\u0082\u0004¢\u0006\u0002\n\u0000R\u0014\u0010\b\u001a\b\u0012\u0004\u0012\u00020\t0\u0004X\u0082\u0004¢\u0006\u0002\n\u0000R\u0014\u0010\n\u001a\b\u0012\u0004\u0012\u00020\t0\u0004X\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006\u000f"}, m3636d2 = {"Lcom/robinhood/api/utils/SwitchingThrowableTransformer_Factory;", "Ldagger/internal/Factory;", "Lcom/robinhood/api/utils/SwitchingThrowableTransformer;", "coroutineScope", "Ljavax/inject/Provider;", "Lkotlinx/coroutines/CoroutineScope;", "experimentsProvider", "Lcom/robinhood/experiments/ExperimentsProvider;", "remoteConfigThrowableTransformer", "Lcom/robinhood/api/utils/RhCallAdapterFactory$ThrowableTransformer;", "malformedResponseThrowableTransformer", "<init>", "(Ljavax/inject/Provider;Ljavax/inject/Provider;Ljavax/inject/Provider;Ljavax/inject/Provider;)V", "get", "Companion", "lib-api_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
/* loaded from: classes20.dex */
public final class SwitchingThrowableTransformer_Factory implements Factory<ThrowableTransformers4> {

    /* renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);
    private final Provider<CoroutineScope> coroutineScope;
    private final Provider<ExperimentsProvider> experimentsProvider;
    private final Provider<RhCallAdapterFactory.ThrowableTransformer> malformedResponseThrowableTransformer;
    private final Provider<RhCallAdapterFactory.ThrowableTransformer> remoteConfigThrowableTransformer;

    @JvmStatic
    public static final SwitchingThrowableTransformer_Factory create(Provider<CoroutineScope> provider, Provider<ExperimentsProvider> provider2, Provider<RhCallAdapterFactory.ThrowableTransformer> provider3, Provider<RhCallAdapterFactory.ThrowableTransformer> provider4) {
        return INSTANCE.create(provider, provider2, provider3, provider4);
    }

    @JvmStatic
    public static final ThrowableTransformers4 newInstance(CoroutineScope coroutineScope, ExperimentsProvider experimentsProvider, RhCallAdapterFactory.ThrowableTransformer throwableTransformer, RhCallAdapterFactory.ThrowableTransformer throwableTransformer2) {
        return INSTANCE.newInstance(coroutineScope, experimentsProvider, throwableTransformer, throwableTransformer2);
    }

    public SwitchingThrowableTransformer_Factory(Provider<CoroutineScope> coroutineScope, Provider<ExperimentsProvider> experimentsProvider, Provider<RhCallAdapterFactory.ThrowableTransformer> remoteConfigThrowableTransformer, Provider<RhCallAdapterFactory.ThrowableTransformer> malformedResponseThrowableTransformer) {
        Intrinsics.checkNotNullParameter(coroutineScope, "coroutineScope");
        Intrinsics.checkNotNullParameter(experimentsProvider, "experimentsProvider");
        Intrinsics.checkNotNullParameter(remoteConfigThrowableTransformer, "remoteConfigThrowableTransformer");
        Intrinsics.checkNotNullParameter(malformedResponseThrowableTransformer, "malformedResponseThrowableTransformer");
        this.coroutineScope = coroutineScope;
        this.experimentsProvider = experimentsProvider;
        this.remoteConfigThrowableTransformer = remoteConfigThrowableTransformer;
        this.malformedResponseThrowableTransformer = malformedResponseThrowableTransformer;
    }

    @Override // javax.inject.Provider
    public ThrowableTransformers4 get() {
        Companion companion = INSTANCE;
        CoroutineScope coroutineScope = this.coroutineScope.get();
        Intrinsics.checkNotNullExpressionValue(coroutineScope, "get(...)");
        ExperimentsProvider experimentsProvider = this.experimentsProvider.get();
        Intrinsics.checkNotNullExpressionValue(experimentsProvider, "get(...)");
        RhCallAdapterFactory.ThrowableTransformer throwableTransformer = this.remoteConfigThrowableTransformer.get();
        Intrinsics.checkNotNullExpressionValue(throwableTransformer, "get(...)");
        RhCallAdapterFactory.ThrowableTransformer throwableTransformer2 = this.malformedResponseThrowableTransformer.get();
        Intrinsics.checkNotNullExpressionValue(throwableTransformer2, "get(...)");
        return companion.newInstance(coroutineScope, experimentsProvider, throwableTransformer, throwableTransformer2);
    }

    /* compiled from: SwitchingThrowableTransformer_Factory.kt */
    @kotlin.Metadata(m3635d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J@\u0010\u0004\u001a\u00020\u00052\f\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\b0\u00072\f\u0010\t\u001a\b\u0012\u0004\u0012\u00020\n0\u00072\f\u0010\u000b\u001a\b\u0012\u0004\u0012\u00020\f0\u00072\f\u0010\r\u001a\b\u0012\u0004\u0012\u00020\f0\u0007H\u0007J(\u0010\u000e\u001a\u00020\u000f2\u0006\u0010\u0006\u001a\u00020\b2\u0006\u0010\t\u001a\u00020\n2\u0006\u0010\u000b\u001a\u00020\f2\u0006\u0010\r\u001a\u00020\fH\u0007¨\u0006\u0010"}, m3636d2 = {"Lcom/robinhood/api/utils/SwitchingThrowableTransformer_Factory$Companion;", "", "<init>", "()V", AnalyticsStrings.BUTTON_NEW_LIST_CREATE, "Lcom/robinhood/api/utils/SwitchingThrowableTransformer_Factory;", "coroutineScope", "Ljavax/inject/Provider;", "Lkotlinx/coroutines/CoroutineScope;", "experimentsProvider", "Lcom/robinhood/experiments/ExperimentsProvider;", "remoteConfigThrowableTransformer", "Lcom/robinhood/api/utils/RhCallAdapterFactory$ThrowableTransformer;", "malformedResponseThrowableTransformer", "newInstance", "Lcom/robinhood/api/utils/SwitchingThrowableTransformer;", "lib-api_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Companion() {
        }

        @JvmStatic
        public final SwitchingThrowableTransformer_Factory create(Provider<CoroutineScope> coroutineScope, Provider<ExperimentsProvider> experimentsProvider, Provider<RhCallAdapterFactory.ThrowableTransformer> remoteConfigThrowableTransformer, Provider<RhCallAdapterFactory.ThrowableTransformer> malformedResponseThrowableTransformer) {
            Intrinsics.checkNotNullParameter(coroutineScope, "coroutineScope");
            Intrinsics.checkNotNullParameter(experimentsProvider, "experimentsProvider");
            Intrinsics.checkNotNullParameter(remoteConfigThrowableTransformer, "remoteConfigThrowableTransformer");
            Intrinsics.checkNotNullParameter(malformedResponseThrowableTransformer, "malformedResponseThrowableTransformer");
            return new SwitchingThrowableTransformer_Factory(coroutineScope, experimentsProvider, remoteConfigThrowableTransformer, malformedResponseThrowableTransformer);
        }

        @JvmStatic
        public final ThrowableTransformers4 newInstance(CoroutineScope coroutineScope, ExperimentsProvider experimentsProvider, RhCallAdapterFactory.ThrowableTransformer remoteConfigThrowableTransformer, RhCallAdapterFactory.ThrowableTransformer malformedResponseThrowableTransformer) {
            Intrinsics.checkNotNullParameter(coroutineScope, "coroutineScope");
            Intrinsics.checkNotNullParameter(experimentsProvider, "experimentsProvider");
            Intrinsics.checkNotNullParameter(remoteConfigThrowableTransformer, "remoteConfigThrowableTransformer");
            Intrinsics.checkNotNullParameter(malformedResponseThrowableTransformer, "malformedResponseThrowableTransformer");
            return new ThrowableTransformers4(coroutineScope, experimentsProvider, remoteConfigThrowableTransformer, malformedResponseThrowableTransformer);
        }
    }
}
