package com.robinhood.shared.security.verify.credentials;

import com.robinhood.android.common.util.analytics.AnalyticsStrings;
import com.robinhood.android.udf.DuxoBundle;
import dagger.internal.Factory;
import javax.inject.Provider;
import kotlin.Metadata;
import kotlin.jvm.JvmStatic;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: VerifyCredentialsDuxo_Factory.kt */
@Metadata(m3635d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0007\u0018\u0000 \t2\b\u0012\u0004\u0012\u00020\u00020\u0001:\u0001\tB\u0015\u0012\f\u0010\u0003\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004¢\u0006\u0004\b\u0006\u0010\u0007J\b\u0010\b\u001a\u00020\u0002H\u0016R\u0014\u0010\u0003\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004X\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006\n"}, m3636d2 = {"Lcom/robinhood/shared/security/verify/credentials/VerifyCredentialsDuxo_Factory;", "Ldagger/internal/Factory;", "Lcom/robinhood/shared/security/verify/credentials/VerifyCredentialsDuxo;", "duxoBundle", "Ljavax/inject/Provider;", "Lcom/robinhood/android/udf/DuxoBundle;", "<init>", "(Ljavax/inject/Provider;)V", "get", "Companion", "feature-verify-credentials_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
/* loaded from: classes21.dex */
public final class VerifyCredentialsDuxo_Factory implements Factory<VerifyCredentialsDuxo> {
    private final Provider<DuxoBundle> duxoBundle;

    /* renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);
    public static final int $stable = 8;

    @JvmStatic
    public static final VerifyCredentialsDuxo_Factory create(Provider<DuxoBundle> provider) {
        return INSTANCE.create(provider);
    }

    @JvmStatic
    public static final VerifyCredentialsDuxo newInstance(DuxoBundle duxoBundle) {
        return INSTANCE.newInstance(duxoBundle);
    }

    public VerifyCredentialsDuxo_Factory(Provider<DuxoBundle> duxoBundle) {
        Intrinsics.checkNotNullParameter(duxoBundle, "duxoBundle");
        this.duxoBundle = duxoBundle;
    }

    @Override // javax.inject.Provider
    public VerifyCredentialsDuxo get() {
        Companion companion = INSTANCE;
        DuxoBundle duxoBundle = this.duxoBundle.get();
        Intrinsics.checkNotNullExpressionValue(duxoBundle, "get(...)");
        return companion.newInstance(duxoBundle);
    }

    /* compiled from: VerifyCredentialsDuxo_Factory.kt */
    @Metadata(m3635d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0016\u0010\u0004\u001a\u00020\u00052\f\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\b0\u0007H\u0007J\u0010\u0010\t\u001a\u00020\n2\u0006\u0010\u0006\u001a\u00020\bH\u0007¨\u0006\u000b"}, m3636d2 = {"Lcom/robinhood/shared/security/verify/credentials/VerifyCredentialsDuxo_Factory$Companion;", "", "<init>", "()V", AnalyticsStrings.BUTTON_NEW_LIST_CREATE, "Lcom/robinhood/shared/security/verify/credentials/VerifyCredentialsDuxo_Factory;", "duxoBundle", "Ljavax/inject/Provider;", "Lcom/robinhood/android/udf/DuxoBundle;", "newInstance", "Lcom/robinhood/shared/security/verify/credentials/VerifyCredentialsDuxo;", "feature-verify-credentials_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Companion() {
        }

        @JvmStatic
        public final VerifyCredentialsDuxo_Factory create(Provider<DuxoBundle> duxoBundle) {
            Intrinsics.checkNotNullParameter(duxoBundle, "duxoBundle");
            return new VerifyCredentialsDuxo_Factory(duxoBundle);
        }

        @JvmStatic
        public final VerifyCredentialsDuxo newInstance(DuxoBundle duxoBundle) {
            Intrinsics.checkNotNullParameter(duxoBundle, "duxoBundle");
            return new VerifyCredentialsDuxo(duxoBundle);
        }
    }
}
