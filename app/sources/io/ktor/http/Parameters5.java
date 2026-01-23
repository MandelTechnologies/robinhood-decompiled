package io.ktor.http;

import io.ktor.util.StringValues4;
import java.util.List;
import java.util.Map;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: Parameters.kt */
@Metadata(m3635d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010$\n\u0002\u0010\u000e\n\u0002\u0010 \n\u0002\b\u0003\u0018\u00002\u00020\u00012\u00020\u0002B!\u0012\u001a\b\u0002\u0010\u0003\u001a\u0014\u0012\u0004\u0012\u00020\u0005\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00050\u00060\u0004¢\u0006\u0002\u0010\u0007J\b\u0010\b\u001a\u00020\u0005H\u0016¨\u0006\t"}, m3636d2 = {"Lio/ktor/http/ParametersImpl;", "Lio/ktor/http/Parameters;", "Lio/ktor/util/StringValuesImpl;", "values", "", "", "", "(Ljava/util/Map;)V", "toString", "ktor-http"}, m3637k = 1, m3638mv = {1, 8, 0}, m3640xi = 48)
/* renamed from: io.ktor.http.ParametersImpl, reason: use source file name */
/* loaded from: classes14.dex */
public final class Parameters5 extends StringValues4 implements Parameters {
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public Parameters5(Map<String, ? extends List<String>> values) {
        super(true, values);
        Intrinsics.checkNotNullParameter(values, "values");
    }

    public String toString() {
        return "Parameters " + entries();
    }
}
