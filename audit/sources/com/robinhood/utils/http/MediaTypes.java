package com.robinhood.utils.http;

import kotlin.Metadata;
import kotlin.jvm.JvmField;
import okhttp3.MediaType;

/* compiled from: MediaTypes.kt */
@Metadata(m3635d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0010\bÆ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u0010\u0010\u0004\u001a\u00020\u00058\u0006X\u0087\u0004¢\u0006\u0002\n\u0000R\u0011\u0010\u0006\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u0007\u0010\bR\u0011\u0010\t\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\bR\u0011\u0010\u000b\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\f\u0010\bR\u0011\u0010\r\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u000e\u0010\bR\u0011\u0010\u000f\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u0010\u0010\bR\u0011\u0010\u0011\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u0012\u0010\bR\u0011\u0010\u0013\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u0014\u0010\b¨\u0006\u0015"}, m3636d2 = {"Lcom/robinhood/utils/http/MediaTypes;", "", "<init>", "()V", "JSON_UTF8", "Lokhttp3/MediaType;", "JPEG", "getJPEG", "()Lokhttp3/MediaType;", "PNG", "getPNG", "PDF", "getPDF", "MP4", "getMP4", "TEXT_PLAIN", "getTEXT_PLAIN", "TEXT_CSV", "getTEXT_CSV", "MULTIPART_FORM_DATA", "getMULTIPART_FORM_DATA", "lib-utils-http"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
/* loaded from: classes21.dex */
public final class MediaTypes {
    public static final MediaTypes INSTANCE = new MediaTypes();
    private static final MediaType JPEG;

    @JvmField
    public static final MediaType JSON_UTF8;
    private static final MediaType MP4;
    private static final MediaType MULTIPART_FORM_DATA;
    private static final MediaType PDF;
    private static final MediaType PNG;
    private static final MediaType TEXT_CSV;
    private static final MediaType TEXT_PLAIN;

    private MediaTypes() {
    }

    static {
        MediaType.Companion companion = MediaType.INSTANCE;
        JSON_UTF8 = companion.get("application/json; charset=utf-8");
        JPEG = companion.get("image/jpeg");
        PNG = companion.get("image/png");
        PDF = companion.get("application/pdf");
        MP4 = companion.get("video/mp4");
        TEXT_PLAIN = companion.get("text/plain");
        TEXT_CSV = companion.get("text/csv");
        MULTIPART_FORM_DATA = companion.get("multipart/form-data");
    }

    public final MediaType getJPEG() {
        return JPEG;
    }

    public final MediaType getPNG() {
        return PNG;
    }

    public final MediaType getPDF() {
        return PDF;
    }

    public final MediaType getMP4() {
        return MP4;
    }

    public final MediaType getTEXT_PLAIN() {
        return TEXT_PLAIN;
    }

    public final MediaType getTEXT_CSV() {
        return TEXT_CSV;
    }

    public final MediaType getMULTIPART_FORM_DATA() {
        return MULTIPART_FORM_DATA;
    }
}
