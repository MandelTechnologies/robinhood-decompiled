package com.google.maps.android.compose;

import java.io.Closeable;
import kotlin.Metadata;

/* compiled from: MapComposeViewRender.kt */
@Metadata(m3635d1 = {"\u0000\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0003\bf\u0018\u00002\u00020\u0001J\u000f\u0010\u0003\u001a\u00020\u0002H&¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, m3636d2 = {"com/google/maps/android/compose/ComposeUiViewRenderer$RenderHandle", "Ljava/io/Closeable;", "", "dispose", "()V", "maps-compose_release"}, m3637k = 1, m3638mv = {1, 9, 0}, m3640xi = 48)
/* renamed from: com.google.maps.android.compose.ComposeUiViewRenderer$RenderHandle, reason: use source file name */
/* loaded from: classes27.dex */
public interface MapComposeViewRender extends Closeable {
    void dispose();

    /* compiled from: MapComposeViewRender.kt */
    @Metadata(m3637k = 3, m3638mv = {1, 9, 0}, m3640xi = 48)
    /* renamed from: com.google.maps.android.compose.ComposeUiViewRenderer$RenderHandle$DefaultImpls */
    public static final class DefaultImpls {
        public static void close(MapComposeViewRender mapComposeViewRender) {
            mapComposeViewRender.dispose();
        }
    }
}
