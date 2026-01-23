package microgram.android.internal.bundle.signature;

import com.robinhood.models.card.p311db.Card;
import java.security.InvalidKeyException;
import java.security.NoSuchAlgorithmException;
import java.security.PublicKey;
import java.security.Signature;
import java.security.SignatureException;
import java.util.Map;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import okio.ByteString;

/* compiled from: SignatureVerifier.kt */
@Metadata(m3635d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010$\n\u0002\u0010\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\b\u0007\u0018\u00002\u00020\u0001B$\b\u0007\u0012\u0019\b\u0001\u0010\u0002\u001a\u0013\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\u00050\u0003¢\u0006\u0002\b\u0006¢\u0006\u0004\b\u0007\u0010\bJ\u0018\u0010\t\u001a\u00020\n2\u0006\u0010\u000b\u001a\u00020\f2\u0006\u0010\r\u001a\u00020\u000eH\u0016R\u001f\u0010\u0002\u001a\u0013\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\u00050\u0003¢\u0006\u0002\b\u0006X\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006\u000f"}, m3636d2 = {"Lmicrogram/android/internal/bundle/signature/RealSignatureVerifier;", "Lmicrogram/android/internal/bundle/signature/SignatureVerifier;", "keys", "", "", "Ljava/security/PublicKey;", "Lkotlin/jvm/JvmSuppressWildcards;", "<init>", "(Ljava/util/Map;)V", Card.Icon.VERIFY, "", "packageSignature", "Lmicrogram/android/internal/bundle/signature/PackageSignature;", "hash", "Lokio/ByteString;", "lib-microgram_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
/* renamed from: microgram.android.internal.bundle.signature.RealSignatureVerifier, reason: use source file name */
/* loaded from: classes14.dex */
public final class SignatureVerifier2 implements SignatureVerifier {
    private final Map<String, PublicKey> keys;

    public SignatureVerifier2(Map<String, PublicKey> keys) {
        Intrinsics.checkNotNullParameter(keys, "keys");
        this.keys = keys;
    }

    @Override // microgram.android.internal.bundle.signature.SignatureVerifier
    public void verify(PackageSignature packageSignature, ByteString hash) throws NoSuchAlgorithmException, SignatureException, PackageSignatureVerificationExceptions2, InvalidKeyException {
        Intrinsics.checkNotNullParameter(packageSignature, "packageSignature");
        Intrinsics.checkNotNullParameter(hash, "hash");
        long version = packageSignature.getVersion();
        if (version != 1) {
            throw new PackageSignatureVerificationExceptions4("Unsupported package signature version " + version, null, 2, null);
        }
        String keyId = packageSignature.getKeyId();
        PublicKey publicKey = this.keys.get(keyId);
        if (publicKey == null) {
            throw new PackageSignatureVerificationExceptions3("Unrecognized package signing key ID `" + keyId + "`", null, 2, null);
        }
        Signature signature = Signature.getInstance("SHA256withECDSA");
        signature.initVerify(publicKey);
        signature.update(hash.toByteArray());
        try {
            if (signature.verify(packageSignature.getSignatureData().toByteArray())) {
                return;
            }
            throw new PackageSignatureVerificationExceptions("Package signature not verified: key ID `" + keyId + "`", null, 2, null);
        } catch (SignatureException e) {
            throw new PackageSignatureVerificationExceptions2(null, e, 1, null);
        }
    }
}
