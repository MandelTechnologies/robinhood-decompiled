package retrofit2.converter.scalars;

import java.io.IOException;
import okhttp3.ResponseBody;
import retrofit2.Converter;

/* loaded from: classes25.dex */
final class ScalarResponseBodyConverters$FloatResponseBodyConverter implements Converter<ResponseBody, Float> {
    static final ScalarResponseBodyConverters$FloatResponseBodyConverter INSTANCE = new ScalarResponseBodyConverters$FloatResponseBodyConverter();

    ScalarResponseBodyConverters$FloatResponseBodyConverter() {
    }

    @Override // retrofit2.Converter
    public Float convert(ResponseBody responseBody) throws IOException {
        return Float.valueOf(responseBody.string());
    }
}
