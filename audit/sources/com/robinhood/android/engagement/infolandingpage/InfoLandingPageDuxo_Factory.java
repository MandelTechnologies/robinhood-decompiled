package com.robinhood.android.engagement.infolandingpage;

import androidx.lifecycle.SavedStateHandle;
import com.robinhood.android.common.util.analytics.AnalyticsStrings;
import com.robinhood.android.engagement.lib.infolandingpage.InfoLandingPageStore;
import com.robinhood.android.udf.DuxoBundle;
import dagger.internal.Factory;
import javax.inject.Provider;
import kotlin.Metadata;
import kotlin.jvm.JvmStatic;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: InfoLandingPageDuxo_Factory.kt */
@Metadata(m3635d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0007\u0018\u0000 \u000f2\b\u0012\u0004\u0012\u00020\u00020\u0001:\u0001\u000fB?\u0012\f\u0010\u0003\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004\u0012\f\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00070\u0004\u0012\f\u0010\b\u001a\b\u0012\u0004\u0012\u00020\t0\u0004\u0012\f\u0010\n\u001a\b\u0012\u0004\u0012\u00020\u000b0\u0004¢\u0006\u0004\b\f\u0010\rJ\b\u0010\u000e\u001a\u00020\u0002H\u0016R\u0014\u0010\u0003\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004X\u0082\u0004¢\u0006\u0002\n\u0000R\u0014\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00070\u0004X\u0082\u0004¢\u0006\u0002\n\u0000R\u0014\u0010\b\u001a\b\u0012\u0004\u0012\u00020\t0\u0004X\u0082\u0004¢\u0006\u0002\n\u0000R\u0014\u0010\n\u001a\b\u0012\u0004\u0012\u00020\u000b0\u0004X\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006\u0010"}, m3636d2 = {"Lcom/robinhood/android/engagement/infolandingpage/InfoLandingPageDuxo_Factory;", "Ldagger/internal/Factory;", "Lcom/robinhood/android/engagement/infolandingpage/InfoLandingPageDuxo;", "infoLandingPageStore", "Ljavax/inject/Provider;", "Lcom/robinhood/android/engagement/lib/infolandingpage/InfoLandingPageStore;", "duxoBundle", "Lcom/robinhood/android/udf/DuxoBundle;", "stateProvider", "Lcom/robinhood/android/engagement/infolandingpage/InfoLandingPageDataStateProvider;", "savedStateHandle", "Landroidx/lifecycle/SavedStateHandle;", "<init>", "(Ljavax/inject/Provider;Ljavax/inject/Provider;Ljavax/inject/Provider;Ljavax/inject/Provider;)V", "get", "Companion", "feature-info-landing-page_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
/* loaded from: classes7.dex */
public final class InfoLandingPageDuxo_Factory implements Factory<InfoLandingPageDuxo> {
    private final Provider<DuxoBundle> duxoBundle;
    private final Provider<InfoLandingPageStore> infoLandingPageStore;
    private final Provider<SavedStateHandle> savedStateHandle;
    private final Provider<InfoLandingPageDuxo2> stateProvider;

    /* renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);
    public static final int $stable = 8;

    @JvmStatic
    public static final InfoLandingPageDuxo_Factory create(Provider<InfoLandingPageStore> provider, Provider<DuxoBundle> provider2, Provider<InfoLandingPageDuxo2> provider3, Provider<SavedStateHandle> provider4) {
        return INSTANCE.create(provider, provider2, provider3, provider4);
    }

    @JvmStatic
    public static final InfoLandingPageDuxo newInstance(InfoLandingPageStore infoLandingPageStore, DuxoBundle duxoBundle, InfoLandingPageDuxo2 infoLandingPageDuxo2, SavedStateHandle savedStateHandle) {
        return INSTANCE.newInstance(infoLandingPageStore, duxoBundle, infoLandingPageDuxo2, savedStateHandle);
    }

    public InfoLandingPageDuxo_Factory(Provider<InfoLandingPageStore> infoLandingPageStore, Provider<DuxoBundle> duxoBundle, Provider<InfoLandingPageDuxo2> stateProvider, Provider<SavedStateHandle> savedStateHandle) {
        Intrinsics.checkNotNullParameter(infoLandingPageStore, "infoLandingPageStore");
        Intrinsics.checkNotNullParameter(duxoBundle, "duxoBundle");
        Intrinsics.checkNotNullParameter(stateProvider, "stateProvider");
        Intrinsics.checkNotNullParameter(savedStateHandle, "savedStateHandle");
        this.infoLandingPageStore = infoLandingPageStore;
        this.duxoBundle = duxoBundle;
        this.stateProvider = stateProvider;
        this.savedStateHandle = savedStateHandle;
    }

    @Override // javax.inject.Provider
    public InfoLandingPageDuxo get() {
        Companion companion = INSTANCE;
        InfoLandingPageStore infoLandingPageStore = this.infoLandingPageStore.get();
        Intrinsics.checkNotNullExpressionValue(infoLandingPageStore, "get(...)");
        DuxoBundle duxoBundle = this.duxoBundle.get();
        Intrinsics.checkNotNullExpressionValue(duxoBundle, "get(...)");
        InfoLandingPageDuxo2 infoLandingPageDuxo2 = this.stateProvider.get();
        Intrinsics.checkNotNullExpressionValue(infoLandingPageDuxo2, "get(...)");
        SavedStateHandle savedStateHandle = this.savedStateHandle.get();
        Intrinsics.checkNotNullExpressionValue(savedStateHandle, "get(...)");
        return companion.newInstance(infoLandingPageStore, duxoBundle, infoLandingPageDuxo2, savedStateHandle);
    }

    /* compiled from: InfoLandingPageDuxo_Factory.kt */
    @Metadata(m3635d1 = {"\u00004\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J@\u0010\u0004\u001a\u00020\u00052\f\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\b0\u00072\f\u0010\t\u001a\b\u0012\u0004\u0012\u00020\n0\u00072\f\u0010\u000b\u001a\b\u0012\u0004\u0012\u00020\f0\u00072\f\u0010\r\u001a\b\u0012\u0004\u0012\u00020\u000e0\u0007H\u0007J(\u0010\u000f\u001a\u00020\u00102\u0006\u0010\u0006\u001a\u00020\b2\u0006\u0010\t\u001a\u00020\n2\u0006\u0010\u000b\u001a\u00020\f2\u0006\u0010\r\u001a\u00020\u000eH\u0007¨\u0006\u0011"}, m3636d2 = {"Lcom/robinhood/android/engagement/infolandingpage/InfoLandingPageDuxo_Factory$Companion;", "", "<init>", "()V", AnalyticsStrings.BUTTON_NEW_LIST_CREATE, "Lcom/robinhood/android/engagement/infolandingpage/InfoLandingPageDuxo_Factory;", "infoLandingPageStore", "Ljavax/inject/Provider;", "Lcom/robinhood/android/engagement/lib/infolandingpage/InfoLandingPageStore;", "duxoBundle", "Lcom/robinhood/android/udf/DuxoBundle;", "stateProvider", "Lcom/robinhood/android/engagement/infolandingpage/InfoLandingPageDataStateProvider;", "savedStateHandle", "Landroidx/lifecycle/SavedStateHandle;", "newInstance", "Lcom/robinhood/android/engagement/infolandingpage/InfoLandingPageDuxo;", "feature-info-landing-page_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Companion() {
        }

        @JvmStatic
        public final InfoLandingPageDuxo_Factory create(Provider<InfoLandingPageStore> infoLandingPageStore, Provider<DuxoBundle> duxoBundle, Provider<InfoLandingPageDuxo2> stateProvider, Provider<SavedStateHandle> savedStateHandle) {
            Intrinsics.checkNotNullParameter(infoLandingPageStore, "infoLandingPageStore");
            Intrinsics.checkNotNullParameter(duxoBundle, "duxoBundle");
            Intrinsics.checkNotNullParameter(stateProvider, "stateProvider");
            Intrinsics.checkNotNullParameter(savedStateHandle, "savedStateHandle");
            return new InfoLandingPageDuxo_Factory(infoLandingPageStore, duxoBundle, stateProvider, savedStateHandle);
        }

        @JvmStatic
        public final InfoLandingPageDuxo newInstance(InfoLandingPageStore infoLandingPageStore, DuxoBundle duxoBundle, InfoLandingPageDuxo2 stateProvider, SavedStateHandle savedStateHandle) {
            Intrinsics.checkNotNullParameter(infoLandingPageStore, "infoLandingPageStore");
            Intrinsics.checkNotNullParameter(duxoBundle, "duxoBundle");
            Intrinsics.checkNotNullParameter(stateProvider, "stateProvider");
            Intrinsics.checkNotNullParameter(savedStateHandle, "savedStateHandle");
            return new InfoLandingPageDuxo(infoLandingPageStore, duxoBundle, stateProvider, savedStateHandle);
        }
    }
}
