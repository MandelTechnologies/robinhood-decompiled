package androidx.media3.datasource;

import java.io.IOException;

/* loaded from: classes4.dex */
public final class DataSourceUtil {
    public static void closeQuietly(DataSource dataSource) {
        if (dataSource != null) {
            try {
                dataSource.close();
            } catch (IOException unused) {
            }
        }
    }
}
