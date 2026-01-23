package retrofit2.converter.scalars;

import java.io.IOException;
import okhttp3.ResponseBody;
import retrofit2.Converter;

/* loaded from: classes25.dex */
final class ScalarResponseBodyConverters$LongResponseBodyConverter implements Converter<ResponseBody, Long> {
    static final ScalarResponseBodyConverters$LongResponseBodyConverter INSTANCE = new ScalarResponseBodyConverters$LongResponseBodyConverter();

    ScalarResponseBodyConverters$LongResponseBodyConverter() {
    }

    @Override // retrofit2.Converter
    public Long convert(ResponseBody responseBody) throws IOException {
        return Long.valueOf(responseBody.string());
    }
}
