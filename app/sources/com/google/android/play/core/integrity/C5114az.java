package com.google.android.play.core.integrity;

import com.google.android.gms.tasks.SuccessContinuation;
import com.google.android.gms.tasks.Task;
import com.google.android.gms.tasks.Tasks;
import com.google.android.play.core.integrity.StandardIntegrityManager;

/* compiled from: com.google.android.play:integrity@@1.4.0 */
/* renamed from: com.google.android.play.core.integrity.az */
/* loaded from: classes27.dex */
final class C5114az implements StandardIntegrityManager {

    /* renamed from: a */
    private final C5129bn f732a;

    /* renamed from: b */
    private final C5135bt f733b;

    C5114az(C5129bn c5129bn, C5135bt c5135bt) {
        this.f732a = c5129bn;
        this.f733b = c5135bt;
    }

    /* renamed from: a */
    final /* synthetic */ Task m878a(StandardIntegrityManager.PrepareIntegrityTokenRequest prepareIntegrityTokenRequest, Long l) throws Exception {
        final long jMo853b = prepareIntegrityTokenRequest.mo853b();
        final long jLongValue = l.longValue();
        prepareIntegrityTokenRequest.mo852a();
        final C5135bt c5135bt = this.f733b;
        final int i = 0;
        return Tasks.forResult(new StandardIntegrityManager.StandardIntegrityTokenProvider(jMo853b, jLongValue, i) { // from class: com.google.android.play.core.integrity.bs

            /* renamed from: b */
            public final /* synthetic */ long f776b;

            /* renamed from: c */
            public final /* synthetic */ long f777c;

            @Override // com.google.android.play.core.integrity.StandardIntegrityManager.StandardIntegrityTokenProvider
            public final Task request(StandardIntegrityManager.StandardIntegrityTokenRequest standardIntegrityTokenRequest) {
                return this.f775a.m900a(this.f776b, this.f777c, 0, standardIntegrityTokenRequest);
            }
        });
    }

    @Override // com.google.android.play.core.integrity.StandardIntegrityManager
    public final Task<StandardIntegrityManager.StandardIntegrityTokenProvider> prepareIntegrityToken(final StandardIntegrityManager.PrepareIntegrityTokenRequest prepareIntegrityTokenRequest) {
        long jMo853b = prepareIntegrityTokenRequest.mo853b();
        prepareIntegrityTokenRequest.mo852a();
        return this.f732a.m899e(jMo853b, 0).onSuccessTask(new SuccessContinuation() { // from class: com.google.android.play.core.integrity.ay
            @Override // com.google.android.gms.tasks.SuccessContinuation
            public final Task then(Object obj) {
                return this.f730a.m878a(prepareIntegrityTokenRequest, (Long) obj);
            }
        });
    }
}
