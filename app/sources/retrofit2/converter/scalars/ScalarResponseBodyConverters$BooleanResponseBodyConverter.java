package retrofit2.converter.scalars;

import java.io.IOException;
import okhttp3.ResponseBody;
import retrofit2.Converter;

/* loaded from: classes25.dex */
final class ScalarResponseBodyConverters$BooleanResponseBodyConverter implements Converter<ResponseBody, Boolean> {
    static final ScalarResponseBodyConverters$BooleanResponseBodyConverter INSTANCE = new ScalarResponseBodyConverters$BooleanResponseBodyConverter();

    ScalarResponseBodyConverters$BooleanResponseBodyConverter() {
    }

    @Override // retrofit2.Converter
    public Boolean convert(ResponseBody responseBody) throws IOException {
        return Boolean.valueOf(responseBody.string());
    }
}
