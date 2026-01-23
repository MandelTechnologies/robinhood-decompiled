package retrofit2.converter.scalars;

import java.io.IOException;
import okhttp3.ResponseBody;
import retrofit2.Converter;

/* loaded from: classes25.dex */
final class ScalarResponseBodyConverters$StringResponseBodyConverter implements Converter<ResponseBody, String> {
    static final ScalarResponseBodyConverters$StringResponseBodyConverter INSTANCE = new ScalarResponseBodyConverters$StringResponseBodyConverter();

    ScalarResponseBodyConverters$StringResponseBodyConverter() {
    }

    @Override // retrofit2.Converter
    public String convert(ResponseBody responseBody) throws IOException {
        return responseBody.string();
    }
}
