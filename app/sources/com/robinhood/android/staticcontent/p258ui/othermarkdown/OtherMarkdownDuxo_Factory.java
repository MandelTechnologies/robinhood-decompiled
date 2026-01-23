package com.robinhood.android.staticcontent.p258ui.othermarkdown;

import androidx.lifecycle.SavedStateHandle;
import com.robinhood.android.common.util.analytics.AnalyticsStrings;
import com.robinhood.android.udf.DuxoBundle;
import com.robinhood.contentful.StaticContentStore;
import dagger.internal.Factory;
import javax.inject.Provider;
import kotlin.Metadata;
import kotlin.jvm.JvmStatic;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: OtherMarkdownDuxo_Factory.kt */
@Metadata(m3635d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0007\u0018\u0000 \u000f2\b\u0012\u0004\u0012\u00020\u00020\u0001:\u0001\u000fB?\u0012\f\u0010\u0003\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004\u0012\f\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00070\u0004\u0012\f\u0010\b\u001a\b\u0012\u0004\u0012\u00020\t0\u0004\u0012\f\u0010\n\u001a\b\u0012\u0004\u0012\u00020\u000b0\u0004¢\u0006\u0004\b\f\u0010\rJ\b\u0010\u000e\u001a\u00020\u0002H\u0016R\u0014\u0010\u0003\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004X\u0082\u0004¢\u0006\u0002\n\u0000R\u0014\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00070\u0004X\u0082\u0004¢\u0006\u0002\n\u0000R\u0014\u0010\b\u001a\b\u0012\u0004\u0012\u00020\t0\u0004X\u0082\u0004¢\u0006\u0002\n\u0000R\u0014\u0010\n\u001a\b\u0012\u0004\u0012\u00020\u000b0\u0004X\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006\u0010"}, m3636d2 = {"Lcom/robinhood/android/staticcontent/ui/othermarkdown/OtherMarkdownDuxo_Factory;", "Ldagger/internal/Factory;", "Lcom/robinhood/android/staticcontent/ui/othermarkdown/OtherMarkdownDuxo;", "stateProvider", "Ljavax/inject/Provider;", "Lcom/robinhood/android/staticcontent/ui/othermarkdown/OtherMarkdownStateProvider;", "savedStateHandle", "Landroidx/lifecycle/SavedStateHandle;", "contentStore", "Lcom/robinhood/contentful/StaticContentStore;", "duxoBundle", "Lcom/robinhood/android/udf/DuxoBundle;", "<init>", "(Ljavax/inject/Provider;Ljavax/inject/Provider;Ljavax/inject/Provider;Ljavax/inject/Provider;)V", "get", "Companion", "lib-product-marketing_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
/* loaded from: classes20.dex */
public final class OtherMarkdownDuxo_Factory implements Factory<OtherMarkdownDuxo> {
    private final Provider<StaticContentStore> contentStore;
    private final Provider<DuxoBundle> duxoBundle;
    private final Provider<SavedStateHandle> savedStateHandle;
    private final Provider<OtherMarkdownStateProvider> stateProvider;

    /* renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);
    public static final int $stable = 8;

    @JvmStatic
    public static final OtherMarkdownDuxo_Factory create(Provider<OtherMarkdownStateProvider> provider, Provider<SavedStateHandle> provider2, Provider<StaticContentStore> provider3, Provider<DuxoBundle> provider4) {
        return INSTANCE.create(provider, provider2, provider3, provider4);
    }

    @JvmStatic
    public static final OtherMarkdownDuxo newInstance(OtherMarkdownStateProvider otherMarkdownStateProvider, SavedStateHandle savedStateHandle, StaticContentStore staticContentStore, DuxoBundle duxoBundle) {
        return INSTANCE.newInstance(otherMarkdownStateProvider, savedStateHandle, staticContentStore, duxoBundle);
    }

    public OtherMarkdownDuxo_Factory(Provider<OtherMarkdownStateProvider> stateProvider, Provider<SavedStateHandle> savedStateHandle, Provider<StaticContentStore> contentStore, Provider<DuxoBundle> duxoBundle) {
        Intrinsics.checkNotNullParameter(stateProvider, "stateProvider");
        Intrinsics.checkNotNullParameter(savedStateHandle, "savedStateHandle");
        Intrinsics.checkNotNullParameter(contentStore, "contentStore");
        Intrinsics.checkNotNullParameter(duxoBundle, "duxoBundle");
        this.stateProvider = stateProvider;
        this.savedStateHandle = savedStateHandle;
        this.contentStore = contentStore;
        this.duxoBundle = duxoBundle;
    }

    @Override // javax.inject.Provider
    public OtherMarkdownDuxo get() {
        Companion companion = INSTANCE;
        OtherMarkdownStateProvider otherMarkdownStateProvider = this.stateProvider.get();
        Intrinsics.checkNotNullExpressionValue(otherMarkdownStateProvider, "get(...)");
        SavedStateHandle savedStateHandle = this.savedStateHandle.get();
        Intrinsics.checkNotNullExpressionValue(savedStateHandle, "get(...)");
        StaticContentStore staticContentStore = this.contentStore.get();
        Intrinsics.checkNotNullExpressionValue(staticContentStore, "get(...)");
        DuxoBundle duxoBundle = this.duxoBundle.get();
        Intrinsics.checkNotNullExpressionValue(duxoBundle, "get(...)");
        return companion.newInstance(otherMarkdownStateProvider, savedStateHandle, staticContentStore, duxoBundle);
    }

    /* compiled from: OtherMarkdownDuxo_Factory.kt */
    @Metadata(m3635d1 = {"\u00004\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J@\u0010\u0004\u001a\u00020\u00052\f\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\b0\u00072\f\u0010\t\u001a\b\u0012\u0004\u0012\u00020\n0\u00072\f\u0010\u000b\u001a\b\u0012\u0004\u0012\u00020\f0\u00072\f\u0010\r\u001a\b\u0012\u0004\u0012\u00020\u000e0\u0007H\u0007J(\u0010\u000f\u001a\u00020\u00102\u0006\u0010\u0006\u001a\u00020\b2\u0006\u0010\t\u001a\u00020\n2\u0006\u0010\u000b\u001a\u00020\f2\u0006\u0010\r\u001a\u00020\u000eH\u0007¨\u0006\u0011"}, m3636d2 = {"Lcom/robinhood/android/staticcontent/ui/othermarkdown/OtherMarkdownDuxo_Factory$Companion;", "", "<init>", "()V", AnalyticsStrings.BUTTON_NEW_LIST_CREATE, "Lcom/robinhood/android/staticcontent/ui/othermarkdown/OtherMarkdownDuxo_Factory;", "stateProvider", "Ljavax/inject/Provider;", "Lcom/robinhood/android/staticcontent/ui/othermarkdown/OtherMarkdownStateProvider;", "savedStateHandle", "Landroidx/lifecycle/SavedStateHandle;", "contentStore", "Lcom/robinhood/contentful/StaticContentStore;", "duxoBundle", "Lcom/robinhood/android/udf/DuxoBundle;", "newInstance", "Lcom/robinhood/android/staticcontent/ui/othermarkdown/OtherMarkdownDuxo;", "lib-product-marketing_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Companion() {
        }

        @JvmStatic
        public final OtherMarkdownDuxo_Factory create(Provider<OtherMarkdownStateProvider> stateProvider, Provider<SavedStateHandle> savedStateHandle, Provider<StaticContentStore> contentStore, Provider<DuxoBundle> duxoBundle) {
            Intrinsics.checkNotNullParameter(stateProvider, "stateProvider");
            Intrinsics.checkNotNullParameter(savedStateHandle, "savedStateHandle");
            Intrinsics.checkNotNullParameter(contentStore, "contentStore");
            Intrinsics.checkNotNullParameter(duxoBundle, "duxoBundle");
            return new OtherMarkdownDuxo_Factory(stateProvider, savedStateHandle, contentStore, duxoBundle);
        }

        @JvmStatic
        public final OtherMarkdownDuxo newInstance(OtherMarkdownStateProvider stateProvider, SavedStateHandle savedStateHandle, StaticContentStore contentStore, DuxoBundle duxoBundle) {
            Intrinsics.checkNotNullParameter(stateProvider, "stateProvider");
            Intrinsics.checkNotNullParameter(savedStateHandle, "savedStateHandle");
            Intrinsics.checkNotNullParameter(contentStore, "contentStore");
            Intrinsics.checkNotNullParameter(duxoBundle, "duxoBundle");
            return new OtherMarkdownDuxo(stateProvider, savedStateHandle, contentStore, duxoBundle);
        }
    }
}
