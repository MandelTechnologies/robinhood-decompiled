package com.robinhood.android.secretcode;

import com.robinhood.android.common.p088ui.BaseActivity;
import com.robinhood.android.common.util.lifecycle.MainTabActivityListener;
import com.robinhood.librobinhood.data.store.sheriff.SecretCodeStore;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: SecretCodeManager.kt */
@Metadata(m3635d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\b\u0007\u0018\u00002\u00020\u0001B\u0011\b\u0007\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0004\b\u0004\u0010\u0005J\u0010\u0010\u0006\u001a\u00020\u00072\u0006\u0010\b\u001a\u00020\tH\u0016R\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006\n"}, m3636d2 = {"Lcom/robinhood/android/secretcode/SecretCodeManager;", "Lcom/robinhood/android/common/util/lifecycle/MainTabActivityListener;", "secretCodeStore", "Lcom/robinhood/librobinhood/data/store/sheriff/SecretCodeStore;", "<init>", "(Lcom/robinhood/librobinhood/data/store/sheriff/SecretCodeStore;)V", "onMainTabActivityResumed", "", "activity", "Lcom/robinhood/android/common/ui/BaseActivity;", "feature-secret-code_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
/* loaded from: classes5.dex */
public final class SecretCodeManager implements MainTabActivityListener {
    public static final int $stable = 8;
    private final SecretCodeStore secretCodeStore;

    @Override // com.robinhood.android.common.util.lifecycle.MainTabActivityListener
    public void onMainTabActivityCreated(BaseActivity baseActivity) {
        MainTabActivityListener.DefaultImpls.onMainTabActivityCreated(this, baseActivity);
    }

    public SecretCodeManager(SecretCodeStore secretCodeStore) {
        Intrinsics.checkNotNullParameter(secretCodeStore, "secretCodeStore");
        this.secretCodeStore = secretCodeStore;
    }

    @Override // com.robinhood.android.common.util.lifecycle.MainTabActivityListener
    public void onMainTabActivityResumed(BaseActivity activity) {
        Intrinsics.checkNotNullParameter(activity, "activity");
        this.secretCodeStore.refreshSecretCode(false);
    }
}
