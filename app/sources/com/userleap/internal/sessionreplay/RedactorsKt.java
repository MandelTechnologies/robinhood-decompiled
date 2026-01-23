package com.userleap.internal.sessionreplay;

import android.widget.EditText;
import android.widget.ImageView;
import android.widget.VideoView;
import androidx.annotation.Keep;
import com.singular.sdk.internal.Constants;
import kotlin.Metadata;
import kotlin.collections.CollectionsKt;
import sprig.graphics.C49025q;

@Metadata(m3635d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\b\t\"\u001a\u0010\u0001\u001a\u00020\u00008\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0001\u0010\u0002\u001a\u0004\b\u0003\u0010\u0004\"\u001a\u0010\u0005\u001a\u00020\u00008\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0005\u0010\u0002\u001a\u0004\b\u0006\u0010\u0004\"\u001a\u0010\u0007\u001a\u00020\u00008\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0007\u0010\u0002\u001a\u0004\b\b\u0010\u0004¨\u0006\t"}, m3636d2 = {"Lsprig/e/q;", "inputRedactor", "Lsprig/e/q;", Constants.RequestParamsKeys.DEVELOPER_API_KEY, "()Lsprig/e/q;", "imageRedactor", "getImageRedactor", "videoRedactor", "getVideoRedactor", "userleap_release"}, m3637k = 2, m3638mv = {1, 8, 0})
/* loaded from: classes11.dex */
public final class RedactorsKt {

    @Keep
    private static final C49025q inputRedactor = new C49025q(CollectionsKt.listOf(EditText.class));

    @Keep
    private static final C49025q imageRedactor = new C49025q(CollectionsKt.listOf(ImageView.class));

    @Keep
    private static final C49025q videoRedactor = new C49025q(CollectionsKt.listOf(VideoView.class));

    /* renamed from: a */
    public static final C49025q m3206a() {
        return inputRedactor;
    }
}
