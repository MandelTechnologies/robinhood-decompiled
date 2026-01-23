package microgram.serialization;

import com.benasher44.uuid.uuid;
import java.util.UUID;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: UuidStringSerializer.kt */
@Metadata(m3635d1 = {"\u0000\u0010\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0000\u001a\u0014\u0010\u0000\u001a\n\u0018\u00010\u0001j\u0004\u0018\u0001`\u0002*\u00020\u0003H\u0000¨\u0006\u0004"}, m3636d2 = {"toUuidOrNull", "Ljava/util/UUID;", "Lcom/benasher44/uuid/Uuid;", "", "microgram-serialization"}, m3637k = 2, m3638mv = {2, 1, 0}, m3640xi = 48)
/* renamed from: microgram.serialization.UuidStringSerializerKt, reason: use source file name */
/* loaded from: classes14.dex */
public final class UuidStringSerializer2 {
    public static final UUID toUuidOrNull(String str) {
        Intrinsics.checkNotNullParameter(str, "<this>");
        try {
            return uuid.uuidFrom(str);
        } catch (IllegalArgumentException unused) {
            return null;
        }
    }
}
