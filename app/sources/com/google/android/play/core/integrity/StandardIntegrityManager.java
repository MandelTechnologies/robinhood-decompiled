package com.google.android.play.core.integrity;

import android.app.Activity;
import com.google.android.gms.tasks.Task;
import com.google.android.play.integrity.internal.AbstractC5185as;
import java.util.Set;

/* compiled from: com.google.android.play:integrity@@1.4.0 */
/* loaded from: classes27.dex */
public interface StandardIntegrityManager {

    /* compiled from: com.google.android.play:integrity@@1.4.0 */
    public static abstract class PrepareIntegrityTokenRequest {

        /* compiled from: com.google.android.play:integrity@@1.4.0 */
        public static abstract class Builder {
            public abstract PrepareIntegrityTokenRequest build();

            public abstract Builder setCloudProjectNumber(long j);
        }

        public static Builder builder() {
            C5137c c5137c = new C5137c();
            c5137c.m901a(0);
            return c5137c;
        }

        /* renamed from: a */
        abstract int mo852a();

        /* renamed from: b */
        public abstract long mo853b();
    }

    /* compiled from: com.google.android.play:integrity@@1.4.0 */
    public static abstract class StandardIntegrityToken {
        public abstract Task<Integer> showDialog(Activity activity, int i);

        public abstract String token();
    }

    /* compiled from: com.google.android.play:integrity@@1.4.0 */
    public interface StandardIntegrityTokenProvider {
        Task<StandardIntegrityToken> request(StandardIntegrityTokenRequest standardIntegrityTokenRequest);
    }

    /* compiled from: com.google.android.play:integrity@@1.4.0 */
    public static abstract class StandardIntegrityTokenRequest {

        /* compiled from: com.google.android.play:integrity@@1.4.0 */
        public static abstract class Builder {
            public abstract StandardIntegrityTokenRequest build();

            public abstract Builder setRequestHash(String str);

            public abstract Builder setVerdictOptOut(Set<Integer> set);
        }

        public static Builder builder() {
            C5141f c5141f = new C5141f();
            c5141f.setVerdictOptOut(AbstractC5185as.m958h());
            return c5141f;
        }

        public abstract String requestHash();

        public abstract Set<Integer> verdictOptOut();
    }

    Task<StandardIntegrityTokenProvider> prepareIntegrityToken(PrepareIntegrityTokenRequest prepareIntegrityTokenRequest);
}
