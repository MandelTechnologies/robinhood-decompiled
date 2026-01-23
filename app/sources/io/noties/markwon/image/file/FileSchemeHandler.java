package io.noties.markwon.image.file;

import android.content.res.AssetManager;
import android.net.Uri;
import android.text.TextUtils;
import android.webkit.MimeTypeMap;
import io.noties.markwon.image.ImageItem;
import io.noties.markwon.image.SchemeHandler;
import java.io.BufferedInputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStream;
import java.util.Collection;
import java.util.Collections;
import java.util.List;

/* loaded from: classes14.dex */
public class FileSchemeHandler extends SchemeHandler {
    private final AssetManager assetManager;

    public static FileSchemeHandler create() {
        return new FileSchemeHandler(null);
    }

    FileSchemeHandler(AssetManager assetManager) {
        this.assetManager = assetManager;
    }

    @Override // io.noties.markwon.image.SchemeHandler
    public ImageItem handle(String str, Uri uri) throws IOException {
        InputStream bufferedInputStream;
        List<String> pathSegments = uri.getPathSegments();
        if (pathSegments == null || pathSegments.size() == 0) {
            throw new IllegalStateException("Invalid file path: " + str);
        }
        boolean zEquals = "android_asset".equals(pathSegments.get(0));
        String lastPathSegment = uri.getLastPathSegment();
        if (zEquals) {
            if (this.assetManager != null) {
                StringBuilder sb = new StringBuilder();
                int size = pathSegments.size();
                for (int i = 1; i < size; i++) {
                    if (i != 1) {
                        sb.append('/');
                    }
                    sb.append(pathSegments.get(i));
                }
                try {
                    bufferedInputStream = this.assetManager.open(sb.toString());
                } catch (IOException e) {
                    throw new IllegalStateException("Exception obtaining asset file: " + str + ", path: " + sb.toString(), e);
                }
            } else {
                throw new IllegalStateException("Supplied file path points to assets, but FileSchemeHandler was not supplied with AssetsManager. Use `#createWithAssets` factory method to create FileSchemeHandler that can handle android assets");
            }
        } else {
            String path = uri.getPath();
            if (TextUtils.isEmpty(path)) {
                throw new IllegalStateException("Invalid file path: " + str + ", " + path);
            }
            try {
                bufferedInputStream = new BufferedInputStream(new FileInputStream(new File(path)));
            } catch (FileNotFoundException e2) {
                throw new IllegalStateException("Exception reading file: " + str, e2);
            }
        }
        return ImageItem.withDecodingNeeded(MimeTypeMap.getSingleton().getMimeTypeFromExtension(MimeTypeMap.getFileExtensionFromUrl(lastPathSegment)), bufferedInputStream);
    }

    @Override // io.noties.markwon.image.SchemeHandler
    public Collection<String> supportedSchemes() {
        return Collections.singleton("file");
    }
}
