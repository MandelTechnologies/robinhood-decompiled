package androidx.camera.video.internal.config;

/* loaded from: classes4.dex */
public abstract class MimeInfo {

    public static abstract class Builder<B> {
        public abstract B setProfile(int i);
    }

    public abstract String getMimeType();

    public abstract int getProfile();
}
