package microgram.android.internal.bundle.signature;

import com.robinhood.models.card.p311db.Card;
import kotlin.Metadata;
import okio.ByteString;

/* compiled from: SignatureVerifier.kt */
@Metadata(m3635d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\bæ\u0080\u0001\u0018\u00002\u00020\u0001J\u0018\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u00052\u0006\u0010\u0006\u001a\u00020\u0007H'¨\u0006\b"}, m3636d2 = {"Lmicrogram/android/internal/bundle/signature/SignatureVerifier;", "", Card.Icon.VERIFY, "", "packageSignature", "Lmicrogram/android/internal/bundle/signature/PackageSignature;", "hash", "Lokio/ByteString;", "lib-microgram_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
/* loaded from: classes14.dex */
public interface SignatureVerifier {
    void verify(PackageSignature packageSignature, ByteString hash) throws PackageSignatureVerificationExceptions2;
}
