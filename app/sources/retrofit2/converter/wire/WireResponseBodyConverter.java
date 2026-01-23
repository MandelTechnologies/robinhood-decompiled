package retrofit2.converter.wire;

import com.squareup.wire.Message;
import com.squareup.wire.ProtoAdapter;
import java.io.IOException;
import okhttp3.ResponseBody;
import retrofit2.Converter;

/* loaded from: classes25.dex */
final class WireResponseBodyConverter<T extends Message<T, ?>> implements Converter<ResponseBody, T> {
    private final ProtoAdapter<T> adapter;

    WireResponseBodyConverter(ProtoAdapter<T> protoAdapter) {
        this.adapter = protoAdapter;
    }

    @Override // retrofit2.Converter
    public T convert(ResponseBody responseBody) throws IOException {
        try {
            return this.adapter.decode(responseBody.getSource());
        } finally {
            responseBody.close();
        }
    }
}
