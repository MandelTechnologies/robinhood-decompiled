package microgram.android.internal.bundle.signature.key;

import java.security.PublicKey;
import java.util.Map;
import kotlin.Metadata;

/* compiled from: SigningKeysModule.kt */
@Metadata(m3635d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010$\n\u0002\u0010\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bÇ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0019\u0010\u0004\u001a\u0013\u0012\u0004\u0012\u00020\u0006\u0012\u0004\u0012\u00020\u00070\u0005¢\u0006\u0002\b\bH\u0007¨\u0006\t"}, m3636d2 = {"Lmicrogram/android/internal/bundle/signature/key/SigningKeysModule;", "", "<init>", "()V", "provideSigningKeys", "", "", "Ljava/security/PublicKey;", "Lkotlin/jvm/JvmSuppressWildcards;", "lib-microgram_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
/* loaded from: classes14.dex */
public final class SigningKeysModule {
    public static final SigningKeysModule INSTANCE = new SigningKeysModule();

    private SigningKeysModule() {
    }

    public final Map<String, PublicKey> provideSigningKeys() {
        return ReadSigningKeys.readSigningKeys("microgram-prod-1", "microgram-prod-2");
    }
}
