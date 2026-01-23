package com.robinhood.trader.singpass;

import com.robinhood.android.common.util.analytics.AnalyticsStrings;
import com.robinhood.android.udf.DuxoBundle;
import com.robinhood.librobinhood.data.store.identi.SingpassResultStore;
import dagger.internal.Factory;
import javax.inject.Provider;
import kotlin.Metadata;
import kotlin.jvm.JvmStatic;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: SingpassWebviewDuxo_Factory.kt */
@Metadata(m3635d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0007\u0018\u0000 \u000b2\b\u0012\u0004\u0012\u00020\u00020\u0001:\u0001\u000bB#\u0012\f\u0010\u0003\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004\u0012\f\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00070\u0004¢\u0006\u0004\b\b\u0010\tJ\b\u0010\n\u001a\u00020\u0002H\u0016R\u0014\u0010\u0003\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004X\u0082\u0004¢\u0006\u0002\n\u0000R\u0014\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00070\u0004X\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006\f"}, m3636d2 = {"Lcom/robinhood/trader/singpass/SingpassWebviewDuxo_Factory;", "Ldagger/internal/Factory;", "Lcom/robinhood/trader/singpass/SingpassWebviewDuxo;", "singpassResultStore", "Ljavax/inject/Provider;", "Lcom/robinhood/librobinhood/data/store/identi/SingpassResultStore;", "duxoBundle", "Lcom/robinhood/android/udf/DuxoBundle;", "<init>", "(Ljavax/inject/Provider;Ljavax/inject/Provider;)V", "get", "Companion", "feature-singpass_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
/* loaded from: classes12.dex */
public final class SingpassWebviewDuxo_Factory implements Factory<SingpassWebviewDuxo> {
    private final Provider<DuxoBundle> duxoBundle;
    private final Provider<SingpassResultStore> singpassResultStore;

    /* renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);
    public static final int $stable = 8;

    @JvmStatic
    public static final SingpassWebviewDuxo_Factory create(Provider<SingpassResultStore> provider, Provider<DuxoBundle> provider2) {
        return INSTANCE.create(provider, provider2);
    }

    @JvmStatic
    public static final SingpassWebviewDuxo newInstance(SingpassResultStore singpassResultStore, DuxoBundle duxoBundle) {
        return INSTANCE.newInstance(singpassResultStore, duxoBundle);
    }

    public SingpassWebviewDuxo_Factory(Provider<SingpassResultStore> singpassResultStore, Provider<DuxoBundle> duxoBundle) {
        Intrinsics.checkNotNullParameter(singpassResultStore, "singpassResultStore");
        Intrinsics.checkNotNullParameter(duxoBundle, "duxoBundle");
        this.singpassResultStore = singpassResultStore;
        this.duxoBundle = duxoBundle;
    }

    @Override // javax.inject.Provider
    public SingpassWebviewDuxo get() {
        Companion companion = INSTANCE;
        SingpassResultStore singpassResultStore = this.singpassResultStore.get();
        Intrinsics.checkNotNullExpressionValue(singpassResultStore, "get(...)");
        DuxoBundle duxoBundle = this.duxoBundle.get();
        Intrinsics.checkNotNullExpressionValue(duxoBundle, "get(...)");
        return companion.newInstance(singpassResultStore, duxoBundle);
    }

    /* compiled from: SingpassWebviewDuxo_Factory.kt */
    @Metadata(m3635d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J$\u0010\u0004\u001a\u00020\u00052\f\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\b0\u00072\f\u0010\t\u001a\b\u0012\u0004\u0012\u00020\n0\u0007H\u0007J\u0018\u0010\u000b\u001a\u00020\f2\u0006\u0010\u0006\u001a\u00020\b2\u0006\u0010\t\u001a\u00020\nH\u0007¨\u0006\r"}, m3636d2 = {"Lcom/robinhood/trader/singpass/SingpassWebviewDuxo_Factory$Companion;", "", "<init>", "()V", AnalyticsStrings.BUTTON_NEW_LIST_CREATE, "Lcom/robinhood/trader/singpass/SingpassWebviewDuxo_Factory;", "singpassResultStore", "Ljavax/inject/Provider;", "Lcom/robinhood/librobinhood/data/store/identi/SingpassResultStore;", "duxoBundle", "Lcom/robinhood/android/udf/DuxoBundle;", "newInstance", "Lcom/robinhood/trader/singpass/SingpassWebviewDuxo;", "feature-singpass_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Companion() {
        }

        @JvmStatic
        public final SingpassWebviewDuxo_Factory create(Provider<SingpassResultStore> singpassResultStore, Provider<DuxoBundle> duxoBundle) {
            Intrinsics.checkNotNullParameter(singpassResultStore, "singpassResultStore");
            Intrinsics.checkNotNullParameter(duxoBundle, "duxoBundle");
            return new SingpassWebviewDuxo_Factory(singpassResultStore, duxoBundle);
        }

        @JvmStatic
        public final SingpassWebviewDuxo newInstance(SingpassResultStore singpassResultStore, DuxoBundle duxoBundle) {
            Intrinsics.checkNotNullParameter(singpassResultStore, "singpassResultStore");
            Intrinsics.checkNotNullParameter(duxoBundle, "duxoBundle");
            return new SingpassWebviewDuxo(singpassResultStore, duxoBundle);
        }
    }
}
