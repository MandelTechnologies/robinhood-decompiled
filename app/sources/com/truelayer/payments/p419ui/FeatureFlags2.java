package com.truelayer.payments.p419ui;

import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: FeatureFlags.kt */
@Metadata(m3635d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0003\bÀ\u0002\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002R\u0014\u0010\u0003\u001a\u00020\u0004X\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0005\u0010\u0006¨\u0006\u0007"}, m3636d2 = {"Lcom/truelayer/payments/ui/FeatureFlagsImpl;", "Lcom/truelayer/payments/ui/FeatureFlags;", "()V", "saveUserAccount", "", "getSaveUserAccount", "()Z", "payments-ui_release"}, m3637k = 1, m3638mv = {1, 9, 0}, m3640xi = 48)
/* renamed from: com.truelayer.payments.ui.FeatureFlagsImpl, reason: use source file name */
/* loaded from: classes12.dex */
public final class FeatureFlags2 implements FeatureFlags {
    public static final int $stable = 0;
    public static final FeatureFlags2 INSTANCE = new FeatureFlags2();
    private static final boolean saveUserAccount;

    private FeatureFlags2() {
    }

    static {
        Boolean FEATURE_SAVE_ACCOUNT_DETAILS = BuildConfig.FEATURE_SAVE_ACCOUNT_DETAILS;
        Intrinsics.checkNotNullExpressionValue(FEATURE_SAVE_ACCOUNT_DETAILS, "FEATURE_SAVE_ACCOUNT_DETAILS");
        saveUserAccount = FEATURE_SAVE_ACCOUNT_DETAILS.booleanValue();
    }

    @Override // com.truelayer.payments.p419ui.FeatureFlags
    public boolean getSaveUserAccount() {
        return saveUserAccount;
    }
}
