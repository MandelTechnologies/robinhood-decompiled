package sprig.graphics;

import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.media.MediaCodec;
import android.media.MediaCrypto;
import android.media.MediaFormat;
import android.media.MediaMuxer;
import android.opengl.EGL14;
import android.opengl.EGLConfig;
import android.opengl.EGLContext;
import android.opengl.EGLDisplay;
import android.opengl.EGLExt;
import android.opengl.EGLSurface;
import android.opengl.GLUtils;
import android.opengl.Matrix;
import android.util.Size;
import android.view.Surface;
import com.robinhood.android.investFlow.InvestFlowConstants;
import com.singular.sdk.internal.Constants;
import java.io.File;
import java.io.IOException;
import java.nio.ByteBuffer;
import java.util.Comparator;
import java.util.Iterator;
import java.util.List;
import kotlin.ExceptionsKt;
import kotlin.Metadata;
import kotlin.Result;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.comparisons.ComparisonsKt;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlin.p481io.FilesKt;
import org.json.JSONException;
import sprig.p549g.C49029a;

@Metadata(m3635d1 = {"\u0000\u0098\u0001\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0014\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\t\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0006\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\bF\u0010GJ\u001e\u0010\b\u001a\u00020\u00072\u0006\u0010\u0003\u001a\u00020\u00022\f\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004H\u0002J\u0018\u0010\b\u001a\u0004\u0018\u00010\t2\f\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004H\u0002J\u0010\u0010\f\u001a\u00020\u000b2\u0006\u0010\n\u001a\u00020\tH\u0002J\u0010\u0010\f\u001a\u00020\u00072\u0006\u0010\u000e\u001a\u00020\rH\u0002J\u0016\u0010\f\u001a\u00020\u00072\f\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004H\u0002J\u0012\u0010\f\u001a\u0004\u0018\u00010\r2\u0006\u0010\u0010\u001a\u00020\u000fH\u0002J\b\u0010\f\u001a\u00020\u0011H\u0002J\b\u0010\u0012\u001a\u00020\u0007H\u0002J\b\u0010\b\u001a\u00020\u0007H\u0002J\f\u0010\f\u001a\u00020\u0013*\u00020\u0005H\u0002J2\u0010\f\u001a\b\u0012\u0004\u0012\u00020\u00070\u00142\u0006\u0010\u0003\u001a\u00020\u00022\f\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004ø\u0001\u0000ø\u0001\u0001ø\u0001\u0002¢\u0006\u0004\b\f\u0010\u0015R\u0018\u0010\u000e\u001a\u0004\u0018\u00010\r8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\f\u0010\u0016R\u0018\u0010\u0019\u001a\u0004\u0018\u00010\u00178\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\b\u0010\u0018R\u0016\u0010\u001b\u001a\u00020\u00028\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u0012\u0010\u001aR\u0016\u0010\u001f\u001a\u00020\u001c8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u001d\u0010\u001eR\u0016\u0010#\u001a\u00020 8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b!\u0010\"R\u0016\u0010%\u001a\u00020\u001c8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b$\u0010\u001eR\u0014\u0010'\u001a\u00020 8\u0002X\u0082D¢\u0006\u0006\n\u0004\b&\u0010\"R\u0014\u0010+\u001a\u00020(8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b)\u0010*R\u0016\u0010\n\u001a\u00020\t8\u0002@\u0002X\u0082.¢\u0006\u0006\n\u0004\b,\u0010-R\u0014\u00101\u001a\u00020.8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b/\u00100R\u0018\u00105\u001a\u0004\u0018\u0001028\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b3\u00104R\u0018\u00109\u001a\u0004\u0018\u0001068\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b7\u00108R\u0018\u0010=\u001a\u0004\u0018\u00010:8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b;\u0010<R\u0018\u0010A\u001a\u0004\u0018\u00010>8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b?\u0010@R\u0016\u0010E\u001a\u00020B8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\bC\u0010D\u0082\u0002\u000f\n\u0002\b!\n\u0005\b¡\u001e0\u0001\n\u0002\b\u0019¨\u0006H"}, m3636d2 = {"Lsprig/e/s;", "", "", "outVideoFilePath", "", "Ljava/io/File;", "images", "", "b", "Landroid/util/Size;", "size", "Landroid/media/MediaFormat;", Constants.RequestParamsKeys.DEVELOPER_API_KEY, "Landroid/media/MediaCodec;", "encoder", "", "endOfStream", "", "c", "Landroid/graphics/Bitmap;", "Lkotlin/Result;", "(Ljava/lang/String;Ljava/util/List;)Ljava/lang/Object;", "Landroid/media/MediaCodec;", "Landroid/media/MediaMuxer;", "Landroid/media/MediaMuxer;", "muxer", "Ljava/lang/String;", "mime", "", "d", "I", "trackIndex", "", Constants.RequestBody.EXTRA_ATTRIBUTES_KEY, "J", "presentationTimeUs", "f", "frameRate", "g", "timeoutUs", "Landroid/media/MediaCodec$BufferInfo;", "h", "Landroid/media/MediaCodec$BufferInfo;", "bufferInfo", Constants.RequestParamsKeys.PACKAGE_NAME_KEY, "Landroid/util/Size;", "Landroid/graphics/BitmapFactory$Options;", "j", "Landroid/graphics/BitmapFactory$Options;", "bitmapOptions", "Landroid/opengl/EGLDisplay;", Constants.RequestParamsKeys.IDENTIFIER_KEYSPACE_KEY, "Landroid/opengl/EGLDisplay;", "eglDisplay", "Landroid/opengl/EGLContext;", "l", "Landroid/opengl/EGLContext;", "eglContext", "Landroid/opengl/EGLSurface;", "m", "Landroid/opengl/EGLSurface;", "eglSurface", "Landroid/view/Surface;", Constants.RequestParamsKeys.APP_NAME_KEY, "Landroid/view/Surface;", "surface", "Lsprig/g/a;", "o", "Lsprig/g/a;", "logger", "<init>", "()V", "userleap_release"}, m3637k = 1, m3638mv = {1, 8, 0})
@SourceDebugExtension
/* renamed from: sprig.e.s */
/* loaded from: classes28.dex */
public final class C49027s {

    /* renamed from: a, reason: from kotlin metadata */
    private MediaCodec encoder;

    /* renamed from: b, reason: from kotlin metadata */
    private MediaMuxer muxer;

    /* renamed from: e, reason: from kotlin metadata */
    private long presentationTimeUs;

    /* renamed from: i, reason: from kotlin metadata */
    private Size size;

    /* renamed from: j, reason: from kotlin metadata */
    private final BitmapFactory.Options bitmapOptions;

    /* renamed from: k, reason: from kotlin metadata */
    private EGLDisplay eglDisplay;

    /* renamed from: l, reason: from kotlin metadata */
    private EGLContext eglContext;

    /* renamed from: m, reason: from kotlin metadata */
    private EGLSurface eglSurface;

    /* renamed from: n, reason: from kotlin metadata */
    private Surface surface;

    /* renamed from: o, reason: from kotlin metadata */
    private C49029a logger;

    /* renamed from: c, reason: from kotlin metadata */
    private String mime = "video/avc";

    /* renamed from: d, reason: from kotlin metadata */
    private int trackIndex = -1;

    /* renamed from: f, reason: from kotlin metadata */
    private int frameRate = 2;

    /* renamed from: g, reason: from kotlin metadata */
    private final long timeoutUs = 10000;

    /* renamed from: h, reason: from kotlin metadata */
    private final MediaCodec.BufferInfo bufferInfo = new MediaCodec.BufferInfo();

    @Metadata(m3635d1 = {"\u0000\n\n\u0000\n\u0002\u0010\b\n\u0002\b\u0007\u0010\u0000\u001a\u00020\u0001\"\u0004\b\u0000\u0010\u00022\u000e\u0010\u0003\u001a\n \u0004*\u0004\u0018\u0001H\u0002H\u00022\u000e\u0010\u0005\u001a\n \u0004*\u0004\u0018\u0001H\u0002H\u0002H\n¢\u0006\u0004\b\u0006\u0010\u0007¨\u0006\b"}, m3636d2 = {"<anonymous>", "", "T", Constants.RequestParamsKeys.DEVELOPER_API_KEY, "kotlin.jvm.PlatformType", "b", "compare", "(Ljava/lang/Object;Ljava/lang/Object;)I", "kotlin/comparisons/ComparisonsKt__ComparisonsKt$compareBy$2"}, m3637k = 3, m3638mv = {1, 8, 0}, m3640xi = 48)
    @SourceDebugExtension
    /* renamed from: sprig.e.s$a */
    public static final class a<T> implements Comparator {
        /* JADX WARN: Multi-variable type inference failed */
        @Override // java.util.Comparator
        public final int compare(T t, T t2) {
            return ComparisonsKt.compareValues(Long.valueOf(Long.parseLong(FilesKt.getNameWithoutExtension((File) t))), Long.valueOf(Long.parseLong(FilesKt.getNameWithoutExtension((File) t2))));
        }
    }

    public C49027s() {
        BitmapFactory.Options options = new BitmapFactory.Options();
        options.inPreferredConfig = Bitmap.Config.ARGB_8888;
        this.bitmapOptions = options;
        this.logger = new C49029a();
    }

    /* renamed from: b */
    private final void m4286b(String outVideoFilePath, List<? extends File> images) throws JSONException, IOException {
        MediaCodec encoder = MediaCodec.createEncoderByType(this.mime);
        Size sizeM4284b = m4284b(images);
        if (sizeM4284b == null) {
            C49029a.m4295a(this.logger, "No supported size found", null, "No supported size found for images: " + images, null, null, null, 58, null);
            return;
        }
        this.size = sizeM4284b;
        if (sizeM4284b.getWidth() != 0) {
            Size size = this.size;
            if (size == null) {
                Intrinsics.throwUninitializedPropertyAccessException("size");
                size = null;
            }
            if (size.getHeight() != 0) {
                Size size2 = this.size;
                if (size2 == null) {
                    Intrinsics.throwUninitializedPropertyAccessException("size");
                    size2 = null;
                }
                encoder.configure(m4280a(size2), (Surface) null, (MediaCrypto) null, 1);
                Intrinsics.checkNotNullExpressionValue(encoder, "encoder");
                m4281a(encoder);
                encoder.start();
                this.muxer = new MediaMuxer(outVideoFilePath, 0);
                this.encoder = encoder;
                return;
            }
        }
        Size size3 = null;
        C49029a c49029a = this.logger;
        StringBuilder sb = new StringBuilder();
        sb.append("Size is 0. Width: ");
        Size size4 = this.size;
        if (size4 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("size");
            size4 = null;
        }
        sb.append(size4.getWidth());
        sb.append(", Height: ");
        Size size5 = this.size;
        if (size5 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("size");
        } else {
            size3 = size5;
        }
        sb.append(size3.getHeight());
        C49029a.m4295a(c49029a, "Failed to init encoder", null, sb.toString(), null, null, null, 58, null);
    }

    /* renamed from: c */
    private final void m4287c() {
        MediaCodec mediaCodec = this.encoder;
        if (mediaCodec != null) {
            mediaCodec.stop();
            mediaCodec.release();
        }
        this.encoder = null;
        m4285b();
        MediaMuxer mediaMuxer = this.muxer;
        if (mediaMuxer != null) {
            mediaMuxer.stop();
            mediaMuxer.release();
        }
        this.muxer = null;
        this.trackIndex = -1;
        this.presentationTimeUs = 0L;
    }

    /* renamed from: a */
    public final Object m4288a(String outVideoFilePath, List<? extends File> images) {
        Object objM28550constructorimpl;
        Intrinsics.checkNotNullParameter(outVideoFilePath, "outVideoFilePath");
        Intrinsics.checkNotNullParameter(images, "images");
        try {
            Result.Companion companion = Result.INSTANCE;
            m4286b(outVideoFilePath, images);
            m4282a(images);
            objM28550constructorimpl = Result.m28550constructorimpl(Unit.INSTANCE);
        } catch (Throwable th) {
            Result.Companion companion2 = Result.INSTANCE;
            objM28550constructorimpl = Result.m28550constructorimpl(ResultKt.createFailure(th));
        }
        Throwable thM28553exceptionOrNullimpl = Result.m28553exceptionOrNullimpl(objM28550constructorimpl);
        if (thM28553exceptionOrNullimpl != null) {
            C49029a.m4295a(this.logger, "Error encoding video", null, "Error encoding video: " + thM28553exceptionOrNullimpl + ", outVideoFilePath: " + outVideoFilePath + ", images count: " + images.size(), ExceptionsKt.stackTraceToString(thM28553exceptionOrNullimpl), null, null, 50, null);
        }
        m4287c();
        return objM28550constructorimpl;
    }

    /* renamed from: a */
    private final MediaFormat m4280a(Size size) {
        MediaFormat mediaFormatCreateVideoFormat = MediaFormat.createVideoFormat(this.mime, size.getWidth(), size.getHeight());
        mediaFormatCreateVideoFormat.setInteger("color-format", 2130708361);
        mediaFormatCreateVideoFormat.setInteger("bitrate", 2000000);
        mediaFormatCreateVideoFormat.setInteger("frame-rate", this.frameRate);
        mediaFormatCreateVideoFormat.setInteger("i-frame-interval", 0);
        Intrinsics.checkNotNullExpressionValue(mediaFormatCreateVideoFormat, "createVideoFormat(mime, …ME_INTERVAL, 0)\n        }");
        return mediaFormatCreateVideoFormat;
    }

    /* renamed from: a */
    private final void m4281a(MediaCodec encoder) throws JSONException {
        this.surface = encoder.createInputSurface();
        EGLDisplay eGLDisplayEglGetDisplay = EGL14.eglGetDisplay(0);
        this.eglDisplay = eGLDisplayEglGetDisplay;
        if (!Intrinsics.areEqual(eGLDisplayEglGetDisplay, EGL14.EGL_NO_DISPLAY)) {
            int[] iArr = new int[2];
            if (EGL14.eglInitialize(this.eglDisplay, iArr, 0, iArr, 1)) {
                EGLConfig[] eGLConfigArr = new EGLConfig[1];
                EGL14.eglChooseConfig(this.eglDisplay, new int[]{12324, 8, 12323, 8, 12322, 8, 12321, 8, 12352, 4, 12344}, 0, eGLConfigArr, 0, 1, new int[1], 0);
                int iEglGetError = EGL14.eglGetError();
                if (iEglGetError == 12288) {
                    this.eglContext = EGL14.eglCreateContext(this.eglDisplay, eGLConfigArr[0], EGL14.EGL_NO_CONTEXT, new int[]{12440, 2, 12344}, 0);
                    int iEglGetError2 = EGL14.eglGetError();
                    if (iEglGetError2 == 12288) {
                        this.eglSurface = EGL14.eglCreateWindowSurface(this.eglDisplay, eGLConfigArr[0], this.surface, new int[]{12344}, 0);
                        int iEglGetError3 = EGL14.eglGetError();
                        if (iEglGetError3 == 12288) {
                            EGLDisplay eGLDisplay = this.eglDisplay;
                            EGLSurface eGLSurface = this.eglSurface;
                            if (EGL14.eglMakeCurrent(eGLDisplay, eGLSurface, eGLSurface, this.eglContext)) {
                                return;
                            }
                            C49029a.m4295a(this.logger, "Failed to make EGL current", null, GLUtils.getEGLErrorString(EGL14.eglGetError()), null, null, null, 58, null);
                            throw new RuntimeException("Failed to make EGL current: " + GLUtils.getEGLErrorString(EGL14.eglGetError()));
                        }
                        C49029a.m4295a(this.logger, "Failed to create EGL surface", null, GLUtils.getEGLErrorString(iEglGetError3), null, null, null, 58, null);
                        throw new RuntimeException(GLUtils.getEGLErrorString(iEglGetError3));
                    }
                    C49029a.m4295a(this.logger, "Failed to create EGL context", null, GLUtils.getEGLErrorString(iEglGetError2), null, null, null, 58, null);
                    throw new RuntimeException(GLUtils.getEGLErrorString(iEglGetError2));
                }
                C49029a.m4295a(this.logger, "Failed to choose config while initializing EGL", null, GLUtils.getEGLErrorString(iEglGetError), null, null, null, 58, null);
                throw new RuntimeException(GLUtils.getEGLErrorString(iEglGetError));
            }
            C49029a.m4295a(this.logger, "Error initializing EGL", null, GLUtils.getEGLErrorString(EGL14.eglGetError()), null, null, null, 58, null);
            throw new RuntimeException("Error initializing EGL: " + GLUtils.getEGLErrorString(EGL14.eglGetError()));
        }
        String eGLErrorString = GLUtils.getEGLErrorString(EGL14.eglGetError());
        C49029a.m4295a(this.logger, "Error getting EGL display", null, eGLErrorString, null, null, null, 58, null);
        throw new RuntimeException("Error getting EGL display: " + eGLErrorString);
    }

    /* renamed from: b */
    private final Size m4284b(List<? extends File> images) throws JSONException {
        Integer numValueOf;
        Integer numValueOf2;
        Iterator<T> it = images.iterator();
        if (it.hasNext()) {
            numValueOf = Integer.valueOf(m4278a((File) it.next()).getWidth());
            while (it.hasNext()) {
                Integer numValueOf3 = Integer.valueOf(m4278a((File) it.next()).getWidth());
                if (numValueOf.compareTo(numValueOf3) < 0) {
                    numValueOf = numValueOf3;
                }
            }
        } else {
            numValueOf = null;
        }
        Iterator<T> it2 = images.iterator();
        if (it2.hasNext()) {
            numValueOf2 = Integer.valueOf(m4278a((File) it2.next()).getHeight());
            while (it2.hasNext()) {
                Integer numValueOf4 = Integer.valueOf(m4278a((File) it2.next()).getHeight());
                if (numValueOf2.compareTo(numValueOf4) < 0) {
                    numValueOf2 = numValueOf4;
                }
            }
        } else {
            numValueOf2 = null;
        }
        if (numValueOf != null && numValueOf2 != null) {
            return new Size(numValueOf.intValue(), numValueOf2.intValue());
        }
        C49029a.m4295a(this.logger, "Failed to calculate video size", null, "Failed to calculate video size for images: " + images, null, null, null, 58, null);
        return null;
    }

    /* renamed from: b */
    private final void m4285b() {
        EGLDisplay eGLDisplay = this.eglDisplay;
        if (eGLDisplay == null || Intrinsics.areEqual(eGLDisplay, EGL14.EGL_NO_DISPLAY)) {
            eGLDisplay = null;
        }
        if (eGLDisplay != null) {
            EGLSurface eGLSurface = this.eglSurface;
            if (eGLSurface != null) {
                EGL14.eglDestroySurface(eGLDisplay, eGLSurface);
            }
            EGLContext eGLContext = this.eglContext;
            if (eGLContext != null) {
                EGL14.eglDestroyContext(eGLDisplay, eGLContext);
            }
            EGL14.eglReleaseThread();
            EGL14.eglTerminate(eGLDisplay);
        }
        Surface surface = this.surface;
        if (surface != null) {
            surface.release();
        }
        this.surface = null;
        this.eglDisplay = EGL14.EGL_NO_DISPLAY;
        this.eglContext = EGL14.EGL_NO_CONTEXT;
        this.eglSurface = EGL14.EGL_NO_SURFACE;
    }

    /* renamed from: a */
    private final void m4282a(List<? extends File> images) throws JSONException {
        C49024p c49024p = new C49024p();
        List listSortedWith = CollectionsKt.sortedWith(images, new a());
        int size = listSortedWith.size();
        int i = 0;
        while (i < size) {
            m4279a(false);
            File file = (File) listSortedWith.get(i);
            i++;
            File file2 = (File) CollectionsKt.getOrNull(listSortedWith, i);
            if (file2 == null) {
                file2 = file;
            }
            Bitmap bitmapM4278a = m4278a(file);
            Size size2 = this.size;
            if (size2 == null) {
                Intrinsics.throwUninitializedPropertyAccessException("size");
                size2 = null;
            }
            c49024p.m4276a(size2, bitmapM4278a, m4283a());
            long j = 1000;
            EGLExt.eglPresentationTimeANDROID(this.eglDisplay, this.eglSurface, this.presentationTimeUs * j);
            long j2 = Long.parseLong(FilesKt.getNameWithoutExtension(file2)) - Long.parseLong(FilesKt.getNameWithoutExtension(file));
            if (j2 == 0) {
                this.presentationTimeUs += InvestFlowConstants.MAX_ONE_TIME_AMOUNT;
            } else {
                this.presentationTimeUs += j2 * j;
            }
            EGL14.eglSwapBuffers(this.eglDisplay, this.eglSurface);
        }
        m4279a(true);
    }

    /* renamed from: a */
    private final MediaCodec m4279a(boolean endOfStream) {
        MediaCodec mediaCodec = this.encoder;
        if (mediaCodec == null) {
            return null;
        }
        MediaMuxer mediaMuxer = this.muxer;
        if (mediaMuxer != null) {
            if (endOfStream) {
                mediaCodec.signalEndOfInputStream();
            }
            while (true) {
                int iDequeueOutputBuffer = mediaCodec.dequeueOutputBuffer(this.bufferInfo, this.timeoutUs);
                if (iDequeueOutputBuffer >= 0) {
                    ByteBuffer outputBuffer = mediaCodec.getOutputBuffer(iDequeueOutputBuffer);
                    if (outputBuffer == null) {
                        break;
                    }
                    Intrinsics.checkNotNullExpressionValue(outputBuffer, "getOutputBuffer(outBufferId) ?: break");
                    MediaCodec.BufferInfo bufferInfo = this.bufferInfo;
                    bufferInfo.presentationTimeUs = this.presentationTimeUs;
                    mediaMuxer.writeSampleData(this.trackIndex, outputBuffer, bufferInfo);
                    mediaCodec.releaseOutputBuffer(iDequeueOutputBuffer, false);
                    if ((this.bufferInfo.flags & 4) != 0) {
                        break;
                    }
                } else if (iDequeueOutputBuffer == -1) {
                    if (!endOfStream) {
                        break;
                    }
                } else if (iDequeueOutputBuffer == -2) {
                    MediaCodec mediaCodec2 = this.encoder;
                    Intrinsics.checkNotNull(mediaCodec2);
                    this.trackIndex = mediaMuxer.addTrack(mediaCodec2.getOutputFormat());
                    mediaMuxer.start();
                }
            }
        }
        return mediaCodec;
    }

    /* renamed from: a */
    private final float[] m4283a() {
        float[] fArr = new float[16];
        Matrix.setIdentityM(fArr, 0);
        Matrix.scaleM(fArr, 0, 1.0f, -1.0f, 1.0f);
        return fArr;
    }

    /* renamed from: a */
    private final Bitmap m4278a(File file) throws JSONException {
        Bitmap bitmapDecodeFile = BitmapFactory.decodeFile(file.getPath(), this.bitmapOptions);
        if (bitmapDecodeFile != null) {
            return bitmapDecodeFile;
        }
        C49029a.m4295a(this.logger, "Failed to decode image", null, "Failed to decode image: " + file.getPath(), null, null, null, 58, null);
        throw new RuntimeException("Failed to decode image: " + file.getPath());
    }
}
