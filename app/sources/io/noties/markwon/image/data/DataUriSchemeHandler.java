package io.noties.markwon.image.data;

import android.net.Uri;
import com.robinhood.websocket.gateway.WebsocketGatewayConstants;
import io.noties.markwon.image.ImageItem;
import io.noties.markwon.image.SchemeHandler;
import java.io.ByteArrayInputStream;
import java.util.Collection;
import java.util.Collections;

/* loaded from: classes14.dex */
public class DataUriSchemeHandler extends SchemeHandler {
    private final DataUriDecoder uriDecoder;
    private final DataUriParser uriParser;

    public static DataUriSchemeHandler create() {
        return new DataUriSchemeHandler(DataUriParser.create(), DataUriDecoder.create());
    }

    DataUriSchemeHandler(DataUriParser dataUriParser, DataUriDecoder dataUriDecoder) {
        this.uriParser = dataUriParser;
        this.uriDecoder = dataUriDecoder;
    }

    @Override // io.noties.markwon.image.SchemeHandler
    public ImageItem handle(String str, Uri uri) {
        if (!str.startsWith("data:")) {
            throw new IllegalStateException("Invalid data-uri: " + str);
        }
        DataUri dataUri = this.uriParser.parse(str.substring(5));
        if (dataUri == null) {
            throw new IllegalStateException("Invalid data-uri: " + str);
        }
        try {
            byte[] bArrDecode = this.uriDecoder.decode(dataUri);
            if (bArrDecode == null) {
                throw new IllegalStateException("Decoding data-uri failed: " + str);
            }
            return ImageItem.withDecodingNeeded(dataUri.contentType(), new ByteArrayInputStream(bArrDecode));
        } catch (Throwable th) {
            throw new IllegalStateException("Cannot decode data-uri: " + str, th);
        }
    }

    @Override // io.noties.markwon.image.SchemeHandler
    public Collection<String> supportedSchemes() {
        return Collections.singleton(WebsocketGatewayConstants.DATA_KEY);
    }
}
