package microgram.android.internal.bundle.signature.key;

import dagger.internal.Factory;
import dagger.internal.Preconditions;
import java.security.PublicKey;
import java.util.Map;
import kotlin.Metadata;
import kotlin.jvm.JvmStatic;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: SigningKeysModule_ProvideSigningKeysFactory.kt */
@Metadata(m3635d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010$\n\u0002\u0010\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\bÆ\u0002\u0018\u00002\u0019\u0012\u0015\u0012\u0013\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00040\u0002¢\u0006\u0002\b\u00050\u0001B\t\b\u0002¢\u0006\u0004\b\u0006\u0010\u0007J \u0010\b\u001a\u0013\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00040\u0002¢\u0006\u0002\b\u0005H\u0007¢\u0006\u0004\b\b\u0010\tJ \u0010\n\u001a\u0013\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00040\u0002¢\u0006\u0002\b\u0005H\u0016¢\u0006\u0004\b\n\u0010\t¨\u0006\u000b"}, m3636d2 = {"Lmicrogram/android/internal/bundle/signature/key/SigningKeysModule_ProvideSigningKeysFactory;", "Ldagger/internal/Factory;", "", "", "Ljava/security/PublicKey;", "Lkotlin/jvm/JvmSuppressWildcards;", "<init>", "()V", "provideSigningKeys", "()Ljava/util/Map;", "get", "lib-microgram_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
/* loaded from: classes23.dex */
public final class SigningKeysModule_ProvideSigningKeysFactory implements Factory<Map<String, PublicKey>> {
    public static final SigningKeysModule_ProvideSigningKeysFactory INSTANCE = new SigningKeysModule_ProvideSigningKeysFactory();

    private SigningKeysModule_ProvideSigningKeysFactory() {
    }

    @Override // javax.inject.Provider
    public Map<String, PublicKey> get() {
        return provideSigningKeys();
    }

    @JvmStatic
    public static final Map<String, PublicKey> provideSigningKeys() {
        Object objCheckNotNull = Preconditions.checkNotNull(SigningKeysModule.INSTANCE.provideSigningKeys(), "Cannot return null from a non-@Nullable @Provides method");
        Intrinsics.checkNotNullExpressionValue(objCheckNotNull, "checkNotNull(...)");
        return (Map) objCheckNotNull;
    }
}
