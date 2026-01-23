package retrofit2.converter.scalars;

import java.io.IOException;
import okhttp3.ResponseBody;
import retrofit2.Converter;

/* loaded from: classes25.dex */
final class ScalarResponseBodyConverters$DoubleResponseBodyConverter implements Converter<ResponseBody, Double> {
    static final ScalarResponseBodyConverters$DoubleResponseBodyConverter INSTANCE = new ScalarResponseBodyConverters$DoubleResponseBodyConverter();

    ScalarResponseBodyConverters$DoubleResponseBodyConverter() {
    }

    @Override // retrofit2.Converter
    public Double convert(ResponseBody responseBody) throws IOException {
        return Double.valueOf(responseBody.string());
    }
}
