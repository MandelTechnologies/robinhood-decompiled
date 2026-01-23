package com.robinhood.android.designsystem.sparkle;

import com.robinhood.android.common.util.analytics.AnalyticsStrings;
import com.robinhood.android.gold.sparkle.SparkleManager;
import com.robinhood.coroutines.p287rx.RxFactory;
import dagger.MembersInjector;
import javax.inject.Provider;
import kotlin.Metadata;
import kotlin.jvm.JvmStatic;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: SparkleDrawable_MembersInjector.kt */
@Metadata(m3635d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0002\b\u0003\u0018\u0000 \r2\b\u0012\u0004\u0012\u00020\u00020\u0001:\u0001\rB#\u0012\f\u0010\u0003\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004\u0012\f\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00070\u0004¢\u0006\u0004\b\b\u0010\tJ\u0010\u0010\n\u001a\u00020\u000b2\u0006\u0010\f\u001a\u00020\u0002H\u0016R\u0014\u0010\u0003\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004X\u0082\u0004¢\u0006\u0002\n\u0000R\u0014\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00070\u0004X\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006\u000e"}, m3636d2 = {"Lcom/robinhood/android/designsystem/sparkle/SparkleDrawable_MembersInjector;", "Ldagger/MembersInjector;", "Lcom/robinhood/android/designsystem/sparkle/SparkleDrawable;", "rxFactory", "Ljavax/inject/Provider;", "Lcom/robinhood/coroutines/rx/RxFactory;", "sparkleManager", "Lcom/robinhood/android/gold/sparkle/SparkleManager;", "<init>", "(Ljavax/inject/Provider;Ljavax/inject/Provider;)V", "injectMembers", "", "instance", "Companion", "lib-design-system_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
/* loaded from: classes2.dex */
public final class SparkleDrawable_MembersInjector implements MembersInjector<SparkleDrawable> {

    /* renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);
    private final Provider<RxFactory> rxFactory;
    private final Provider<SparkleManager> sparkleManager;

    @JvmStatic
    public static final MembersInjector<SparkleDrawable> create(Provider<RxFactory> provider, Provider<SparkleManager> provider2) {
        return INSTANCE.create(provider, provider2);
    }

    @JvmStatic
    public static final void injectRxFactory(SparkleDrawable sparkleDrawable, RxFactory rxFactory) {
        INSTANCE.injectRxFactory(sparkleDrawable, rxFactory);
    }

    @JvmStatic
    public static final void injectSparkleManager(SparkleDrawable sparkleDrawable, SparkleManager sparkleManager) {
        INSTANCE.injectSparkleManager(sparkleDrawable, sparkleManager);
    }

    public SparkleDrawable_MembersInjector(Provider<RxFactory> rxFactory, Provider<SparkleManager> sparkleManager) {
        Intrinsics.checkNotNullParameter(rxFactory, "rxFactory");
        Intrinsics.checkNotNullParameter(sparkleManager, "sparkleManager");
        this.rxFactory = rxFactory;
        this.sparkleManager = sparkleManager;
    }

    @Override // dagger.MembersInjector
    public void injectMembers(SparkleDrawable instance) {
        Intrinsics.checkNotNullParameter(instance, "instance");
        Companion companion = INSTANCE;
        RxFactory rxFactory = this.rxFactory.get();
        Intrinsics.checkNotNullExpressionValue(rxFactory, "get(...)");
        companion.injectRxFactory(instance, rxFactory);
        SparkleManager sparkleManager = this.sparkleManager.get();
        Intrinsics.checkNotNullExpressionValue(sparkleManager, "get(...)");
        companion.injectSparkleManager(instance, sparkleManager);
    }

    /* compiled from: SparkleDrawable_MembersInjector.kt */
    @Metadata(m3635d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J*\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00060\u00052\f\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\t0\b2\f\u0010\n\u001a\b\u0012\u0004\u0012\u00020\u000b0\bH\u0007J\u0018\u0010\f\u001a\u00020\r2\u0006\u0010\u000e\u001a\u00020\u00062\u0006\u0010\u0007\u001a\u00020\tH\u0007J\u0018\u0010\u000f\u001a\u00020\r2\u0006\u0010\u000e\u001a\u00020\u00062\u0006\u0010\n\u001a\u00020\u000bH\u0007¨\u0006\u0010"}, m3636d2 = {"Lcom/robinhood/android/designsystem/sparkle/SparkleDrawable_MembersInjector$Companion;", "", "<init>", "()V", AnalyticsStrings.BUTTON_NEW_LIST_CREATE, "Ldagger/MembersInjector;", "Lcom/robinhood/android/designsystem/sparkle/SparkleDrawable;", "rxFactory", "Ljavax/inject/Provider;", "Lcom/robinhood/coroutines/rx/RxFactory;", "sparkleManager", "Lcom/robinhood/android/gold/sparkle/SparkleManager;", "injectRxFactory", "", "instance", "injectSparkleManager", "lib-design-system_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Companion() {
        }

        @JvmStatic
        public final MembersInjector<SparkleDrawable> create(Provider<RxFactory> rxFactory, Provider<SparkleManager> sparkleManager) {
            Intrinsics.checkNotNullParameter(rxFactory, "rxFactory");
            Intrinsics.checkNotNullParameter(sparkleManager, "sparkleManager");
            return new SparkleDrawable_MembersInjector(rxFactory, sparkleManager);
        }

        @JvmStatic
        public final void injectRxFactory(SparkleDrawable instance, RxFactory rxFactory) {
            Intrinsics.checkNotNullParameter(instance, "instance");
            Intrinsics.checkNotNullParameter(rxFactory, "rxFactory");
            instance.setRxFactory(rxFactory);
        }

        @JvmStatic
        public final void injectSparkleManager(SparkleDrawable instance, SparkleManager sparkleManager) {
            Intrinsics.checkNotNullParameter(instance, "instance");
            Intrinsics.checkNotNullParameter(sparkleManager, "sparkleManager");
            instance.setSparkleManager(sparkleManager);
        }
    }
}
