package com.robinhood.android.newsfeed.breakingnews.p198ui;

import com.robinhood.android.common.util.analytics.AnalyticsStrings;
import com.robinhood.android.newsfeed.store.breakingnews.BreakingNewsStore;
import com.robinhood.android.udf.DuxoBundle;
import com.robinhood.librobinhood.data.store.ExperimentsStore;
import dagger.internal.Factory;
import javax.inject.Provider;
import kotlin.Metadata;
import kotlin.jvm.JvmStatic;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: BreakingNewsCardDuxo_Factory.kt */
@Metadata(m3635d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0007\u0018\u0000 \r2\b\u0012\u0004\u0012\u00020\u00020\u0001:\u0001\rB1\u0012\f\u0010\u0003\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004\u0012\f\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00070\u0004\u0012\f\u0010\b\u001a\b\u0012\u0004\u0012\u00020\t0\u0004¢\u0006\u0004\b\n\u0010\u000bJ\b\u0010\f\u001a\u00020\u0002H\u0016R\u0014\u0010\u0003\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004X\u0082\u0004¢\u0006\u0002\n\u0000R\u0014\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00070\u0004X\u0082\u0004¢\u0006\u0002\n\u0000R\u0014\u0010\b\u001a\b\u0012\u0004\u0012\u00020\t0\u0004X\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006\u000e"}, m3636d2 = {"Lcom/robinhood/android/newsfeed/breakingnews/ui/BreakingNewsCardDuxo_Factory;", "Ldagger/internal/Factory;", "Lcom/robinhood/android/newsfeed/breakingnews/ui/BreakingNewsCardDuxo;", "duxoBundle", "Ljavax/inject/Provider;", "Lcom/robinhood/android/udf/DuxoBundle;", "experimentsStore", "Lcom/robinhood/librobinhood/data/store/ExperimentsStore;", "breakingNewsStore", "Lcom/robinhood/android/newsfeed/store/breakingnews/BreakingNewsStore;", "<init>", "(Ljavax/inject/Provider;Ljavax/inject/Provider;Ljavax/inject/Provider;)V", "get", "Companion", "lib-breakingnews-ui_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
/* loaded from: classes8.dex */
public final class BreakingNewsCardDuxo_Factory implements Factory<BreakingNewsCardWrapper> {
    private final Provider<BreakingNewsStore> breakingNewsStore;
    private final Provider<DuxoBundle> duxoBundle;
    private final Provider<ExperimentsStore> experimentsStore;

    /* renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);
    public static final int $stable = 8;

    @JvmStatic
    public static final BreakingNewsCardDuxo_Factory create(Provider<DuxoBundle> provider, Provider<ExperimentsStore> provider2, Provider<BreakingNewsStore> provider3) {
        return INSTANCE.create(provider, provider2, provider3);
    }

    @JvmStatic
    public static final BreakingNewsCardWrapper newInstance(DuxoBundle duxoBundle, ExperimentsStore experimentsStore, BreakingNewsStore breakingNewsStore) {
        return INSTANCE.newInstance(duxoBundle, experimentsStore, breakingNewsStore);
    }

    public BreakingNewsCardDuxo_Factory(Provider<DuxoBundle> duxoBundle, Provider<ExperimentsStore> experimentsStore, Provider<BreakingNewsStore> breakingNewsStore) {
        Intrinsics.checkNotNullParameter(duxoBundle, "duxoBundle");
        Intrinsics.checkNotNullParameter(experimentsStore, "experimentsStore");
        Intrinsics.checkNotNullParameter(breakingNewsStore, "breakingNewsStore");
        this.duxoBundle = duxoBundle;
        this.experimentsStore = experimentsStore;
        this.breakingNewsStore = breakingNewsStore;
    }

    @Override // javax.inject.Provider
    public BreakingNewsCardWrapper get() {
        Companion companion = INSTANCE;
        DuxoBundle duxoBundle = this.duxoBundle.get();
        Intrinsics.checkNotNullExpressionValue(duxoBundle, "get(...)");
        ExperimentsStore experimentsStore = this.experimentsStore.get();
        Intrinsics.checkNotNullExpressionValue(experimentsStore, "get(...)");
        BreakingNewsStore breakingNewsStore = this.breakingNewsStore.get();
        Intrinsics.checkNotNullExpressionValue(breakingNewsStore, "get(...)");
        return companion.newInstance(duxoBundle, experimentsStore, breakingNewsStore);
    }

    /* compiled from: BreakingNewsCardDuxo_Factory.kt */
    @Metadata(m3635d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J2\u0010\u0004\u001a\u00020\u00052\f\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\b0\u00072\f\u0010\t\u001a\b\u0012\u0004\u0012\u00020\n0\u00072\f\u0010\u000b\u001a\b\u0012\u0004\u0012\u00020\f0\u0007H\u0007J \u0010\r\u001a\u00020\u000e2\u0006\u0010\u0006\u001a\u00020\b2\u0006\u0010\t\u001a\u00020\n2\u0006\u0010\u000b\u001a\u00020\fH\u0007¨\u0006\u000f"}, m3636d2 = {"Lcom/robinhood/android/newsfeed/breakingnews/ui/BreakingNewsCardDuxo_Factory$Companion;", "", "<init>", "()V", AnalyticsStrings.BUTTON_NEW_LIST_CREATE, "Lcom/robinhood/android/newsfeed/breakingnews/ui/BreakingNewsCardDuxo_Factory;", "duxoBundle", "Ljavax/inject/Provider;", "Lcom/robinhood/android/udf/DuxoBundle;", "experimentsStore", "Lcom/robinhood/librobinhood/data/store/ExperimentsStore;", "breakingNewsStore", "Lcom/robinhood/android/newsfeed/store/breakingnews/BreakingNewsStore;", "newInstance", "Lcom/robinhood/android/newsfeed/breakingnews/ui/BreakingNewsCardDuxo;", "lib-breakingnews-ui_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Companion() {
        }

        @JvmStatic
        public final BreakingNewsCardDuxo_Factory create(Provider<DuxoBundle> duxoBundle, Provider<ExperimentsStore> experimentsStore, Provider<BreakingNewsStore> breakingNewsStore) {
            Intrinsics.checkNotNullParameter(duxoBundle, "duxoBundle");
            Intrinsics.checkNotNullParameter(experimentsStore, "experimentsStore");
            Intrinsics.checkNotNullParameter(breakingNewsStore, "breakingNewsStore");
            return new BreakingNewsCardDuxo_Factory(duxoBundle, experimentsStore, breakingNewsStore);
        }

        @JvmStatic
        public final BreakingNewsCardWrapper newInstance(DuxoBundle duxoBundle, ExperimentsStore experimentsStore, BreakingNewsStore breakingNewsStore) {
            Intrinsics.checkNotNullParameter(duxoBundle, "duxoBundle");
            Intrinsics.checkNotNullParameter(experimentsStore, "experimentsStore");
            Intrinsics.checkNotNullParameter(breakingNewsStore, "breakingNewsStore");
            return new BreakingNewsCardWrapper(duxoBundle, experimentsStore, breakingNewsStore);
        }
    }
}
