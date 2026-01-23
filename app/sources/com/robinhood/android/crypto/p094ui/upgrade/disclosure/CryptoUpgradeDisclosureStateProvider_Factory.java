package com.robinhood.android.crypto.p094ui.upgrade.disclosure;

import com.robinhood.android.common.util.analytics.AnalyticsStrings;
import dagger.internal.Factory;
import io.noties.markwon.Markwon;
import javax.inject.Provider;
import kotlin.Metadata;
import kotlin.jvm.JvmStatic;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: CryptoUpgradeDisclosureStateProvider_Factory.kt */
@Metadata(m3635d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0007\u0018\u0000 \t2\b\u0012\u0004\u0012\u00020\u00020\u0001:\u0001\tB\u0015\u0012\f\u0010\u0003\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004¢\u0006\u0004\b\u0006\u0010\u0007J\b\u0010\b\u001a\u00020\u0002H\u0016R\u0014\u0010\u0003\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004X\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006\n"}, m3636d2 = {"Lcom/robinhood/android/crypto/ui/upgrade/disclosure/CryptoUpgradeDisclosureStateProvider_Factory;", "Ldagger/internal/Factory;", "Lcom/robinhood/android/crypto/ui/upgrade/disclosure/CryptoUpgradeDisclosureStateProvider;", "markwon", "Ljavax/inject/Provider;", "Lio/noties/markwon/Markwon;", "<init>", "(Ljavax/inject/Provider;)V", "get", "Companion", "feature-crypto_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
/* loaded from: classes17.dex */
public final class CryptoUpgradeDisclosureStateProvider_Factory implements Factory<CryptoUpgradeDisclosureStateProvider> {
    private final Provider<Markwon> markwon;

    /* renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);
    public static final int $stable = 8;

    @JvmStatic
    public static final CryptoUpgradeDisclosureStateProvider_Factory create(Provider<Markwon> provider) {
        return INSTANCE.create(provider);
    }

    @JvmStatic
    public static final CryptoUpgradeDisclosureStateProvider newInstance(Markwon markwon) {
        return INSTANCE.newInstance(markwon);
    }

    public CryptoUpgradeDisclosureStateProvider_Factory(Provider<Markwon> markwon) {
        Intrinsics.checkNotNullParameter(markwon, "markwon");
        this.markwon = markwon;
    }

    @Override // javax.inject.Provider
    public CryptoUpgradeDisclosureStateProvider get() {
        Companion companion = INSTANCE;
        Markwon markwon = this.markwon.get();
        Intrinsics.checkNotNullExpressionValue(markwon, "get(...)");
        return companion.newInstance(markwon);
    }

    /* compiled from: CryptoUpgradeDisclosureStateProvider_Factory.kt */
    @Metadata(m3635d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0016\u0010\u0004\u001a\u00020\u00052\f\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\b0\u0007H\u0007J\u0010\u0010\t\u001a\u00020\n2\u0006\u0010\u0006\u001a\u00020\bH\u0007¨\u0006\u000b"}, m3636d2 = {"Lcom/robinhood/android/crypto/ui/upgrade/disclosure/CryptoUpgradeDisclosureStateProvider_Factory$Companion;", "", "<init>", "()V", AnalyticsStrings.BUTTON_NEW_LIST_CREATE, "Lcom/robinhood/android/crypto/ui/upgrade/disclosure/CryptoUpgradeDisclosureStateProvider_Factory;", "markwon", "Ljavax/inject/Provider;", "Lio/noties/markwon/Markwon;", "newInstance", "Lcom/robinhood/android/crypto/ui/upgrade/disclosure/CryptoUpgradeDisclosureStateProvider;", "feature-crypto_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Companion() {
        }

        @JvmStatic
        public final CryptoUpgradeDisclosureStateProvider_Factory create(Provider<Markwon> markwon) {
            Intrinsics.checkNotNullParameter(markwon, "markwon");
            return new CryptoUpgradeDisclosureStateProvider_Factory(markwon);
        }

        @JvmStatic
        public final CryptoUpgradeDisclosureStateProvider newInstance(Markwon markwon) {
            Intrinsics.checkNotNullParameter(markwon, "markwon");
            return new CryptoUpgradeDisclosureStateProvider(markwon);
        }
    }
}
