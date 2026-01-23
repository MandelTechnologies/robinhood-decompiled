package retrofit2.converter.scalars;

import java.io.IOException;
import okhttp3.ResponseBody;
import retrofit2.Converter;

/* loaded from: classes25.dex */
final class ScalarResponseBodyConverters$ShortResponseBodyConverter implements Converter<ResponseBody, Short> {
    static final ScalarResponseBodyConverters$ShortResponseBodyConverter INSTANCE = new ScalarResponseBodyConverters$ShortResponseBodyConverter();

    ScalarResponseBodyConverters$ShortResponseBodyConverter() {
    }

    @Override // retrofit2.Converter
    public Short convert(ResponseBody responseBody) throws IOException {
        return Short.valueOf(responseBody.string());
    }
}
