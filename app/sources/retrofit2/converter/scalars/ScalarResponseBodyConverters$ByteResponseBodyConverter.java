package retrofit2.converter.scalars;

import java.io.IOException;
import okhttp3.ResponseBody;
import retrofit2.Converter;

/* loaded from: classes25.dex */
final class ScalarResponseBodyConverters$ByteResponseBodyConverter implements Converter<ResponseBody, Byte> {
    static final ScalarResponseBodyConverters$ByteResponseBodyConverter INSTANCE = new ScalarResponseBodyConverters$ByteResponseBodyConverter();

    ScalarResponseBodyConverters$ByteResponseBodyConverter() {
    }

    @Override // retrofit2.Converter
    public Byte convert(ResponseBody responseBody) throws IOException {
        return Byte.valueOf(responseBody.string());
    }
}
