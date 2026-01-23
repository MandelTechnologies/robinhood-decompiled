package com.robinhood.shared.iac.herocards.data;

import com.robinhood.android.common.util.analytics.AnalyticsStrings;
import com.robinhood.android.udf.DuxoBundle;
import com.robinhood.shared.data.store.iac.IacHeroCardStore;
import dagger.internal.Factory;
import javax.inject.Provider;
import kotlin.Metadata;
import kotlin.jvm.JvmStatic;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: IacHeroCardDuxo_Factory.kt */
@Metadata(m3635d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0007\u0018\u0000 \u000b2\b\u0012\u0004\u0012\u00020\u00020\u0001:\u0001\u000bB#\u0012\f\u0010\u0003\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004\u0012\f\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00070\u0004¢\u0006\u0004\b\b\u0010\tJ\b\u0010\n\u001a\u00020\u0002H\u0016R\u0014\u0010\u0003\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004X\u0082\u0004¢\u0006\u0002\n\u0000R\u0014\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00070\u0004X\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006\f"}, m3636d2 = {"Lcom/robinhood/shared/iac/herocards/data/IacHeroCardDuxo_Factory;", "Ldagger/internal/Factory;", "Lcom/robinhood/shared/iac/herocards/data/IacHeroCardDuxo;", "iacHeroCardStore", "Ljavax/inject/Provider;", "Lcom/robinhood/shared/data/store/iac/IacHeroCardStore;", "duxoBundle", "Lcom/robinhood/android/udf/DuxoBundle;", "<init>", "(Ljavax/inject/Provider;Ljavax/inject/Provider;)V", "get", "Companion", "lib-iac-hero-cards_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
/* loaded from: classes6.dex */
public final class IacHeroCardDuxo_Factory implements Factory<IacHeroCardDuxo> {
    private final Provider<DuxoBundle> duxoBundle;
    private final Provider<IacHeroCardStore> iacHeroCardStore;

    /* renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);
    public static final int $stable = 8;

    @JvmStatic
    public static final IacHeroCardDuxo_Factory create(Provider<IacHeroCardStore> provider, Provider<DuxoBundle> provider2) {
        return INSTANCE.create(provider, provider2);
    }

    @JvmStatic
    public static final IacHeroCardDuxo newInstance(IacHeroCardStore iacHeroCardStore, DuxoBundle duxoBundle) {
        return INSTANCE.newInstance(iacHeroCardStore, duxoBundle);
    }

    public IacHeroCardDuxo_Factory(Provider<IacHeroCardStore> iacHeroCardStore, Provider<DuxoBundle> duxoBundle) {
        Intrinsics.checkNotNullParameter(iacHeroCardStore, "iacHeroCardStore");
        Intrinsics.checkNotNullParameter(duxoBundle, "duxoBundle");
        this.iacHeroCardStore = iacHeroCardStore;
        this.duxoBundle = duxoBundle;
    }

    @Override // javax.inject.Provider
    public IacHeroCardDuxo get() {
        Companion companion = INSTANCE;
        IacHeroCardStore iacHeroCardStore = this.iacHeroCardStore.get();
        Intrinsics.checkNotNullExpressionValue(iacHeroCardStore, "get(...)");
        DuxoBundle duxoBundle = this.duxoBundle.get();
        Intrinsics.checkNotNullExpressionValue(duxoBundle, "get(...)");
        return companion.newInstance(iacHeroCardStore, duxoBundle);
    }

    /* compiled from: IacHeroCardDuxo_Factory.kt */
    @Metadata(m3635d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J$\u0010\u0004\u001a\u00020\u00052\f\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\b0\u00072\f\u0010\t\u001a\b\u0012\u0004\u0012\u00020\n0\u0007H\u0007J\u0018\u0010\u000b\u001a\u00020\f2\u0006\u0010\u0006\u001a\u00020\b2\u0006\u0010\t\u001a\u00020\nH\u0007¨\u0006\r"}, m3636d2 = {"Lcom/robinhood/shared/iac/herocards/data/IacHeroCardDuxo_Factory$Companion;", "", "<init>", "()V", AnalyticsStrings.BUTTON_NEW_LIST_CREATE, "Lcom/robinhood/shared/iac/herocards/data/IacHeroCardDuxo_Factory;", "iacHeroCardStore", "Ljavax/inject/Provider;", "Lcom/robinhood/shared/data/store/iac/IacHeroCardStore;", "duxoBundle", "Lcom/robinhood/android/udf/DuxoBundle;", "newInstance", "Lcom/robinhood/shared/iac/herocards/data/IacHeroCardDuxo;", "lib-iac-hero-cards_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Companion() {
        }

        @JvmStatic
        public final IacHeroCardDuxo_Factory create(Provider<IacHeroCardStore> iacHeroCardStore, Provider<DuxoBundle> duxoBundle) {
            Intrinsics.checkNotNullParameter(iacHeroCardStore, "iacHeroCardStore");
            Intrinsics.checkNotNullParameter(duxoBundle, "duxoBundle");
            return new IacHeroCardDuxo_Factory(iacHeroCardStore, duxoBundle);
        }

        @JvmStatic
        public final IacHeroCardDuxo newInstance(IacHeroCardStore iacHeroCardStore, DuxoBundle duxoBundle) {
            Intrinsics.checkNotNullParameter(iacHeroCardStore, "iacHeroCardStore");
            Intrinsics.checkNotNullParameter(duxoBundle, "duxoBundle");
            return new IacHeroCardDuxo(iacHeroCardStore, duxoBundle);
        }
    }
}
