package com.robinhood.android.equitydetail.p123ui.similarinstruments;

import com.robinhood.android.common.util.analytics.AnalyticsStrings;
import com.robinhood.android.navigation.Navigator;
import dagger.MembersInjector;
import javax.inject.Provider;
import kotlin.Metadata;
import kotlin.jvm.JvmStatic;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: SimilarInstrumentsV2View_MembersInjector.kt */
@Metadata(m3635d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0002\b\u0003\b\u0007\u0018\u0000 \u000b2\b\u0012\u0004\u0012\u00020\u00020\u0001:\u0001\u000bB\u0015\u0012\f\u0010\u0003\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004¢\u0006\u0004\b\u0006\u0010\u0007J\u0010\u0010\b\u001a\u00020\t2\u0006\u0010\n\u001a\u00020\u0002H\u0016R\u0014\u0010\u0003\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004X\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006\f"}, m3636d2 = {"Lcom/robinhood/android/equitydetail/ui/similarinstruments/SimilarInstrumentsV2View_MembersInjector;", "Ldagger/MembersInjector;", "Lcom/robinhood/android/equitydetail/ui/similarinstruments/SimilarInstrumentsV2View;", "navigator", "Ljavax/inject/Provider;", "Lcom/robinhood/android/navigation/Navigator;", "<init>", "(Ljavax/inject/Provider;)V", "injectMembers", "", "instance", "Companion", "feature-equity-detail_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
/* loaded from: classes3.dex */
public final class SimilarInstrumentsV2View_MembersInjector implements MembersInjector<SimilarInstrumentsV2View> {
    private final Provider<Navigator> navigator;

    /* renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);
    public static final int $stable = 8;

    @JvmStatic
    public static final MembersInjector<SimilarInstrumentsV2View> create(Provider<Navigator> provider) {
        return INSTANCE.create(provider);
    }

    @JvmStatic
    public static final void injectNavigator(SimilarInstrumentsV2View similarInstrumentsV2View, Navigator navigator) {
        INSTANCE.injectNavigator(similarInstrumentsV2View, navigator);
    }

    public SimilarInstrumentsV2View_MembersInjector(Provider<Navigator> navigator) {
        Intrinsics.checkNotNullParameter(navigator, "navigator");
        this.navigator = navigator;
    }

    @Override // dagger.MembersInjector
    public void injectMembers(SimilarInstrumentsV2View instance) {
        Intrinsics.checkNotNullParameter(instance, "instance");
        Companion companion = INSTANCE;
        Navigator navigator = this.navigator.get();
        Intrinsics.checkNotNullExpressionValue(navigator, "get(...)");
        companion.injectNavigator(instance, navigator);
    }

    /* compiled from: SimilarInstrumentsV2View_MembersInjector.kt */
    @Metadata(m3635d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u001c\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00060\u00052\f\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\t0\bH\u0007J\u0018\u0010\n\u001a\u00020\u000b2\u0006\u0010\f\u001a\u00020\u00062\u0006\u0010\u0007\u001a\u00020\tH\u0007¨\u0006\r"}, m3636d2 = {"Lcom/robinhood/android/equitydetail/ui/similarinstruments/SimilarInstrumentsV2View_MembersInjector$Companion;", "", "<init>", "()V", AnalyticsStrings.BUTTON_NEW_LIST_CREATE, "Ldagger/MembersInjector;", "Lcom/robinhood/android/equitydetail/ui/similarinstruments/SimilarInstrumentsV2View;", "navigator", "Ljavax/inject/Provider;", "Lcom/robinhood/android/navigation/Navigator;", "injectNavigator", "", "instance", "feature-equity-detail_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Companion() {
        }

        @JvmStatic
        public final MembersInjector<SimilarInstrumentsV2View> create(Provider<Navigator> navigator) {
            Intrinsics.checkNotNullParameter(navigator, "navigator");
            return new SimilarInstrumentsV2View_MembersInjector(navigator);
        }

        @JvmStatic
        public final void injectNavigator(SimilarInstrumentsV2View instance, Navigator navigator) {
            Intrinsics.checkNotNullParameter(instance, "instance");
            Intrinsics.checkNotNullParameter(navigator, "navigator");
            instance.setNavigator(navigator);
        }
    }
}
