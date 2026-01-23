package kotlin.coroutines.jvm.internal;

import java.lang.reflect.Field;
import kotlin.Metadata;
import kotlin.SinceKotlin;
import kotlin.jvm.JvmName;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import org.bouncycastle.jcajce.util.AnnotatedPrivateKey;

/* compiled from: DebugMetadata.kt */
@Metadata(m3635d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0004\n\u0002\u0010\u0002\n\u0002\b\u0003\u001a\u0015\u0010\u0004\u001a\u0004\u0018\u00010\u0001*\u00020\u0000H\u0001¢\u0006\u0004\b\u0002\u0010\u0003\u001a\u0015\u0010\u0006\u001a\u0004\u0018\u00010\u0005*\u00020\u0000H\u0002¢\u0006\u0004\b\u0006\u0010\u0007\u001a\u0013\u0010\t\u001a\u00020\b*\u00020\u0000H\u0002¢\u0006\u0004\b\t\u0010\n\u001a\u001f\u0010\u000e\u001a\u00020\r2\u0006\u0010\u000b\u001a\u00020\b2\u0006\u0010\f\u001a\u00020\bH\u0002¢\u0006\u0004\b\u000e\u0010\u000f¨\u0006\u0010"}, m3636d2 = {"Lkotlin/coroutines/jvm/internal/BaseContinuationImpl;", "Ljava/lang/StackTraceElement;", "getStackTraceElement", "(Lkotlin/coroutines/jvm/internal/BaseContinuationImpl;)Ljava/lang/StackTraceElement;", "getStackTraceElementImpl", "Lkotlin/coroutines/jvm/internal/DebugMetadata;", "getDebugMetadataAnnotation", "(Lkotlin/coroutines/jvm/internal/BaseContinuationImpl;)Lkotlin/coroutines/jvm/internal/DebugMetadata;", "", "getLabel", "(Lkotlin/coroutines/jvm/internal/BaseContinuationImpl;)I", "expected", "actual", "", "checkDebugMetadataVersion", "(II)V", "kotlin-stdlib"}, m3637k = 2, m3638mv = {2, 1, 0}, m3640xi = 48)
@SourceDebugExtension
/* renamed from: kotlin.coroutines.jvm.internal.DebugMetadataKt, reason: use source file name */
/* loaded from: classes21.dex */
public final class DebugMetadata2 {
    @SinceKotlin
    @JvmName
    public static final StackTraceElement getStackTraceElement(ContinuationImpl2 continuationImpl2) throws IllegalAccessException, NoSuchFieldException, SecurityException, IllegalArgumentException {
        String strM3644c;
        Intrinsics.checkNotNullParameter(continuationImpl2, "<this>");
        DebugMetadata debugMetadataAnnotation = getDebugMetadataAnnotation(continuationImpl2);
        if (debugMetadataAnnotation == null) {
            return null;
        }
        checkDebugMetadataVersion(1, debugMetadataAnnotation.m3648v());
        int label = getLabel(continuationImpl2);
        int i = label < 0 ? -1 : debugMetadataAnnotation.m3646l()[label];
        String moduleName = DebugMetadata3.INSTANCE.getModuleName(continuationImpl2);
        if (moduleName == null) {
            strM3644c = debugMetadataAnnotation.m3644c();
        } else {
            strM3644c = moduleName + '/' + debugMetadataAnnotation.m3644c();
        }
        return new StackTraceElement(strM3644c, debugMetadataAnnotation.m3647m(), debugMetadataAnnotation.m3645f(), i);
    }

    private static final DebugMetadata getDebugMetadataAnnotation(ContinuationImpl2 continuationImpl2) {
        return (DebugMetadata) continuationImpl2.getClass().getAnnotation(DebugMetadata.class);
    }

    private static final int getLabel(ContinuationImpl2 continuationImpl2) throws IllegalAccessException, NoSuchFieldException, SecurityException, IllegalArgumentException {
        try {
            Field declaredField = continuationImpl2.getClass().getDeclaredField(AnnotatedPrivateKey.LABEL);
            declaredField.setAccessible(true);
            Object obj = declaredField.get(continuationImpl2);
            Integer num = obj instanceof Integer ? (Integer) obj : null;
            return (num != null ? num.intValue() : 0) - 1;
        } catch (Exception unused) {
            return -1;
        }
    }

    private static final void checkDebugMetadataVersion(int i, int i2) {
        if (i2 <= i) {
            return;
        }
        throw new IllegalStateException(("Debug metadata version mismatch. Expected: " + i + ", got " + i2 + ". Please update the Kotlin standard library.").toString());
    }
}
