package io.ktor.http;

import io.ktor.util.StringValues3;
import kotlin.Metadata;

/* compiled from: Parameters.kt */
@Metadata(m3635d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\u0018\u00002\u00020\u00012\u00020\u0002B\u000f\u0012\b\b\u0002\u0010\u0003\u001a\u00020\u0004¢\u0006\u0002\u0010\u0005J\b\u0010\u0006\u001a\u00020\u0007H\u0016¨\u0006\b"}, m3636d2 = {"Lio/ktor/http/ParametersBuilderImpl;", "Lio/ktor/util/StringValuesBuilderImpl;", "Lio/ktor/http/ParametersBuilder;", "size", "", "(I)V", "build", "Lio/ktor/http/Parameters;", "ktor-http"}, m3637k = 1, m3638mv = {1, 8, 0}, m3640xi = 48)
/* renamed from: io.ktor.http.ParametersBuilderImpl, reason: use source file name */
/* loaded from: classes14.dex */
public final class Parameters4 extends StringValues3 implements Parameters3 {
    public Parameters4(int i) {
        super(true, i);
    }

    @Override // io.ktor.http.Parameters3
    public Parameters build() {
        return new Parameters5(getValues());
    }
}
