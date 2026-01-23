package retrofit2.converter.protobuf;

import com.google.protobuf.ExtensionRegistryLite;
import com.google.protobuf.InvalidProtocolBufferException;
import com.google.protobuf.MessageLite;
import com.google.protobuf.Parser;
import java.io.IOException;
import okhttp3.ResponseBody;
import retrofit2.Converter;

/* loaded from: classes25.dex */
final class ProtoResponseBodyConverter<T extends MessageLite> implements Converter<ResponseBody, T> {
    private final Parser<T> parser;
    private final ExtensionRegistryLite registry;

    ProtoResponseBodyConverter(Parser<T> parser, ExtensionRegistryLite extensionRegistryLite) {
        this.parser = parser;
        this.registry = extensionRegistryLite;
    }

    @Override // retrofit2.Converter
    public T convert(ResponseBody responseBody) throws IOException {
        T from;
        try {
            try {
                if (this.registry == null) {
                    from = this.parser.parseFrom(responseBody.byteStream());
                } else {
                    from = this.parser.parseFrom(responseBody.byteStream(), this.registry);
                }
                responseBody.close();
                return from;
            } catch (InvalidProtocolBufferException e) {
                throw new RuntimeException(e);
            }
        } catch (Throwable th) {
            responseBody.close();
            throw th;
        }
    }
}
