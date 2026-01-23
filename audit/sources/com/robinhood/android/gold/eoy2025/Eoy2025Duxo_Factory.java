package com.robinhood.android.gold.eoy2025;

import androidx.lifecycle.SavedStateHandle;
import com.robinhood.android.common.util.analytics.AnalyticsStrings;
import com.robinhood.android.engagement.eoygiveaway.EoyGiveawayJavascriptBridge;
import com.robinhood.android.engagement.eoygiveaway.EoyGiveawayManager;
import com.robinhood.android.udf.DuxoBundle;
import dagger.internal.Factory;
import javax.inject.Provider;
import kotlin.Metadata;
import kotlin.jvm.JvmStatic;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: Eoy2025Duxo_Factory.kt */
@Metadata(m3635d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0007\u0018\u0000 \u000f2\b\u0012\u0004\u0012\u00020\u00020\u0001:\u0001\u000fB?\u0012\f\u0010\u0003\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004\u0012\f\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00070\u0004\u0012\f\u0010\b\u001a\b\u0012\u0004\u0012\u00020\t0\u0004\u0012\f\u0010\n\u001a\b\u0012\u0004\u0012\u00020\u000b0\u0004¢\u0006\u0004\b\f\u0010\rJ\b\u0010\u000e\u001a\u00020\u0002H\u0016R\u0014\u0010\u0003\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004X\u0082\u0004¢\u0006\u0002\n\u0000R\u0014\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00070\u0004X\u0082\u0004¢\u0006\u0002\n\u0000R\u0014\u0010\b\u001a\b\u0012\u0004\u0012\u00020\t0\u0004X\u0082\u0004¢\u0006\u0002\n\u0000R\u0014\u0010\n\u001a\b\u0012\u0004\u0012\u00020\u000b0\u0004X\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006\u0010"}, m3636d2 = {"Lcom/robinhood/android/gold/eoy2025/Eoy2025Duxo_Factory;", "Ldagger/internal/Factory;", "Lcom/robinhood/android/gold/eoy2025/Eoy2025Duxo;", "duxoBundle", "Ljavax/inject/Provider;", "Lcom/robinhood/android/udf/DuxoBundle;", "eoyGiveawayManager", "Lcom/robinhood/android/engagement/eoygiveaway/EoyGiveawayManager;", "javascriptBridge", "Lcom/robinhood/android/engagement/eoygiveaway/EoyGiveawayJavascriptBridge;", "savedStateHandle", "Landroidx/lifecycle/SavedStateHandle;", "<init>", "(Ljavax/inject/Provider;Ljavax/inject/Provider;Ljavax/inject/Provider;Ljavax/inject/Provider;)V", "get", "Companion", "feature-eoy-2025_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
/* loaded from: classes10.dex */
public final class Eoy2025Duxo_Factory implements Factory<Eoy2025Duxo> {
    private final Provider<DuxoBundle> duxoBundle;
    private final Provider<EoyGiveawayManager> eoyGiveawayManager;
    private final Provider<EoyGiveawayJavascriptBridge> javascriptBridge;
    private final Provider<SavedStateHandle> savedStateHandle;

    /* renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);
    public static final int $stable = 8;

    @JvmStatic
    public static final Eoy2025Duxo_Factory create(Provider<DuxoBundle> provider, Provider<EoyGiveawayManager> provider2, Provider<EoyGiveawayJavascriptBridge> provider3, Provider<SavedStateHandle> provider4) {
        return INSTANCE.create(provider, provider2, provider3, provider4);
    }

    @JvmStatic
    public static final Eoy2025Duxo newInstance(DuxoBundle duxoBundle, EoyGiveawayManager eoyGiveawayManager, EoyGiveawayJavascriptBridge eoyGiveawayJavascriptBridge, SavedStateHandle savedStateHandle) {
        return INSTANCE.newInstance(duxoBundle, eoyGiveawayManager, eoyGiveawayJavascriptBridge, savedStateHandle);
    }

    public Eoy2025Duxo_Factory(Provider<DuxoBundle> duxoBundle, Provider<EoyGiveawayManager> eoyGiveawayManager, Provider<EoyGiveawayJavascriptBridge> javascriptBridge, Provider<SavedStateHandle> savedStateHandle) {
        Intrinsics.checkNotNullParameter(duxoBundle, "duxoBundle");
        Intrinsics.checkNotNullParameter(eoyGiveawayManager, "eoyGiveawayManager");
        Intrinsics.checkNotNullParameter(javascriptBridge, "javascriptBridge");
        Intrinsics.checkNotNullParameter(savedStateHandle, "savedStateHandle");
        this.duxoBundle = duxoBundle;
        this.eoyGiveawayManager = eoyGiveawayManager;
        this.javascriptBridge = javascriptBridge;
        this.savedStateHandle = savedStateHandle;
    }

    @Override // javax.inject.Provider
    public Eoy2025Duxo get() {
        Companion companion = INSTANCE;
        DuxoBundle duxoBundle = this.duxoBundle.get();
        Intrinsics.checkNotNullExpressionValue(duxoBundle, "get(...)");
        EoyGiveawayManager eoyGiveawayManager = this.eoyGiveawayManager.get();
        Intrinsics.checkNotNullExpressionValue(eoyGiveawayManager, "get(...)");
        EoyGiveawayJavascriptBridge eoyGiveawayJavascriptBridge = this.javascriptBridge.get();
        Intrinsics.checkNotNullExpressionValue(eoyGiveawayJavascriptBridge, "get(...)");
        SavedStateHandle savedStateHandle = this.savedStateHandle.get();
        Intrinsics.checkNotNullExpressionValue(savedStateHandle, "get(...)");
        return companion.newInstance(duxoBundle, eoyGiveawayManager, eoyGiveawayJavascriptBridge, savedStateHandle);
    }

    /* compiled from: Eoy2025Duxo_Factory.kt */
    @Metadata(m3635d1 = {"\u00004\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J@\u0010\u0004\u001a\u00020\u00052\f\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\b0\u00072\f\u0010\t\u001a\b\u0012\u0004\u0012\u00020\n0\u00072\f\u0010\u000b\u001a\b\u0012\u0004\u0012\u00020\f0\u00072\f\u0010\r\u001a\b\u0012\u0004\u0012\u00020\u000e0\u0007H\u0007J(\u0010\u000f\u001a\u00020\u00102\u0006\u0010\u0006\u001a\u00020\b2\u0006\u0010\t\u001a\u00020\n2\u0006\u0010\u000b\u001a\u00020\f2\u0006\u0010\r\u001a\u00020\u000eH\u0007¨\u0006\u0011"}, m3636d2 = {"Lcom/robinhood/android/gold/eoy2025/Eoy2025Duxo_Factory$Companion;", "", "<init>", "()V", AnalyticsStrings.BUTTON_NEW_LIST_CREATE, "Lcom/robinhood/android/gold/eoy2025/Eoy2025Duxo_Factory;", "duxoBundle", "Ljavax/inject/Provider;", "Lcom/robinhood/android/udf/DuxoBundle;", "eoyGiveawayManager", "Lcom/robinhood/android/engagement/eoygiveaway/EoyGiveawayManager;", "javascriptBridge", "Lcom/robinhood/android/engagement/eoygiveaway/EoyGiveawayJavascriptBridge;", "savedStateHandle", "Landroidx/lifecycle/SavedStateHandle;", "newInstance", "Lcom/robinhood/android/gold/eoy2025/Eoy2025Duxo;", "feature-eoy-2025_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Companion() {
        }

        @JvmStatic
        public final Eoy2025Duxo_Factory create(Provider<DuxoBundle> duxoBundle, Provider<EoyGiveawayManager> eoyGiveawayManager, Provider<EoyGiveawayJavascriptBridge> javascriptBridge, Provider<SavedStateHandle> savedStateHandle) {
            Intrinsics.checkNotNullParameter(duxoBundle, "duxoBundle");
            Intrinsics.checkNotNullParameter(eoyGiveawayManager, "eoyGiveawayManager");
            Intrinsics.checkNotNullParameter(javascriptBridge, "javascriptBridge");
            Intrinsics.checkNotNullParameter(savedStateHandle, "savedStateHandle");
            return new Eoy2025Duxo_Factory(duxoBundle, eoyGiveawayManager, javascriptBridge, savedStateHandle);
        }

        @JvmStatic
        public final Eoy2025Duxo newInstance(DuxoBundle duxoBundle, EoyGiveawayManager eoyGiveawayManager, EoyGiveawayJavascriptBridge javascriptBridge, SavedStateHandle savedStateHandle) {
            Intrinsics.checkNotNullParameter(duxoBundle, "duxoBundle");
            Intrinsics.checkNotNullParameter(eoyGiveawayManager, "eoyGiveawayManager");
            Intrinsics.checkNotNullParameter(javascriptBridge, "javascriptBridge");
            Intrinsics.checkNotNullParameter(savedStateHandle, "savedStateHandle");
            return new Eoy2025Duxo(duxoBundle, eoyGiveawayManager, javascriptBridge, savedStateHandle);
        }
    }
}
