package com.robinhood.android.acatsin.bonusInfo;

import com.robinhood.android.common.util.analytics.AnalyticsStrings;
import com.robinhood.android.udf.DuxoBundle;
import com.robinhood.librobinhood.data.store.bonfire.AcatsBonusStore;
import dagger.internal.Factory;
import javax.inject.Provider;
import kotlin.Metadata;
import kotlin.jvm.JvmStatic;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: AcatsBonusInfoDuxo_Factory.kt */
@Metadata(m3635d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0007\u0018\u0000 \u000b2\b\u0012\u0004\u0012\u00020\u00020\u0001:\u0001\u000bB#\u0012\f\u0010\u0003\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004\u0012\f\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00070\u0004¢\u0006\u0004\b\b\u0010\tJ\b\u0010\n\u001a\u00020\u0002H\u0016R\u0014\u0010\u0003\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004X\u0082\u0004¢\u0006\u0002\n\u0000R\u0014\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00070\u0004X\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006\f"}, m3636d2 = {"Lcom/robinhood/android/acatsin/bonusInfo/AcatsBonusInfoDuxo_Factory;", "Ldagger/internal/Factory;", "Lcom/robinhood/android/acatsin/bonusInfo/AcatsBonusInfoDuxo;", "acatsBonusStore", "Ljavax/inject/Provider;", "Lcom/robinhood/librobinhood/data/store/bonfire/AcatsBonusStore;", "duxoBundle", "Lcom/robinhood/android/udf/DuxoBundle;", "<init>", "(Ljavax/inject/Provider;Ljavax/inject/Provider;)V", "get", "Companion", "feature-acats-in_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
/* loaded from: classes17.dex */
public final class AcatsBonusInfoDuxo_Factory implements Factory<AcatsBonusInfoDuxo> {
    private final Provider<AcatsBonusStore> acatsBonusStore;
    private final Provider<DuxoBundle> duxoBundle;

    /* renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);
    public static final int $stable = 8;

    @JvmStatic
    public static final AcatsBonusInfoDuxo_Factory create(Provider<AcatsBonusStore> provider, Provider<DuxoBundle> provider2) {
        return INSTANCE.create(provider, provider2);
    }

    @JvmStatic
    public static final AcatsBonusInfoDuxo newInstance(AcatsBonusStore acatsBonusStore, DuxoBundle duxoBundle) {
        return INSTANCE.newInstance(acatsBonusStore, duxoBundle);
    }

    public AcatsBonusInfoDuxo_Factory(Provider<AcatsBonusStore> acatsBonusStore, Provider<DuxoBundle> duxoBundle) {
        Intrinsics.checkNotNullParameter(acatsBonusStore, "acatsBonusStore");
        Intrinsics.checkNotNullParameter(duxoBundle, "duxoBundle");
        this.acatsBonusStore = acatsBonusStore;
        this.duxoBundle = duxoBundle;
    }

    @Override // javax.inject.Provider
    public AcatsBonusInfoDuxo get() {
        Companion companion = INSTANCE;
        AcatsBonusStore acatsBonusStore = this.acatsBonusStore.get();
        Intrinsics.checkNotNullExpressionValue(acatsBonusStore, "get(...)");
        DuxoBundle duxoBundle = this.duxoBundle.get();
        Intrinsics.checkNotNullExpressionValue(duxoBundle, "get(...)");
        return companion.newInstance(acatsBonusStore, duxoBundle);
    }

    /* compiled from: AcatsBonusInfoDuxo_Factory.kt */
    @Metadata(m3635d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J$\u0010\u0004\u001a\u00020\u00052\f\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\b0\u00072\f\u0010\t\u001a\b\u0012\u0004\u0012\u00020\n0\u0007H\u0007J\u0018\u0010\u000b\u001a\u00020\f2\u0006\u0010\u0006\u001a\u00020\b2\u0006\u0010\t\u001a\u00020\nH\u0007¨\u0006\r"}, m3636d2 = {"Lcom/robinhood/android/acatsin/bonusInfo/AcatsBonusInfoDuxo_Factory$Companion;", "", "<init>", "()V", AnalyticsStrings.BUTTON_NEW_LIST_CREATE, "Lcom/robinhood/android/acatsin/bonusInfo/AcatsBonusInfoDuxo_Factory;", "acatsBonusStore", "Ljavax/inject/Provider;", "Lcom/robinhood/librobinhood/data/store/bonfire/AcatsBonusStore;", "duxoBundle", "Lcom/robinhood/android/udf/DuxoBundle;", "newInstance", "Lcom/robinhood/android/acatsin/bonusInfo/AcatsBonusInfoDuxo;", "feature-acats-in_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Companion() {
        }

        @JvmStatic
        public final AcatsBonusInfoDuxo_Factory create(Provider<AcatsBonusStore> acatsBonusStore, Provider<DuxoBundle> duxoBundle) {
            Intrinsics.checkNotNullParameter(acatsBonusStore, "acatsBonusStore");
            Intrinsics.checkNotNullParameter(duxoBundle, "duxoBundle");
            return new AcatsBonusInfoDuxo_Factory(acatsBonusStore, duxoBundle);
        }

        @JvmStatic
        public final AcatsBonusInfoDuxo newInstance(AcatsBonusStore acatsBonusStore, DuxoBundle duxoBundle) {
            Intrinsics.checkNotNullParameter(acatsBonusStore, "acatsBonusStore");
            Intrinsics.checkNotNullParameter(duxoBundle, "duxoBundle");
            return new AcatsBonusInfoDuxo(acatsBonusStore, duxoBundle);
        }
    }
}
