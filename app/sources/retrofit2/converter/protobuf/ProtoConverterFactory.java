package retrofit2.converter.protobuf;

import com.google.protobuf.ExtensionRegistryLite;
import com.google.protobuf.MessageLite;
import com.google.protobuf.Parser;
import java.lang.annotation.Annotation;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Type;
import okhttp3.RequestBody;
import okhttp3.ResponseBody;
import retrofit2.Converter;
import retrofit2.Retrofit;

/* loaded from: classes25.dex */
public final class ProtoConverterFactory extends Converter.Factory {
    private final ExtensionRegistryLite registry;

    public static ProtoConverterFactory create() {
        return new ProtoConverterFactory(null);
    }

    private ProtoConverterFactory(ExtensionRegistryLite extensionRegistryLite) {
        this.registry = extensionRegistryLite;
    }

    @Override // retrofit2.Converter.Factory
    public Converter<ResponseBody, ?> responseBodyConverter(Type type2, Annotation[] annotationArr, Retrofit retrofit) {
        Parser parser;
        if (!(type2 instanceof Class)) {
            return null;
        }
        Class cls = (Class) type2;
        if (!MessageLite.class.isAssignableFrom(cls)) {
            return null;
        }
        try {
            try {
                parser = (Parser) cls.getDeclaredMethod("parser", null).invoke(null, null);
            } catch (IllegalAccessException | NoSuchFieldException e) {
                throw new IllegalArgumentException("Found a protobuf message but " + cls.getName() + " had no parser() method or PARSER field.", e);
            }
        } catch (IllegalAccessException | NoSuchMethodException unused) {
            parser = (Parser) cls.getDeclaredField("PARSER").get(null);
        } catch (InvocationTargetException e2) {
            throw new RuntimeException(e2.getCause());
        }
        return new ProtoResponseBodyConverter(parser, this.registry);
    }

    @Override // retrofit2.Converter.Factory
    public Converter<?, RequestBody> requestBodyConverter(Type type2, Annotation[] annotationArr, Annotation[] annotationArr2, Retrofit retrofit) {
        if ((type2 instanceof Class) && MessageLite.class.isAssignableFrom((Class) type2)) {
            return new ProtoRequestBodyConverter();
        }
        return null;
    }
}
