package kotlin.reflect.jvm.internal.impl.load.java;

import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.FunctionReferenceImpl;
import kotlin.jvm.internal.Intrinsics;
import kotlin.reflect.jvm.internal.impl.name.FqName;

/* compiled from: JavaTypeEnhancementState.kt */
/* renamed from: kotlin.reflect.jvm.internal.impl.load.java.JavaTypeEnhancementState$Companion$DEFAULT$1, reason: use source file name */
/* loaded from: classes21.dex */
/* synthetic */ class JavaTypeEnhancementState2 extends FunctionReferenceImpl implements Function1<FqName, ReportLevel> {
    public static final JavaTypeEnhancementState2 INSTANCE = new JavaTypeEnhancementState2();

    JavaTypeEnhancementState2() {
        super(1, JavaNullabilityAnnotationSettings.class, "getDefaultReportLevelForAnnotation", "getDefaultReportLevelForAnnotation(Lorg/jetbrains/kotlin/name/FqName;)Lorg/jetbrains/kotlin/load/java/ReportLevel;", 1);
    }

    @Override // kotlin.jvm.functions.Function1
    public final ReportLevel invoke(FqName p0) {
        Intrinsics.checkNotNullParameter(p0, "p0");
        return JavaNullabilityAnnotationSettings.getDefaultReportLevelForAnnotation(p0);
    }
}
