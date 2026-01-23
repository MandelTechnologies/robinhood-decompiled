package androidx.room.util;

import kotlin.Deprecated;
import kotlin.Metadata;
import kotlin.jvm.JvmField;
import kotlin.jvm.JvmName;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;

/* compiled from: StringUtil.kt */
@Metadata(m3635d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0010\u0011\n\u0002\u0010\u000e\n\u0002\b\u0005\u001a\u0013\u0010\u0002\u001a\u00060\u0000j\u0002`\u0001H\u0007¢\u0006\u0004\b\u0002\u0010\u0003\u001a!\u0010\b\u001a\u00020\u00072\n\u0010\u0004\u001a\u00060\u0000j\u0002`\u00012\u0006\u0010\u0006\u001a\u00020\u0005¢\u0006\u0004\b\b\u0010\t\"\"\u0010\f\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u000b0\n8\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\f\u0010\r\u0012\u0004\b\u000e\u0010\u000f¨\u0006\u0010"}, m3636d2 = {"Ljava/lang/StringBuilder;", "Lkotlin/text/StringBuilder;", "newStringBuilder", "()Ljava/lang/StringBuilder;", "builder", "", "count", "", "appendPlaceholders", "(Ljava/lang/StringBuilder;I)V", "", "", "EMPTY_STRING_ARRAY", "[Ljava/lang/String;", "getEMPTY_STRING_ARRAY$annotations", "()V", "room-runtime_release"}, m3637k = 2, m3638mv = {2, 0, 0}, m3640xi = 48)
@JvmName
@SourceDebugExtension
/* loaded from: classes.dex */
public final class StringUtil {

    @JvmField
    public static final String[] EMPTY_STRING_ARRAY = new String[0];

    @Deprecated
    public static final StringBuilder newStringBuilder() {
        return new StringBuilder();
    }

    public static final void appendPlaceholders(StringBuilder builder, int i) {
        Intrinsics.checkNotNullParameter(builder, "builder");
        for (int i2 = 0; i2 < i; i2++) {
            builder.append("?");
            if (i2 < i - 1) {
                builder.append(",");
            }
        }
    }
}
