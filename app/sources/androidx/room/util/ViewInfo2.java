package androidx.room.util;

import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.StringsKt;

/* compiled from: ViewInfo.kt */
@Metadata(m3635d1 = {"\u0000\u001e\n\u0000\n\u0002\u0010\u000b\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\u001a\u0016\u0010\u0000\u001a\u00020\u0001*\u00020\u00022\b\u0010\u0003\u001a\u0004\u0018\u00010\u0004H\u0000\u001a\f\u0010\u0005\u001a\u00020\u0006*\u00020\u0002H\u0000\u001a\f\u0010\u0007\u001a\u00020\b*\u00020\u0002H\u0000¨\u0006\t"}, m3636d2 = {"equalsCommon", "", "Landroidx/room/util/ViewInfo;", "other", "", "hashCodeCommon", "", "toStringCommon", "", "room-runtime_release"}, m3637k = 2, m3638mv = {2, 0, 0}, m3640xi = 48)
/* renamed from: androidx.room.util.ViewInfoKt, reason: use source file name */
/* loaded from: classes4.dex */
public final class ViewInfo2 {
    public static final boolean equalsCommon(ViewInfo viewInfo, Object obj) {
        Intrinsics.checkNotNullParameter(viewInfo, "<this>");
        if (viewInfo == obj) {
            return true;
        }
        if (!(obj instanceof ViewInfo)) {
            return false;
        }
        ViewInfo viewInfo2 = (ViewInfo) obj;
        if (Intrinsics.areEqual(viewInfo.name, viewInfo2.name)) {
            String str = viewInfo.sql;
            if (str != null ? Intrinsics.areEqual(str, viewInfo2.sql) : viewInfo2.sql == null) {
                return true;
            }
        }
        return false;
    }

    public static final int hashCodeCommon(ViewInfo viewInfo) {
        Intrinsics.checkNotNullParameter(viewInfo, "<this>");
        int iHashCode = viewInfo.name.hashCode() * 31;
        String str = viewInfo.sql;
        return iHashCode + (str != null ? str.hashCode() : 0);
    }

    public static final String toStringCommon(ViewInfo viewInfo) {
        Intrinsics.checkNotNullParameter(viewInfo, "<this>");
        return StringsKt.trimMargin$default("\n            |ViewInfo {\n            |   name = '" + viewInfo.name + "',\n            |   sql = '" + viewInfo.sql + "'\n            |}\n        ", null, 1, null);
    }
}
