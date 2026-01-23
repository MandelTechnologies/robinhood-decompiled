package sprig.graphics;

import android.graphics.Bitmap;
import android.opengl.GLES20;
import android.opengl.GLUtils;
import android.util.Size;
import com.singular.sdk.internal.Constants;
import java.nio.ByteBuffer;
import java.nio.ByteOrder;
import java.nio.FloatBuffer;
import java.nio.IntBuffer;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

@Metadata(m3635d1 = {"\u0000H\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0014\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0007\n\u0002\u0010\u0015\n\u0002\b\u0012\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\n\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b8\u00109J\u0018\u0010\u0006\u001a\u00020\u00022\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u0004H\u0002J\u001e\u0010\u0006\u001a\u00020\r2\u0006\u0010\b\u001a\u00020\u00072\u0006\u0010\n\u001a\u00020\t2\u0006\u0010\f\u001a\u00020\u000bR\u0014\u0010\u000f\u001a\u00020\u00048\u0002X\u0082D¢\u0006\u0006\n\u0004\b\u0006\u0010\u000eR\u0014\u0010\u0011\u001a\u00020\u00048\u0002X\u0082D¢\u0006\u0006\n\u0004\b\u0010\u0010\u000eR\u0016\u0010\u0014\u001a\u00020\u000b8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u0012\u0010\u0013R\u0016\u0010\u0018\u001a\u00020\u00158\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u0016\u0010\u0017R\u0016\u0010\u001b\u001a\u00020\u00028\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u0019\u0010\u001aR\u0016\u0010\u001d\u001a\u00020\u00028\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u001c\u0010\u001aR\u0016\u0010\u001f\u001a\u00020\u00158\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u001e\u0010\u0017R\u0016\u0010!\u001a\u00020\u00028\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b \u0010\u001aR\u0016\u0010#\u001a\u00020\u00028\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\"\u0010\u001aR\u0016\u0010%\u001a\u00020\u00028\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b$\u0010\u001aR\u0014\u0010'\u001a\u00020\u00158\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b&\u0010\u0017R\"\u0010/\u001a\u00020(8\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b)\u0010*\u001a\u0004\b+\u0010,\"\u0004\b-\u0010.R\"\u00107\u001a\u0002008\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b1\u00102\u001a\u0004\b3\u00104\"\u0004\b5\u00106¨\u0006:"}, m3636d2 = {"Lsprig/e/p;", "", "", "type", "", "shaderCode", Constants.RequestParamsKeys.DEVELOPER_API_KEY, "Landroid/util/Size;", "muxerSize", "Landroid/graphics/Bitmap;", "bitmap", "", "mvpMatrix", "", "Ljava/lang/String;", "vertexShaderCode", "b", "fragmentShaderCode", "c", "[F", "vertices", "", "d", "[I", "indices", Constants.RequestBody.EXTRA_ATTRIBUTES_KEY, "I", "program", "f", "vertexHandle", "g", "bufferHandles", "h", "uvsHandle", Constants.RequestParamsKeys.PACKAGE_NAME_KEY, "mvpHandle", "j", "samplerHandle", Constants.RequestParamsKeys.IDENTIFIER_KEYSPACE_KEY, "textureHandle", "Ljava/nio/FloatBuffer;", "l", "Ljava/nio/FloatBuffer;", "getVertexBuffer", "()Ljava/nio/FloatBuffer;", "setVertexBuffer", "(Ljava/nio/FloatBuffer;)V", "vertexBuffer", "Ljava/nio/IntBuffer;", "m", "Ljava/nio/IntBuffer;", "getIndexBuffer", "()Ljava/nio/IntBuffer;", "setIndexBuffer", "(Ljava/nio/IntBuffer;)V", "indexBuffer", "<init>", "()V", "userleap_release"}, m3637k = 1, m3638mv = {1, 8, 0})
/* renamed from: sprig.e.p */
/* loaded from: classes28.dex */
public final class C49024p {

    /* renamed from: e, reason: from kotlin metadata */
    private int program;

    /* renamed from: f, reason: from kotlin metadata */
    private int vertexHandle;

    /* renamed from: h, reason: from kotlin metadata */
    private int uvsHandle;

    /* renamed from: i, reason: from kotlin metadata */
    private int mvpHandle;

    /* renamed from: j, reason: from kotlin metadata */
    private int samplerHandle;

    /* renamed from: k, reason: from kotlin metadata */
    private final int[] textureHandle;

    /* renamed from: l, reason: from kotlin metadata */
    private FloatBuffer vertexBuffer;

    /* renamed from: m, reason: from kotlin metadata */
    private IntBuffer indexBuffer;

    /* renamed from: a, reason: from kotlin metadata */
    private final String vertexShaderCode = "precision highp float;\nattribute vec3 vertexPosition;\nattribute vec2 uvs;\nvarying vec2 varUvs;\nuniform mat4 mvp;\n\nvoid main()\n{\n\tvarUvs = uvs;\n\tgl_Position = mvp * vec4(vertexPosition, 1.0);\n}";

    /* renamed from: b, reason: from kotlin metadata */
    private final String fragmentShaderCode = "precision mediump float;\n\nvarying vec2 varUvs;\nuniform sampler2D texSampler;\n\nvoid main()\n{\t\n\tgl_FragColor = texture2D(texSampler, varUvs);\n}";

    /* renamed from: c, reason: from kotlin metadata */
    private float[] vertices = {-1.0f, -1.0f, 0.0f, 0.0f, 0.0f, -1.0f, 1.0f, 0.0f, 0.0f, 1.0f, 1.0f, 1.0f, 0.0f, 1.0f, 1.0f, 1.0f, -1.0f, 0.0f, 1.0f, 0.0f};

    /* renamed from: d, reason: from kotlin metadata */
    private int[] indices = {2, 1, 0, 0, 3, 2};

    /* renamed from: g, reason: from kotlin metadata */
    private int[] bufferHandles = new int[2];

    public C49024p() {
        int[] iArr = new int[1];
        this.textureHandle = iArr;
        ByteBuffer byteBufferAllocateDirect = ByteBuffer.allocateDirect(80);
        byteBufferAllocateDirect.order(ByteOrder.nativeOrder());
        FloatBuffer floatBufferAsFloatBuffer = byteBufferAllocateDirect.asFloatBuffer();
        floatBufferAsFloatBuffer.put(this.vertices);
        floatBufferAsFloatBuffer.position(0);
        Intrinsics.checkNotNullExpressionValue(floatBufferAsFloatBuffer, "allocateDirect(vertices.…sition(0)\n        }\n    }");
        this.vertexBuffer = floatBufferAsFloatBuffer;
        ByteBuffer byteBufferAllocateDirect2 = ByteBuffer.allocateDirect(this.indices.length * 4);
        byteBufferAllocateDirect2.order(ByteOrder.nativeOrder());
        IntBuffer intBufferAsIntBuffer = byteBufferAllocateDirect2.asIntBuffer();
        intBufferAsIntBuffer.put(this.indices);
        intBufferAsIntBuffer.position(0);
        Intrinsics.checkNotNullExpressionValue(intBufferAsIntBuffer, "allocateDirect(indices.s…sition(0)\n        }\n    }");
        this.indexBuffer = intBufferAsIntBuffer;
        int iM4275a = m4275a(35633, "precision highp float;\nattribute vec3 vertexPosition;\nattribute vec2 uvs;\nvarying vec2 varUvs;\nuniform mat4 mvp;\n\nvoid main()\n{\n\tvarUvs = uvs;\n\tgl_Position = mvp * vec4(vertexPosition, 1.0);\n}");
        int iM4275a2 = m4275a(35632, "precision mediump float;\n\nvarying vec2 varUvs;\nuniform sampler2D texSampler;\n\nvoid main()\n{\t\n\tgl_FragColor = texture2D(texSampler, varUvs);\n}");
        int iGlCreateProgram = GLES20.glCreateProgram();
        GLES20.glAttachShader(iGlCreateProgram, iM4275a);
        GLES20.glAttachShader(iGlCreateProgram, iM4275a2);
        GLES20.glLinkProgram(iGlCreateProgram);
        this.vertexHandle = GLES20.glGetAttribLocation(iGlCreateProgram, "vertexPosition");
        this.uvsHandle = GLES20.glGetAttribLocation(iGlCreateProgram, "uvs");
        this.mvpHandle = GLES20.glGetUniformLocation(iGlCreateProgram, "mvp");
        this.samplerHandle = GLES20.glGetUniformLocation(iGlCreateProgram, "texSampler");
        this.program = iGlCreateProgram;
        GLES20.glGenBuffers(2, this.bufferHandles, 0);
        GLES20.glBindBuffer(34962, this.bufferHandles[0]);
        GLES20.glBufferData(34962, this.vertices.length * 4, this.vertexBuffer, 35048);
        GLES20.glBindBuffer(34963, this.bufferHandles[1]);
        GLES20.glBufferData(34963, this.indices.length * 4, this.indexBuffer, 35048);
        GLES20.glGenTextures(1, iArr, 0);
        GLES20.glEnable(3042);
        GLES20.glBlendFunc(770, 771);
    }

    /* renamed from: a */
    private final int m4275a(int type2, String shaderCode) {
        int iGlCreateShader = GLES20.glCreateShader(type2);
        GLES20.glShaderSource(iGlCreateShader, shaderCode);
        GLES20.glCompileShader(iGlCreateShader);
        return iGlCreateShader;
    }

    /* renamed from: a */
    public final void m4276a(Size muxerSize, Bitmap bitmap, float[] mvpMatrix) {
        int height;
        int width;
        Intrinsics.checkNotNullParameter(muxerSize, "muxerSize");
        Intrinsics.checkNotNullParameter(bitmap, "bitmap");
        Intrinsics.checkNotNullParameter(mvpMatrix, "mvpMatrix");
        GLES20.glClear(16640);
        GLES20.glClearColor(0.0f, 0.0f, 0.0f, 0.0f);
        if (muxerSize.getHeight() == muxerSize.getWidth()) {
            width = (muxerSize.getWidth() - bitmap.getWidth()) / 2;
            height = (muxerSize.getHeight() - bitmap.getHeight()) / 2;
        } else {
            height = 0;
            width = 0;
        }
        GLES20.glViewport(width, height, bitmap.getWidth(), bitmap.getHeight());
        GLES20.glUseProgram(this.program);
        GLES20.glUniformMatrix4fv(this.mvpHandle, 1, false, mvpMatrix, 0);
        GLES20.glActiveTexture(33984);
        GLES20.glBindTexture(3553, this.textureHandle[0]);
        GLES20.glPixelStorei(3317, 1);
        GLUtils.texImage2D(3553, 0, bitmap, 0);
        GLES20.glTexParameteri(3553, 10241, 9728);
        GLES20.glTexParameteri(3553, 10240, 9728);
        GLES20.glBindBuffer(34962, this.bufferHandles[0]);
        GLES20.glBindBuffer(34963, this.bufferHandles[1]);
        GLES20.glEnableVertexAttribArray(this.vertexHandle);
        GLES20.glVertexAttribPointer(this.vertexHandle, 3, 5126, false, 20, 0);
        GLES20.glEnableVertexAttribArray(this.uvsHandle);
        GLES20.glVertexAttribPointer(this.uvsHandle, 2, 5126, false, 20, 12);
        GLES20.glDrawElements(4, 6, 5125, 0);
    }
}
