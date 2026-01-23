package retrofit2.converter.wire;

import com.squareup.wire.Message;
import com.squareup.wire.ProtoAdapter;
import java.lang.annotation.Annotation;
import java.lang.reflect.Type;
import okhttp3.RequestBody;
import okhttp3.ResponseBody;
import retrofit2.Converter;
import retrofit2.Retrofit;

/* loaded from: classes23.dex */
public final class WireConverterFactory extends Converter.Factory {
    public static WireConverterFactory create() {
        return new WireConverterFactory();
    }

    private WireConverterFactory() {
    }

    @Override // retrofit2.Converter.Factory
    public Converter<ResponseBody, ?> responseBodyConverter(Type type2, Annotation[] annotationArr, Retrofit retrofit) {
        if (!(type2 instanceof Class)) {
            return null;
        }
        Class cls = (Class) type2;
        if (Message.class.isAssignableFrom(cls)) {
            return new WireResponseBodyConverter(ProtoAdapter.get(cls));
        }
        return null;
    }

    @Override // retrofit2.Converter.Factory
    public Converter<?, RequestBody> requestBodyConverter(Type type2, Annotation[] annotationArr, Annotation[] annotationArr2, Retrofit retrofit) {
        if (!(type2 instanceof Class)) {
            return null;
        }
        Class cls = (Class) type2;
        if (Message.class.isAssignableFrom(cls)) {
            return new WireRequestBodyConverter(ProtoAdapter.get(cls));
        }
        return null;
    }
}
