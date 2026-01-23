package utils;

import java.util.List;
import java.util.Map;
import kotlin.Metadata;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;

/* compiled from: ListUtils.kt */
@Metadata(m3635d1 = {"\u0000\u0016\n\u0000\n\u0002\u0010$\n\u0002\u0010\u000e\n\u0002\u0010\u0000\n\u0002\u0010 \n\u0002\b\u0005\u001a \u0010\u0000\u001a\u0010\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u0003\u0018\u00010\u0001*\n\u0012\u0006\u0012\u0004\u0018\u00010\u00030\u0004\u001a\u001d\u0010\u0005\u001a\u0004\u0018\u0001H\u0006\"\u0004\b\u0000\u0010\u0006*\b\u0012\u0004\u0012\u0002H\u00060\u0004¢\u0006\u0002\u0010\u0007\u001a\u001d\u0010\b\u001a\u0004\u0018\u0001H\u0006\"\u0004\b\u0000\u0010\u0006*\b\u0012\u0004\u0012\u0002H\u00060\u0004¢\u0006\u0002\u0010\u0007¨\u0006\t"}, m3636d2 = {"getMappingOperationOrNull", "", "", "", "", "secondOrNull", "T", "(Ljava/util/List;)Ljava/lang/Object;", "thirdOrNull", "utils"}, m3637k = 2, m3638mv = {1, 8, 0}, m3640xi = 48)
@SourceDebugExtension
/* renamed from: utils.ListUtilsKt, reason: use source file name */
/* loaded from: classes28.dex */
public final class ListUtils3 {
    public static final <T> T secondOrNull(List<? extends T> list) {
        Intrinsics.checkNotNullParameter(list, "<this>");
        return (T) CollectionsKt.getOrNull(list, 1);
    }

    public static final <T> T thirdOrNull(List<? extends T> list) {
        Intrinsics.checkNotNullParameter(list, "<this>");
        return (T) CollectionsKt.getOrNull(list, 2);
    }

    public static final Map<String, Object> getMappingOperationOrNull(List<? extends Object> list) {
        Intrinsics.checkNotNullParameter(list, "<this>");
        Object objSecondOrNull = secondOrNull(list);
        if (!AnyUtils.isExpression(objSecondOrNull)) {
            objSecondOrNull = null;
        }
        if (objSecondOrNull instanceof Map) {
            return (Map) objSecondOrNull;
        }
        return null;
    }
}
