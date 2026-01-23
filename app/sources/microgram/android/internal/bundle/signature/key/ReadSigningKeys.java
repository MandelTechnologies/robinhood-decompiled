package microgram.android.internal.bundle.signature.key;

import java.net.URL;
import java.security.KeyFactory;
import java.security.NoSuchAlgorithmException;
import java.security.PublicKey;
import java.security.spec.X509EncodedKeySpec;
import java.util.LinkedHashMap;
import java.util.Map;
import kotlin.Metadata;
import kotlin.collections.MapsKt;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlin.p481io.ReadWrite2;
import kotlin.ranges.RangesKt;

/* compiled from: ReadSigningKeys.kt */
@Metadata(m3635d1 = {"\u0000\u0018\n\u0000\n\u0002\u0010$\n\u0002\u0010\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0011\n\u0002\b\u0002\u001a-\u0010\u0000\u001a\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u00012\u0012\u0010\u0004\u001a\n\u0012\u0006\b\u0001\u0012\u00020\u00020\u0005\"\u00020\u0002H\u0000¢\u0006\u0002\u0010\u0006¨\u0006\u0007"}, m3636d2 = {"readSigningKeys", "", "", "Ljava/security/PublicKey;", "keyIds", "", "([Ljava/lang/String;)Ljava/util/Map;", "lib-microgram_externalRelease"}, m3637k = 2, m3638mv = {2, 1, 0}, m3640xi = 48)
@SourceDebugExtension
/* renamed from: microgram.android.internal.bundle.signature.key.ReadSigningKeysKt, reason: use source file name */
/* loaded from: classes14.dex */
public final class ReadSigningKeys {
    public static final Map<String, PublicKey> readSigningKeys(String... keyIds) throws NoSuchAlgorithmException {
        Intrinsics.checkNotNullParameter(keyIds, "keyIds");
        KeyFactory keyFactory = KeyFactory.getInstance("EC");
        LinkedHashMap linkedHashMap = new LinkedHashMap(RangesKt.coerceAtLeast(MapsKt.mapCapacity(keyIds.length), 16));
        for (String str : keyIds) {
            URL resource = SigningKeysModule.class.getResource(str);
            if (resource == null) {
                throw new IllegalStateException("Required value was null.");
            }
            linkedHashMap.put(str, keyFactory.generatePublic(new X509EncodedKeySpec(ReadWrite2.readBytes(resource))));
        }
        return linkedHashMap;
    }
}
