package com.squareup.wire.internal;

import com.squareup.wire.ProtoAdapter;
import com.squareup.wire.WireEnum;
import java.util.List;
import java.util.Map;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;

/* compiled from: InternalJvm.kt */
@Metadata(m3635d1 = {"\u0000*\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0010!\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010%\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u001a(\u0010\u0000\u001a\u00020\u0001\"\u0004\b\u0000\u0010\u00022\f\u0010\u0003\u001a\b\u0012\u0004\u0012\u0002H\u00020\u00042\f\u0010\u0005\u001a\b\u0012\u0004\u0012\u0002H\u00020\u0006\u001a,\u0010\u0000\u001a\u00020\u0001\"\u0004\b\u0000\u0010\u00022\u0010\u0010\u0007\u001a\f\u0012\u0002\b\u0003\u0012\u0004\u0012\u0002H\u00020\b2\f\u0010\u0005\u001a\b\u0012\u0004\u0012\u0002H\u00020\u0006\"'\u0010\t\u001a\u0004\u0018\u0001H\n\"\b\b\u0000\u0010\n*\u00020\u000b*\b\u0012\u0004\u0012\u0002H\n0\f8F¢\u0006\u0006\u001a\u0004\b\r\u0010\u000e¨\u0006\u000f"}, m3636d2 = {"redactElements", "", "T", "list", "", "adapter", "Lcom/squareup/wire/ProtoAdapter;", "map", "", "identityOrNull", "E", "Lcom/squareup/wire/WireEnum;", "Ljava/lang/Class;", "getIdentityOrNull", "(Ljava/lang/Class;)Lcom/squareup/wire/WireEnum;", "wire-runtime"}, m3637k = 5, m3638mv = {2, 0, 0}, m3640xi = 48, m3641xs = "com/squareup/wire/internal/Internal")
@SourceDebugExtension
/* renamed from: com.squareup.wire.internal.Internal__InternalJvmKt, reason: use source file name */
/* loaded from: classes12.dex */
final /* synthetic */ class InternalJvm {
    public static final <T> void redactElements(List<T> list, ProtoAdapter<T> adapter) {
        Intrinsics.checkNotNullParameter(list, "list");
        Intrinsics.checkNotNullParameter(adapter, "adapter");
        int size = list.size();
        for (int i = 0; i < size; i++) {
            list.set(i, adapter.redact(list.get(i)));
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static final <T> void redactElements(Map<?, T> map, ProtoAdapter<T> adapter) {
        Intrinsics.checkNotNullParameter(map, "map");
        Intrinsics.checkNotNullParameter(adapter, "adapter");
        for (Map.Entry entry : map.entrySet()) {
            entry.setValue(adapter.redact(entry.getValue()));
        }
    }

    public static final <E extends WireEnum> E getIdentityOrNull(Class<E> cls) {
        E e;
        Intrinsics.checkNotNullParameter(cls, "<this>");
        E[] enumConstants = cls.getEnumConstants();
        Intrinsics.checkNotNullExpressionValue(enumConstants, "getEnumConstants(...)");
        int length = enumConstants.length;
        int i = 0;
        while (true) {
            if (i >= length) {
                e = null;
                break;
            }
            e = enumConstants[i];
            E e2 = e;
            Intrinsics.checkNotNull(e2, "null cannot be cast to non-null type com.squareup.wire.WireEnum");
            if (e2.getValue() == 0) {
                break;
            }
            i++;
        }
        return e;
    }
}
