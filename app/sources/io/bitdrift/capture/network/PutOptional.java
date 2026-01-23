package io.bitdrift.capture.network;

import io.bitdrift.capture.providers.FieldProvider4;
import java.util.Map;
import kotlin.Metadata;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: PutOptional.kt */
@Metadata(m3635d1 = {"\u0000\u001a\n\u0000\n\u0002\u0010%\n\u0002\u0010\u000e\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0002\u001aW\u0010\u0000\u001a\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001\"\u0004\b\u0000\u0010\u0004*\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u00012\u0006\u0010\u0005\u001a\u00020\u00022\b\u0010\u0006\u001a\u0004\u0018\u0001H\u00042\u0014\b\u0002\u0010\u0007\u001a\u000e\u0012\u0004\u0012\u0002H\u0004\u0012\u0004\u0012\u00020\u00020\bH\u0000¢\u0006\u0002\u0010\t¨\u0006\n"}, m3636d2 = {"putOptional", "", "", "Lio/bitdrift/capture/providers/FieldValue;", "T", "key", "value", "extractString", "Lkotlin/Function1;", "(Ljava/util/Map;Ljava/lang/String;Ljava/lang/Object;Lkotlin/jvm/functions/Function1;)Ljava/util/Map;", "platform_jvm_capture-capture_logger_lib_kt"}, m3637k = 2, m3638mv = {1, 9, 0}, m3640xi = 48)
/* renamed from: io.bitdrift.capture.network.PutOptionalKt, reason: use source file name */
/* loaded from: classes14.dex */
public final class PutOptional {
    public static /* synthetic */ Map putOptional$default(Map map, String str, Object obj, Function1 function1, int i, Object obj2) {
        if ((i & 4) != 0) {
            function1 = new Function1() { // from class: io.bitdrift.capture.network.PutOptionalKt.putOptional.1
                @Override // kotlin.jvm.functions.Function1
                public final String invoke(Object obj3) {
                    return String.valueOf(obj3);
                }
            };
        }
        return putOptional(map, str, obj, function1);
    }

    public static final <T> Map<String, FieldProvider4> putOptional(Map<String, FieldProvider4> map, String key, T t, Function1<? super T, String> extractString) {
        Intrinsics.checkNotNullParameter(map, "<this>");
        Intrinsics.checkNotNullParameter(key, "key");
        Intrinsics.checkNotNullParameter(extractString, "extractString");
        if (t != null) {
            map.put(key, new FieldProvider4.StringField(extractString.invoke(t)));
        }
        return map;
    }
}
