package retrofit2.converter.scalars;

import java.io.IOException;
import okhttp3.ResponseBody;
import retrofit2.Converter;

/* loaded from: classes25.dex */
final class ScalarResponseBodyConverters$IntegerResponseBodyConverter implements Converter<ResponseBody, Integer> {
    static final ScalarResponseBodyConverters$IntegerResponseBodyConverter INSTANCE = new ScalarResponseBodyConverters$IntegerResponseBodyConverter();

    ScalarResponseBodyConverters$IntegerResponseBodyConverter() {
    }

    @Override // retrofit2.Converter
    public Integer convert(ResponseBody responseBody) throws IOException {
        return Integer.valueOf(responseBody.string());
    }
}
