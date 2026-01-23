package coil.decode;

import coil.content.SvgUtils;
import kotlin.Metadata;
import kotlin.jvm.JvmName;
import okio.BufferedSource;
import okio.ByteString;

/* compiled from: DecodeUtils.kt */
@Metadata(m3635d1 = {"\u0000\u001a\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\u001a\u0012\u0010\u0003\u001a\u00020\u0004*\u00020\u00052\u0006\u0010\u0006\u001a\u00020\u0007\"\u000e\u0010\u0000\u001a\u00020\u0001X\u0082\u0004¢\u0006\u0002\n\u0000\"\u000e\u0010\u0002\u001a\u00020\u0001X\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006\b"}, m3636d2 = {"SVG_TAG", "Lokio/ByteString;", "LEFT_ANGLE_BRACKET", "isSvg", "", "Lcoil/decode/DecodeUtils;", "source", "Lokio/BufferedSource;", "coil-svg_release"}, m3637k = 2, m3638mv = {2, 0, 0}, m3640xi = 48)
@JvmName
/* renamed from: coil.decode.SvgDecodeUtils, reason: use source file name */
/* loaded from: classes.dex */
public final class DecodeUtils2 {
    private static final ByteString LEFT_ANGLE_BRACKET;
    private static final ByteString SVG_TAG;

    static {
        ByteString.Companion companion = ByteString.INSTANCE;
        SVG_TAG = companion.encodeUtf8("<svg");
        LEFT_ANGLE_BRACKET = companion.encodeUtf8("<");
    }

    public static final boolean isSvg(DecodeUtils decodeUtils, BufferedSource bufferedSource) {
        return bufferedSource.rangeEquals(0L, LEFT_ANGLE_BRACKET) && SvgUtils.indexOf(bufferedSource, SVG_TAG, 0L, 1024L) != -1;
    }
}
