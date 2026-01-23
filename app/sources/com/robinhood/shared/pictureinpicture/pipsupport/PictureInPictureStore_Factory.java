package com.robinhood.shared.pictureinpicture.pipsupport;

import android.content.Context;
import com.robinhood.android.common.util.analytics.AnalyticsStrings;
import com.robinhood.android.navigation.Navigator;
import com.robinhood.librobinhood.data.store.ExperimentsStore;
import dagger.internal.Factory;
import javax.inject.Provider;
import kotlin.Metadata;
import kotlin.jvm.JvmStatic;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: PictureInPictureStore_Factory.kt */
@Metadata(m3635d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\u0018\u0000 \r2\b\u0012\u0004\u0012\u00020\u00020\u0001:\u0001\rB1\u0012\f\u0010\u0003\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004\u0012\f\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00070\u0004\u0012\f\u0010\b\u001a\b\u0012\u0004\u0012\u00020\t0\u0004¢\u0006\u0004\b\n\u0010\u000bJ\b\u0010\f\u001a\u00020\u0002H\u0016R\u0014\u0010\u0003\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004X\u0082\u0004¢\u0006\u0002\n\u0000R\u0014\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00070\u0004X\u0082\u0004¢\u0006\u0002\n\u0000R\u0014\u0010\b\u001a\b\u0012\u0004\u0012\u00020\t0\u0004X\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006\u000e"}, m3636d2 = {"Lcom/robinhood/shared/pictureinpicture/pipsupport/PictureInPictureStore_Factory;", "Ldagger/internal/Factory;", "Lcom/robinhood/shared/pictureinpicture/pipsupport/PictureInPictureStore;", "experimentsStore", "Ljavax/inject/Provider;", "Lcom/robinhood/librobinhood/data/store/ExperimentsStore;", "applicationContext", "Landroid/content/Context;", "navigator", "Lcom/robinhood/android/navigation/Navigator;", "<init>", "(Ljavax/inject/Provider;Ljavax/inject/Provider;Ljavax/inject/Provider;)V", "get", "Companion", "lib-pip-support_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
/* loaded from: classes21.dex */
public final class PictureInPictureStore_Factory implements Factory<PictureInPictureStore> {

    /* renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);
    private final Provider<Context> applicationContext;
    private final Provider<ExperimentsStore> experimentsStore;
    private final Provider<Navigator> navigator;

    @JvmStatic
    public static final PictureInPictureStore_Factory create(Provider<ExperimentsStore> provider, Provider<Context> provider2, Provider<Navigator> provider3) {
        return INSTANCE.create(provider, provider2, provider3);
    }

    @JvmStatic
    public static final PictureInPictureStore newInstance(ExperimentsStore experimentsStore, Context context, Navigator navigator) {
        return INSTANCE.newInstance(experimentsStore, context, navigator);
    }

    public PictureInPictureStore_Factory(Provider<ExperimentsStore> experimentsStore, Provider<Context> applicationContext, Provider<Navigator> navigator) {
        Intrinsics.checkNotNullParameter(experimentsStore, "experimentsStore");
        Intrinsics.checkNotNullParameter(applicationContext, "applicationContext");
        Intrinsics.checkNotNullParameter(navigator, "navigator");
        this.experimentsStore = experimentsStore;
        this.applicationContext = applicationContext;
        this.navigator = navigator;
    }

    @Override // javax.inject.Provider
    public PictureInPictureStore get() {
        Companion companion = INSTANCE;
        ExperimentsStore experimentsStore = this.experimentsStore.get();
        Intrinsics.checkNotNullExpressionValue(experimentsStore, "get(...)");
        Context context = this.applicationContext.get();
        Intrinsics.checkNotNullExpressionValue(context, "get(...)");
        Navigator navigator = this.navigator.get();
        Intrinsics.checkNotNullExpressionValue(navigator, "get(...)");
        return companion.newInstance(experimentsStore, context, navigator);
    }

    /* compiled from: PictureInPictureStore_Factory.kt */
    @Metadata(m3635d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J2\u0010\u0004\u001a\u00020\u00052\f\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\b0\u00072\f\u0010\t\u001a\b\u0012\u0004\u0012\u00020\n0\u00072\f\u0010\u000b\u001a\b\u0012\u0004\u0012\u00020\f0\u0007H\u0007J \u0010\r\u001a\u00020\u000e2\u0006\u0010\u0006\u001a\u00020\b2\u0006\u0010\t\u001a\u00020\n2\u0006\u0010\u000b\u001a\u00020\fH\u0007¨\u0006\u000f"}, m3636d2 = {"Lcom/robinhood/shared/pictureinpicture/pipsupport/PictureInPictureStore_Factory$Companion;", "", "<init>", "()V", AnalyticsStrings.BUTTON_NEW_LIST_CREATE, "Lcom/robinhood/shared/pictureinpicture/pipsupport/PictureInPictureStore_Factory;", "experimentsStore", "Ljavax/inject/Provider;", "Lcom/robinhood/librobinhood/data/store/ExperimentsStore;", "applicationContext", "Landroid/content/Context;", "navigator", "Lcom/robinhood/android/navigation/Navigator;", "newInstance", "Lcom/robinhood/shared/pictureinpicture/pipsupport/PictureInPictureStore;", "lib-pip-support_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Companion() {
        }

        @JvmStatic
        public final PictureInPictureStore_Factory create(Provider<ExperimentsStore> experimentsStore, Provider<Context> applicationContext, Provider<Navigator> navigator) {
            Intrinsics.checkNotNullParameter(experimentsStore, "experimentsStore");
            Intrinsics.checkNotNullParameter(applicationContext, "applicationContext");
            Intrinsics.checkNotNullParameter(navigator, "navigator");
            return new PictureInPictureStore_Factory(experimentsStore, applicationContext, navigator);
        }

        @JvmStatic
        public final PictureInPictureStore newInstance(ExperimentsStore experimentsStore, Context applicationContext, Navigator navigator) {
            Intrinsics.checkNotNullParameter(experimentsStore, "experimentsStore");
            Intrinsics.checkNotNullParameter(applicationContext, "applicationContext");
            Intrinsics.checkNotNullParameter(navigator, "navigator");
            return new PictureInPictureStore(experimentsStore, applicationContext, navigator);
        }
    }
}
