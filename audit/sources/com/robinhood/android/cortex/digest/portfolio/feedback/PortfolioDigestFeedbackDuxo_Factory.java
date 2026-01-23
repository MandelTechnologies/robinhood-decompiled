package com.robinhood.android.cortex.digest.portfolio.feedback;

import com.robinhood.android.common.util.analytics.AnalyticsStrings;
import com.robinhood.android.cortex.store.feedback.DigestFeedbackStore;
import com.robinhood.android.udf.DuxoBundle;
import dagger.internal.Factory;
import javax.inject.Provider;
import kotlin.Metadata;
import kotlin.jvm.JvmStatic;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: PortfolioDigestFeedbackDuxo_Factory.kt */
@Metadata(m3635d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0007\u0018\u0000 \u000b2\b\u0012\u0004\u0012\u00020\u00020\u0001:\u0001\u000bB#\u0012\f\u0010\u0003\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004\u0012\f\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00070\u0004¢\u0006\u0004\b\b\u0010\tJ\b\u0010\n\u001a\u00020\u0002H\u0016R\u0014\u0010\u0003\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004X\u0082\u0004¢\u0006\u0002\n\u0000R\u0014\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00070\u0004X\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006\f"}, m3636d2 = {"Lcom/robinhood/android/cortex/digest/portfolio/feedback/PortfolioDigestFeedbackDuxo_Factory;", "Ldagger/internal/Factory;", "Lcom/robinhood/android/cortex/digest/portfolio/feedback/PortfolioDigestFeedbackDuxo;", "digestFeedbackStore", "Ljavax/inject/Provider;", "Lcom/robinhood/android/cortex/store/feedback/DigestFeedbackStore;", "duxoBundle", "Lcom/robinhood/android/udf/DuxoBundle;", "<init>", "(Ljavax/inject/Provider;Ljavax/inject/Provider;)V", "get", "Companion", "feature-cortex-digest-portfolio_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
/* loaded from: classes2.dex */
public final class PortfolioDigestFeedbackDuxo_Factory implements Factory<PortfolioDigestFeedbackDuxo> {
    private final Provider<DigestFeedbackStore> digestFeedbackStore;
    private final Provider<DuxoBundle> duxoBundle;

    /* renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);
    public static final int $stable = 8;

    @JvmStatic
    public static final PortfolioDigestFeedbackDuxo_Factory create(Provider<DigestFeedbackStore> provider, Provider<DuxoBundle> provider2) {
        return INSTANCE.create(provider, provider2);
    }

    @JvmStatic
    public static final PortfolioDigestFeedbackDuxo newInstance(DigestFeedbackStore digestFeedbackStore, DuxoBundle duxoBundle) {
        return INSTANCE.newInstance(digestFeedbackStore, duxoBundle);
    }

    public PortfolioDigestFeedbackDuxo_Factory(Provider<DigestFeedbackStore> digestFeedbackStore, Provider<DuxoBundle> duxoBundle) {
        Intrinsics.checkNotNullParameter(digestFeedbackStore, "digestFeedbackStore");
        Intrinsics.checkNotNullParameter(duxoBundle, "duxoBundle");
        this.digestFeedbackStore = digestFeedbackStore;
        this.duxoBundle = duxoBundle;
    }

    @Override // javax.inject.Provider
    public PortfolioDigestFeedbackDuxo get() {
        Companion companion = INSTANCE;
        DigestFeedbackStore digestFeedbackStore = this.digestFeedbackStore.get();
        Intrinsics.checkNotNullExpressionValue(digestFeedbackStore, "get(...)");
        DuxoBundle duxoBundle = this.duxoBundle.get();
        Intrinsics.checkNotNullExpressionValue(duxoBundle, "get(...)");
        return companion.newInstance(digestFeedbackStore, duxoBundle);
    }

    /* compiled from: PortfolioDigestFeedbackDuxo_Factory.kt */
    @Metadata(m3635d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J$\u0010\u0004\u001a\u00020\u00052\f\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\b0\u00072\f\u0010\t\u001a\b\u0012\u0004\u0012\u00020\n0\u0007H\u0007J\u0018\u0010\u000b\u001a\u00020\f2\u0006\u0010\u0006\u001a\u00020\b2\u0006\u0010\t\u001a\u00020\nH\u0007¨\u0006\r"}, m3636d2 = {"Lcom/robinhood/android/cortex/digest/portfolio/feedback/PortfolioDigestFeedbackDuxo_Factory$Companion;", "", "<init>", "()V", AnalyticsStrings.BUTTON_NEW_LIST_CREATE, "Lcom/robinhood/android/cortex/digest/portfolio/feedback/PortfolioDigestFeedbackDuxo_Factory;", "digestFeedbackStore", "Ljavax/inject/Provider;", "Lcom/robinhood/android/cortex/store/feedback/DigestFeedbackStore;", "duxoBundle", "Lcom/robinhood/android/udf/DuxoBundle;", "newInstance", "Lcom/robinhood/android/cortex/digest/portfolio/feedback/PortfolioDigestFeedbackDuxo;", "feature-cortex-digest-portfolio_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Companion() {
        }

        @JvmStatic
        public final PortfolioDigestFeedbackDuxo_Factory create(Provider<DigestFeedbackStore> digestFeedbackStore, Provider<DuxoBundle> duxoBundle) {
            Intrinsics.checkNotNullParameter(digestFeedbackStore, "digestFeedbackStore");
            Intrinsics.checkNotNullParameter(duxoBundle, "duxoBundle");
            return new PortfolioDigestFeedbackDuxo_Factory(digestFeedbackStore, duxoBundle);
        }

        @JvmStatic
        public final PortfolioDigestFeedbackDuxo newInstance(DigestFeedbackStore digestFeedbackStore, DuxoBundle duxoBundle) {
            Intrinsics.checkNotNullParameter(digestFeedbackStore, "digestFeedbackStore");
            Intrinsics.checkNotNullParameter(duxoBundle, "duxoBundle");
            return new PortfolioDigestFeedbackDuxo(digestFeedbackStore, duxoBundle);
        }
    }
}
