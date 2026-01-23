package kotlin.reflect.jvm.internal.impl.load.java.typeEnhancement;

import java.util.Map;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlin.reflect.jvm.internal.impl.load.java.typeEnhancement.predefinedEnhancementInfo3;
import kotlin.reflect.jvm.internal.impl.load.kotlin.SignatureBuildingComponents;
import kotlin.reflect.jvm.internal.impl.resolve.jvm.JvmPrimitiveType;

/* compiled from: predefinedEnhancementInfo.kt */
@SourceDebugExtension
/* renamed from: kotlin.reflect.jvm.internal.impl.load.java.typeEnhancement.PredefinedEnhancementInfoKt, reason: use source file name */
/* loaded from: classes14.dex */
public final class predefinedEnhancementInfo {
    private static final typeQualifiers NOT_NULLABLE;
    private static final typeQualifiers NOT_PLATFORM;
    private static final typeQualifiers NULLABLE = new typeQualifiers(typeQualifiers3.NULLABLE, null, false, false, 8, null);
    private static final Map<String, predefinedEnhancementInfo2> PREDEFINED_FUNCTION_ENHANCEMENT_INFO_BY_SIGNATURE;

    static {
        typeQualifiers3 typequalifiers3 = typeQualifiers3.NOT_NULL;
        NOT_PLATFORM = new typeQualifiers(typequalifiers3, null, false, false, 8, null);
        NOT_NULLABLE = new typeQualifiers(typequalifiers3, null, true, false, 8, null);
        final SignatureBuildingComponents signatureBuildingComponents = SignatureBuildingComponents.INSTANCE;
        final String strJavaLang = signatureBuildingComponents.javaLang("Object");
        final String strJavaFunction = signatureBuildingComponents.javaFunction("Predicate");
        final String strJavaFunction2 = signatureBuildingComponents.javaFunction("Function");
        final String strJavaFunction3 = signatureBuildingComponents.javaFunction("Consumer");
        final String strJavaFunction4 = signatureBuildingComponents.javaFunction("BiFunction");
        final String strJavaFunction5 = signatureBuildingComponents.javaFunction("BiConsumer");
        final String strJavaFunction6 = signatureBuildingComponents.javaFunction("UnaryOperator");
        final String strJavaUtil = signatureBuildingComponents.javaUtil("stream/Stream");
        final String strJavaUtil2 = signatureBuildingComponents.javaUtil("Optional");
        predefinedEnhancementInfo3 predefinedenhancementinfo3 = new predefinedEnhancementInfo3();
        predefinedEnhancementInfo3.ClassEnhancementBuilder.function$default(new predefinedEnhancementInfo3.ClassEnhancementBuilder(predefinedenhancementinfo3, signatureBuildingComponents.javaUtil("Iterator")), "forEachRemaining", null, new Function1(strJavaFunction3) { // from class: kotlin.reflect.jvm.internal.impl.load.java.typeEnhancement.PredefinedEnhancementInfoKt$$Lambda$0
            private final String arg$0;

            {
                this.arg$0 = strJavaFunction3;
            }

            @Override // kotlin.jvm.functions.Function1
            public Object invoke(Object obj) {
                return predefinedEnhancementInfo.m3670x57ff66e8(this.arg$0, (predefinedEnhancementInfo3.ClassEnhancementBuilder.FunctionEnhancementBuilder) obj);
            }
        }, 2, null);
        predefinedEnhancementInfo3.ClassEnhancementBuilder.function$default(new predefinedEnhancementInfo3.ClassEnhancementBuilder(predefinedenhancementinfo3, signatureBuildingComponents.javaLang("Iterable")), "spliterator", null, new Function1(signatureBuildingComponents) { // from class: kotlin.reflect.jvm.internal.impl.load.java.typeEnhancement.PredefinedEnhancementInfoKt$$Lambda$1
            private final SignatureBuildingComponents arg$0;

            {
                this.arg$0 = signatureBuildingComponents;
            }

            @Override // kotlin.jvm.functions.Function1
            public Object invoke(Object obj) {
                return predefinedEnhancementInfo.m3686x40924928(this.arg$0, (predefinedEnhancementInfo3.ClassEnhancementBuilder.FunctionEnhancementBuilder) obj);
            }
        }, 2, null);
        predefinedEnhancementInfo3.ClassEnhancementBuilder classEnhancementBuilder = new predefinedEnhancementInfo3.ClassEnhancementBuilder(predefinedenhancementinfo3, signatureBuildingComponents.javaUtil("Collection"));
        predefinedEnhancementInfo3.ClassEnhancementBuilder.function$default(classEnhancementBuilder, "removeIf", null, new Function1(strJavaFunction) { // from class: kotlin.reflect.jvm.internal.impl.load.java.typeEnhancement.PredefinedEnhancementInfoKt$$Lambda$2
            private final String arg$0;

            {
                this.arg$0 = strJavaFunction;
            }

            @Override // kotlin.jvm.functions.Function1
            public Object invoke(Object obj) {
                return predefinedEnhancementInfo.m3711x11b80da6(this.arg$0, (predefinedEnhancementInfo3.ClassEnhancementBuilder.FunctionEnhancementBuilder) obj);
            }
        }, 2, null);
        predefinedEnhancementInfo3.ClassEnhancementBuilder.function$default(classEnhancementBuilder, "stream", null, new Function1(strJavaUtil) { // from class: kotlin.reflect.jvm.internal.impl.load.java.typeEnhancement.PredefinedEnhancementInfoKt$$Lambda$3
            private final String arg$0;

            {
                this.arg$0 = strJavaUtil;
            }

            @Override // kotlin.jvm.functions.Function1
            public Object invoke(Object obj) {
                return predefinedEnhancementInfo.m3712x11b80da7(this.arg$0, (predefinedEnhancementInfo3.ClassEnhancementBuilder.FunctionEnhancementBuilder) obj);
            }
        }, 2, null);
        predefinedEnhancementInfo3.ClassEnhancementBuilder.function$default(classEnhancementBuilder, "parallelStream", null, new Function1(strJavaUtil) { // from class: kotlin.reflect.jvm.internal.impl.load.java.typeEnhancement.PredefinedEnhancementInfoKt$$Lambda$4
            private final String arg$0;

            {
                this.arg$0 = strJavaUtil;
            }

            @Override // kotlin.jvm.functions.Function1
            public Object invoke(Object obj) {
                return predefinedEnhancementInfo.m3713x11b80da8(this.arg$0, (predefinedEnhancementInfo3.ClassEnhancementBuilder.FunctionEnhancementBuilder) obj);
            }
        }, 2, null);
        predefinedEnhancementInfo3.ClassEnhancementBuilder classEnhancementBuilder2 = new predefinedEnhancementInfo3.ClassEnhancementBuilder(predefinedenhancementinfo3, signatureBuildingComponents.javaUtil("List"));
        predefinedEnhancementInfo3.ClassEnhancementBuilder.function$default(classEnhancementBuilder2, "replaceAll", null, new Function1(strJavaFunction6) { // from class: kotlin.reflect.jvm.internal.impl.load.java.typeEnhancement.PredefinedEnhancementInfoKt$$Lambda$5
            private final String arg$0;

            {
                this.arg$0 = strJavaFunction6;
            }

            @Override // kotlin.jvm.functions.Function1
            public Object invoke(Object obj) {
                return predefinedEnhancementInfo.m3674x538965db(this.arg$0, (predefinedEnhancementInfo3.ClassEnhancementBuilder.FunctionEnhancementBuilder) obj);
            }
        }, 2, null);
        classEnhancementBuilder2.function("addFirst", "2.1", new Function1(strJavaLang) { // from class: kotlin.reflect.jvm.internal.impl.load.java.typeEnhancement.PredefinedEnhancementInfoKt$$Lambda$6
            private final String arg$0;

            {
                this.arg$0 = strJavaLang;
            }

            @Override // kotlin.jvm.functions.Function1
            public Object invoke(Object obj) {
                return predefinedEnhancementInfo.m3675x538965dc(this.arg$0, (predefinedEnhancementInfo3.ClassEnhancementBuilder.FunctionEnhancementBuilder) obj);
            }
        });
        classEnhancementBuilder2.function("addLast", "2.1", new Function1(strJavaLang) { // from class: kotlin.reflect.jvm.internal.impl.load.java.typeEnhancement.PredefinedEnhancementInfoKt$$Lambda$7
            private final String arg$0;

            {
                this.arg$0 = strJavaLang;
            }

            @Override // kotlin.jvm.functions.Function1
            public Object invoke(Object obj) {
                return predefinedEnhancementInfo.m3671x1da354dc(this.arg$0, (predefinedEnhancementInfo3.ClassEnhancementBuilder.FunctionEnhancementBuilder) obj);
            }
        });
        classEnhancementBuilder2.function("removeFirst", "2.1", new Function1(strJavaLang) { // from class: kotlin.reflect.jvm.internal.impl.load.java.typeEnhancement.PredefinedEnhancementInfoKt$$Lambda$8
            private final String arg$0;

            {
                this.arg$0 = strJavaLang;
            }

            @Override // kotlin.jvm.functions.Function1
            public Object invoke(Object obj) {
                return predefinedEnhancementInfo.m3672x1da354dd(this.arg$0, (predefinedEnhancementInfo3.ClassEnhancementBuilder.FunctionEnhancementBuilder) obj);
            }
        });
        classEnhancementBuilder2.function("removeLast", "2.1", new Function1(strJavaLang) { // from class: kotlin.reflect.jvm.internal.impl.load.java.typeEnhancement.PredefinedEnhancementInfoKt$$Lambda$9
            private final String arg$0;

            {
                this.arg$0 = strJavaLang;
            }

            @Override // kotlin.jvm.functions.Function1
            public Object invoke(Object obj) {
                return predefinedEnhancementInfo.m3673x1da354de(this.arg$0, (predefinedEnhancementInfo3.ClassEnhancementBuilder.FunctionEnhancementBuilder) obj);
            }
        });
        predefinedEnhancementInfo3.ClassEnhancementBuilder classEnhancementBuilder3 = new predefinedEnhancementInfo3.ClassEnhancementBuilder(predefinedenhancementinfo3, signatureBuildingComponents.javaUtil("LinkedList"));
        classEnhancementBuilder3.function("addFirst", "2.1", new Function1(strJavaLang) { // from class: kotlin.reflect.jvm.internal.impl.load.java.typeEnhancement.PredefinedEnhancementInfoKt$$Lambda$10
            private final String arg$0;

            {
                this.arg$0 = strJavaLang;
            }

            @Override // kotlin.jvm.functions.Function1
            public Object invoke(Object obj) {
                return predefinedEnhancementInfo.m3676x61ad2a5(this.arg$0, (predefinedEnhancementInfo3.ClassEnhancementBuilder.FunctionEnhancementBuilder) obj);
            }
        });
        classEnhancementBuilder3.function("addLast", "2.1", new Function1(strJavaLang) { // from class: kotlin.reflect.jvm.internal.impl.load.java.typeEnhancement.PredefinedEnhancementInfoKt$$Lambda$11
            private final String arg$0;

            {
                this.arg$0 = strJavaLang;
            }

            @Override // kotlin.jvm.functions.Function1
            public Object invoke(Object obj) {
                return predefinedEnhancementInfo.m3677x61ad2a6(this.arg$0, (predefinedEnhancementInfo3.ClassEnhancementBuilder.FunctionEnhancementBuilder) obj);
            }
        });
        classEnhancementBuilder3.function("removeFirst", "2.1", new Function1(strJavaLang) { // from class: kotlin.reflect.jvm.internal.impl.load.java.typeEnhancement.PredefinedEnhancementInfoKt$$Lambda$12
            private final String arg$0;

            {
                this.arg$0 = strJavaLang;
            }

            @Override // kotlin.jvm.functions.Function1
            public Object invoke(Object obj) {
                return predefinedEnhancementInfo.m3678x61ad2a7(this.arg$0, (predefinedEnhancementInfo3.ClassEnhancementBuilder.FunctionEnhancementBuilder) obj);
            }
        });
        classEnhancementBuilder3.function("removeLast", "2.1", new Function1(strJavaLang) { // from class: kotlin.reflect.jvm.internal.impl.load.java.typeEnhancement.PredefinedEnhancementInfoKt$$Lambda$13
            private final String arg$0;

            {
                this.arg$0 = strJavaLang;
            }

            @Override // kotlin.jvm.functions.Function1
            public Object invoke(Object obj) {
                return predefinedEnhancementInfo.m3679x61ad2a8(this.arg$0, (predefinedEnhancementInfo3.ClassEnhancementBuilder.FunctionEnhancementBuilder) obj);
            }
        });
        predefinedEnhancementInfo3.ClassEnhancementBuilder classEnhancementBuilder4 = new predefinedEnhancementInfo3.ClassEnhancementBuilder(predefinedenhancementinfo3, signatureBuildingComponents.javaUtil("LinkedHashSet"));
        classEnhancementBuilder4.function("addFirst", "2.2", new Function1(strJavaLang) { // from class: kotlin.reflect.jvm.internal.impl.load.java.typeEnhancement.PredefinedEnhancementInfoKt$$Lambda$14
            private final String arg$0;

            {
                this.arg$0 = strJavaLang;
            }

            @Override // kotlin.jvm.functions.Function1
            public Object invoke(Object obj) {
                return predefinedEnhancementInfo.m3680x4f1e5fc6(this.arg$0, (predefinedEnhancementInfo3.ClassEnhancementBuilder.FunctionEnhancementBuilder) obj);
            }
        });
        classEnhancementBuilder4.function("addLast", "2.2", new Function1(strJavaLang) { // from class: kotlin.reflect.jvm.internal.impl.load.java.typeEnhancement.PredefinedEnhancementInfoKt$$Lambda$15
            private final String arg$0;

            {
                this.arg$0 = strJavaLang;
            }

            @Override // kotlin.jvm.functions.Function1
            public Object invoke(Object obj) {
                return predefinedEnhancementInfo.m3681x4f1e5fdc(this.arg$0, (predefinedEnhancementInfo3.ClassEnhancementBuilder.FunctionEnhancementBuilder) obj);
            }
        });
        classEnhancementBuilder4.function("removeFirst", "2.2", new Function1(strJavaLang) { // from class: kotlin.reflect.jvm.internal.impl.load.java.typeEnhancement.PredefinedEnhancementInfoKt$$Lambda$16
            private final String arg$0;

            {
                this.arg$0 = strJavaLang;
            }

            @Override // kotlin.jvm.functions.Function1
            public Object invoke(Object obj) {
                return predefinedEnhancementInfo.m3682x4f1e5fdd(this.arg$0, (predefinedEnhancementInfo3.ClassEnhancementBuilder.FunctionEnhancementBuilder) obj);
            }
        });
        classEnhancementBuilder4.function("removeLast", "2.2", new Function1(strJavaLang) { // from class: kotlin.reflect.jvm.internal.impl.load.java.typeEnhancement.PredefinedEnhancementInfoKt$$Lambda$17
            private final String arg$0;

            {
                this.arg$0 = strJavaLang;
            }

            @Override // kotlin.jvm.functions.Function1
            public Object invoke(Object obj) {
                return predefinedEnhancementInfo.m3683x4f1e5fde(this.arg$0, (predefinedEnhancementInfo3.ClassEnhancementBuilder.FunctionEnhancementBuilder) obj);
            }
        });
        classEnhancementBuilder4.function("getFirst", "2.2", new Function1(strJavaLang) { // from class: kotlin.reflect.jvm.internal.impl.load.java.typeEnhancement.PredefinedEnhancementInfoKt$$Lambda$18
            private final String arg$0;

            {
                this.arg$0 = strJavaLang;
            }

            @Override // kotlin.jvm.functions.Function1
            public Object invoke(Object obj) {
                return predefinedEnhancementInfo.m3684x4f1e5fdf(this.arg$0, (predefinedEnhancementInfo3.ClassEnhancementBuilder.FunctionEnhancementBuilder) obj);
            }
        });
        classEnhancementBuilder4.function("getLast", "2.2", new Function1(strJavaLang) { // from class: kotlin.reflect.jvm.internal.impl.load.java.typeEnhancement.PredefinedEnhancementInfoKt$$Lambda$19
            private final String arg$0;

            {
                this.arg$0 = strJavaLang;
            }

            @Override // kotlin.jvm.functions.Function1
            public Object invoke(Object obj) {
                return predefinedEnhancementInfo.m3685x4f1e5fe0(this.arg$0, (predefinedEnhancementInfo3.ClassEnhancementBuilder.FunctionEnhancementBuilder) obj);
            }
        });
        predefinedEnhancementInfo3.ClassEnhancementBuilder classEnhancementBuilder5 = new predefinedEnhancementInfo3.ClassEnhancementBuilder(predefinedenhancementinfo3, signatureBuildingComponents.javaUtil("Map"));
        predefinedEnhancementInfo3.ClassEnhancementBuilder.function$default(classEnhancementBuilder5, "forEach", null, new Function1(strJavaFunction5) { // from class: kotlin.reflect.jvm.internal.impl.load.java.typeEnhancement.PredefinedEnhancementInfoKt$$Lambda$20
            private final String arg$0;

            {
                this.arg$0 = strJavaFunction5;
            }

            @Override // kotlin.jvm.functions.Function1
            public Object invoke(Object obj) {
                return predefinedEnhancementInfo.m3687x56d00541(this.arg$0, (predefinedEnhancementInfo3.ClassEnhancementBuilder.FunctionEnhancementBuilder) obj);
            }
        }, 2, null);
        predefinedEnhancementInfo3.ClassEnhancementBuilder.function$default(classEnhancementBuilder5, "putIfAbsent", null, new Function1(strJavaLang) { // from class: kotlin.reflect.jvm.internal.impl.load.java.typeEnhancement.PredefinedEnhancementInfoKt$$Lambda$21
            private final String arg$0;

            {
                this.arg$0 = strJavaLang;
            }

            @Override // kotlin.jvm.functions.Function1
            public Object invoke(Object obj) {
                return predefinedEnhancementInfo.m3688x56d00542(this.arg$0, (predefinedEnhancementInfo3.ClassEnhancementBuilder.FunctionEnhancementBuilder) obj);
            }
        }, 2, null);
        predefinedEnhancementInfo3.ClassEnhancementBuilder.function$default(classEnhancementBuilder5, "replace", null, new Function1(strJavaLang) { // from class: kotlin.reflect.jvm.internal.impl.load.java.typeEnhancement.PredefinedEnhancementInfoKt$$Lambda$22
            private final String arg$0;

            {
                this.arg$0 = strJavaLang;
            }

            @Override // kotlin.jvm.functions.Function1
            public Object invoke(Object obj) {
                return predefinedEnhancementInfo.m3689x56d00543(this.arg$0, (predefinedEnhancementInfo3.ClassEnhancementBuilder.FunctionEnhancementBuilder) obj);
            }
        }, 2, null);
        predefinedEnhancementInfo3.ClassEnhancementBuilder.function$default(classEnhancementBuilder5, "replace", null, new Function1(strJavaLang) { // from class: kotlin.reflect.jvm.internal.impl.load.java.typeEnhancement.PredefinedEnhancementInfoKt$$Lambda$23
            private final String arg$0;

            {
                this.arg$0 = strJavaLang;
            }

            @Override // kotlin.jvm.functions.Function1
            public Object invoke(Object obj) {
                return predefinedEnhancementInfo.m3690x56d00544(this.arg$0, (predefinedEnhancementInfo3.ClassEnhancementBuilder.FunctionEnhancementBuilder) obj);
            }
        }, 2, null);
        predefinedEnhancementInfo3.ClassEnhancementBuilder.function$default(classEnhancementBuilder5, "replaceAll", null, new Function1(strJavaFunction4) { // from class: kotlin.reflect.jvm.internal.impl.load.java.typeEnhancement.PredefinedEnhancementInfoKt$$Lambda$24
            private final String arg$0;

            {
                this.arg$0 = strJavaFunction4;
            }

            @Override // kotlin.jvm.functions.Function1
            public Object invoke(Object obj) {
                return predefinedEnhancementInfo.m3691x56d0055a(this.arg$0, (predefinedEnhancementInfo3.ClassEnhancementBuilder.FunctionEnhancementBuilder) obj);
            }
        }, 2, null);
        predefinedEnhancementInfo3.ClassEnhancementBuilder.function$default(classEnhancementBuilder5, "compute", null, new Function1(strJavaLang, strJavaFunction4) { // from class: kotlin.reflect.jvm.internal.impl.load.java.typeEnhancement.PredefinedEnhancementInfoKt$$Lambda$25
            private final String arg$0;
            private final String arg$1;

            {
                this.arg$0 = strJavaLang;
                this.arg$1 = strJavaFunction4;
            }

            @Override // kotlin.jvm.functions.Function1
            public Object invoke(Object obj) {
                return predefinedEnhancementInfo.m3692x56d0055b(this.arg$0, this.arg$1, (predefinedEnhancementInfo3.ClassEnhancementBuilder.FunctionEnhancementBuilder) obj);
            }
        }, 2, null);
        predefinedEnhancementInfo3.ClassEnhancementBuilder.function$default(classEnhancementBuilder5, "computeIfAbsent", null, new Function1(strJavaLang, strJavaFunction2) { // from class: kotlin.reflect.jvm.internal.impl.load.java.typeEnhancement.PredefinedEnhancementInfoKt$$Lambda$26
            private final String arg$0;
            private final String arg$1;

            {
                this.arg$0 = strJavaLang;
                this.arg$1 = strJavaFunction2;
            }

            @Override // kotlin.jvm.functions.Function1
            public Object invoke(Object obj) {
                return predefinedEnhancementInfo.m3693x56d0055c(this.arg$0, this.arg$1, (predefinedEnhancementInfo3.ClassEnhancementBuilder.FunctionEnhancementBuilder) obj);
            }
        }, 2, null);
        predefinedEnhancementInfo3.ClassEnhancementBuilder.function$default(classEnhancementBuilder5, "computeIfPresent", null, new Function1(strJavaLang, strJavaFunction4) { // from class: kotlin.reflect.jvm.internal.impl.load.java.typeEnhancement.PredefinedEnhancementInfoKt$$Lambda$27
            private final String arg$0;
            private final String arg$1;

            {
                this.arg$0 = strJavaLang;
                this.arg$1 = strJavaFunction4;
            }

            @Override // kotlin.jvm.functions.Function1
            public Object invoke(Object obj) {
                return predefinedEnhancementInfo.m3694x56d0055d(this.arg$0, this.arg$1, (predefinedEnhancementInfo3.ClassEnhancementBuilder.FunctionEnhancementBuilder) obj);
            }
        }, 2, null);
        predefinedEnhancementInfo3.ClassEnhancementBuilder.function$default(classEnhancementBuilder5, "merge", null, new Function1(strJavaLang, strJavaFunction4) { // from class: kotlin.reflect.jvm.internal.impl.load.java.typeEnhancement.PredefinedEnhancementInfoKt$$Lambda$28
            private final String arg$0;
            private final String arg$1;

            {
                this.arg$0 = strJavaLang;
                this.arg$1 = strJavaFunction4;
            }

            @Override // kotlin.jvm.functions.Function1
            public Object invoke(Object obj) {
                return predefinedEnhancementInfo.m3695x56d0055e(this.arg$0, this.arg$1, (predefinedEnhancementInfo3.ClassEnhancementBuilder.FunctionEnhancementBuilder) obj);
            }
        }, 2, null);
        predefinedEnhancementInfo3.ClassEnhancementBuilder classEnhancementBuilder6 = new predefinedEnhancementInfo3.ClassEnhancementBuilder(predefinedenhancementinfo3, signatureBuildingComponents.javaUtil("LinkedHashMap"));
        classEnhancementBuilder6.function("putFirst", "2.2", new Function1(strJavaLang) { // from class: kotlin.reflect.jvm.internal.impl.load.java.typeEnhancement.PredefinedEnhancementInfoKt$$Lambda$29
            private final String arg$0;

            {
                this.arg$0 = strJavaLang;
            }

            @Override // kotlin.jvm.functions.Function1
            public Object invoke(Object obj) {
                return predefinedEnhancementInfo.m3696x157e1da3(this.arg$0, (predefinedEnhancementInfo3.ClassEnhancementBuilder.FunctionEnhancementBuilder) obj);
            }
        });
        classEnhancementBuilder6.function("putLast", "2.2", new Function1(strJavaLang) { // from class: kotlin.reflect.jvm.internal.impl.load.java.typeEnhancement.PredefinedEnhancementInfoKt$$Lambda$30
            private final String arg$0;

            {
                this.arg$0 = strJavaLang;
            }

            @Override // kotlin.jvm.functions.Function1
            public Object invoke(Object obj) {
                return predefinedEnhancementInfo.m3697x157e1da4(this.arg$0, (predefinedEnhancementInfo3.ClassEnhancementBuilder.FunctionEnhancementBuilder) obj);
            }
        });
        predefinedEnhancementInfo3.ClassEnhancementBuilder classEnhancementBuilder7 = new predefinedEnhancementInfo3.ClassEnhancementBuilder(predefinedenhancementinfo3, strJavaUtil2);
        predefinedEnhancementInfo3.ClassEnhancementBuilder.function$default(classEnhancementBuilder7, "empty", null, new Function1(strJavaUtil2) { // from class: kotlin.reflect.jvm.internal.impl.load.java.typeEnhancement.PredefinedEnhancementInfoKt$$Lambda$31
            private final String arg$0;

            {
                this.arg$0 = strJavaUtil2;
            }

            @Override // kotlin.jvm.functions.Function1
            public Object invoke(Object obj) {
                return predefinedEnhancementInfo.m3698xc99cf801(this.arg$0, (predefinedEnhancementInfo3.ClassEnhancementBuilder.FunctionEnhancementBuilder) obj);
            }
        }, 2, null);
        predefinedEnhancementInfo3.ClassEnhancementBuilder.function$default(classEnhancementBuilder7, "of", null, new Function1(strJavaLang, strJavaUtil2) { // from class: kotlin.reflect.jvm.internal.impl.load.java.typeEnhancement.PredefinedEnhancementInfoKt$$Lambda$32
            private final String arg$0;
            private final String arg$1;

            {
                this.arg$0 = strJavaLang;
                this.arg$1 = strJavaUtil2;
            }

            @Override // kotlin.jvm.functions.Function1
            public Object invoke(Object obj) {
                return predefinedEnhancementInfo.m3699xc99cf817(this.arg$0, this.arg$1, (predefinedEnhancementInfo3.ClassEnhancementBuilder.FunctionEnhancementBuilder) obj);
            }
        }, 2, null);
        predefinedEnhancementInfo3.ClassEnhancementBuilder.function$default(classEnhancementBuilder7, "ofNullable", null, new Function1(strJavaLang, strJavaUtil2) { // from class: kotlin.reflect.jvm.internal.impl.load.java.typeEnhancement.PredefinedEnhancementInfoKt$$Lambda$33
            private final String arg$0;
            private final String arg$1;

            {
                this.arg$0 = strJavaLang;
                this.arg$1 = strJavaUtil2;
            }

            @Override // kotlin.jvm.functions.Function1
            public Object invoke(Object obj) {
                return predefinedEnhancementInfo.m3700xc99cf818(this.arg$0, this.arg$1, (predefinedEnhancementInfo3.ClassEnhancementBuilder.FunctionEnhancementBuilder) obj);
            }
        }, 2, null);
        predefinedEnhancementInfo3.ClassEnhancementBuilder.function$default(classEnhancementBuilder7, "get", null, new Function1(strJavaLang) { // from class: kotlin.reflect.jvm.internal.impl.load.java.typeEnhancement.PredefinedEnhancementInfoKt$$Lambda$34
            private final String arg$0;

            {
                this.arg$0 = strJavaLang;
            }

            @Override // kotlin.jvm.functions.Function1
            public Object invoke(Object obj) {
                return predefinedEnhancementInfo.m3701xc99cf819(this.arg$0, (predefinedEnhancementInfo3.ClassEnhancementBuilder.FunctionEnhancementBuilder) obj);
            }
        }, 2, null);
        predefinedEnhancementInfo3.ClassEnhancementBuilder.function$default(classEnhancementBuilder7, "ifPresent", null, new Function1(strJavaFunction3) { // from class: kotlin.reflect.jvm.internal.impl.load.java.typeEnhancement.PredefinedEnhancementInfoKt$$Lambda$35
            private final String arg$0;

            {
                this.arg$0 = strJavaFunction3;
            }

            @Override // kotlin.jvm.functions.Function1
            public Object invoke(Object obj) {
                return predefinedEnhancementInfo.m3702xc99cf81a(this.arg$0, (predefinedEnhancementInfo3.ClassEnhancementBuilder.FunctionEnhancementBuilder) obj);
            }
        }, 2, null);
        predefinedEnhancementInfo3.ClassEnhancementBuilder.function$default(new predefinedEnhancementInfo3.ClassEnhancementBuilder(predefinedenhancementinfo3, signatureBuildingComponents.javaLang("ref/Reference")), "get", null, new Function1(strJavaLang) { // from class: kotlin.reflect.jvm.internal.impl.load.java.typeEnhancement.PredefinedEnhancementInfoKt$$Lambda$36
            private final String arg$0;

            {
                this.arg$0 = strJavaLang;
            }

            @Override // kotlin.jvm.functions.Function1
            public Object invoke(Object obj) {
                return predefinedEnhancementInfo.m3703xf3665d9e(this.arg$0, (predefinedEnhancementInfo3.ClassEnhancementBuilder.FunctionEnhancementBuilder) obj);
            }
        }, 2, null);
        predefinedEnhancementInfo3.ClassEnhancementBuilder.function$default(new predefinedEnhancementInfo3.ClassEnhancementBuilder(predefinedenhancementinfo3, strJavaFunction), "test", null, new Function1(strJavaLang) { // from class: kotlin.reflect.jvm.internal.impl.load.java.typeEnhancement.PredefinedEnhancementInfoKt$$Lambda$37
            private final String arg$0;

            {
                this.arg$0 = strJavaLang;
            }

            @Override // kotlin.jvm.functions.Function1
            public Object invoke(Object obj) {
                return predefinedEnhancementInfo.m3704x1d2fc322(this.arg$0, (predefinedEnhancementInfo3.ClassEnhancementBuilder.FunctionEnhancementBuilder) obj);
            }
        }, 2, null);
        predefinedEnhancementInfo3.ClassEnhancementBuilder.function$default(new predefinedEnhancementInfo3.ClassEnhancementBuilder(predefinedenhancementinfo3, signatureBuildingComponents.javaFunction("BiPredicate")), "test", null, new Function1(strJavaLang) { // from class: kotlin.reflect.jvm.internal.impl.load.java.typeEnhancement.PredefinedEnhancementInfoKt$$Lambda$38
            private final String arg$0;

            {
                this.arg$0 = strJavaLang;
            }

            @Override // kotlin.jvm.functions.Function1
            public Object invoke(Object obj) {
                return predefinedEnhancementInfo.m3705x7dbbd27b(this.arg$0, (predefinedEnhancementInfo3.ClassEnhancementBuilder.FunctionEnhancementBuilder) obj);
            }
        }, 2, null);
        predefinedEnhancementInfo3.ClassEnhancementBuilder.function$default(new predefinedEnhancementInfo3.ClassEnhancementBuilder(predefinedenhancementinfo3, strJavaFunction3), "accept", null, new Function1(strJavaLang) { // from class: kotlin.reflect.jvm.internal.impl.load.java.typeEnhancement.PredefinedEnhancementInfoKt$$Lambda$39
            private final String arg$0;

            {
                this.arg$0 = strJavaLang;
            }

            @Override // kotlin.jvm.functions.Function1
            public Object invoke(Object obj) {
                return predefinedEnhancementInfo.m3706xa7853814(this.arg$0, (predefinedEnhancementInfo3.ClassEnhancementBuilder.FunctionEnhancementBuilder) obj);
            }
        }, 2, null);
        predefinedEnhancementInfo3.ClassEnhancementBuilder.function$default(new predefinedEnhancementInfo3.ClassEnhancementBuilder(predefinedenhancementinfo3, strJavaFunction5), "accept", null, new Function1(strJavaLang) { // from class: kotlin.reflect.jvm.internal.impl.load.java.typeEnhancement.PredefinedEnhancementInfoKt$$Lambda$40
            private final String arg$0;

            {
                this.arg$0 = strJavaLang;
            }

            @Override // kotlin.jvm.functions.Function1
            public Object invoke(Object obj) {
                return predefinedEnhancementInfo.m3707xd14e9d98(this.arg$0, (predefinedEnhancementInfo3.ClassEnhancementBuilder.FunctionEnhancementBuilder) obj);
            }
        }, 2, null);
        predefinedEnhancementInfo3.ClassEnhancementBuilder.function$default(new predefinedEnhancementInfo3.ClassEnhancementBuilder(predefinedenhancementinfo3, strJavaFunction2), "apply", null, new Function1(strJavaLang) { // from class: kotlin.reflect.jvm.internal.impl.load.java.typeEnhancement.PredefinedEnhancementInfoKt$$Lambda$41
            private final String arg$0;

            {
                this.arg$0 = strJavaLang;
            }

            @Override // kotlin.jvm.functions.Function1
            public Object invoke(Object obj) {
                return predefinedEnhancementInfo.m3708xfb18031c(this.arg$0, (predefinedEnhancementInfo3.ClassEnhancementBuilder.FunctionEnhancementBuilder) obj);
            }
        }, 2, null);
        predefinedEnhancementInfo3.ClassEnhancementBuilder.function$default(new predefinedEnhancementInfo3.ClassEnhancementBuilder(predefinedenhancementinfo3, strJavaFunction4), "apply", null, new Function1(strJavaLang) { // from class: kotlin.reflect.jvm.internal.impl.load.java.typeEnhancement.PredefinedEnhancementInfoKt$$Lambda$42
            private final String arg$0;

            {
                this.arg$0 = strJavaLang;
            }

            @Override // kotlin.jvm.functions.Function1
            public Object invoke(Object obj) {
                return predefinedEnhancementInfo.m3709x24e168a0(this.arg$0, (predefinedEnhancementInfo3.ClassEnhancementBuilder.FunctionEnhancementBuilder) obj);
            }
        }, 2, null);
        predefinedEnhancementInfo3.ClassEnhancementBuilder.function$default(new predefinedEnhancementInfo3.ClassEnhancementBuilder(predefinedenhancementinfo3, signatureBuildingComponents.javaFunction("Supplier")), "get", null, new Function1(strJavaLang) { // from class: kotlin.reflect.jvm.internal.impl.load.java.typeEnhancement.PredefinedEnhancementInfoKt$$Lambda$43
            private final String arg$0;

            {
                this.arg$0 = strJavaLang;
            }

            @Override // kotlin.jvm.functions.Function1
            public Object invoke(Object obj) {
                return predefinedEnhancementInfo.m3710x856d77f9(this.arg$0, (predefinedEnhancementInfo3.ClassEnhancementBuilder.FunctionEnhancementBuilder) obj);
            }
        }, 2, null);
        PREDEFINED_FUNCTION_ENHANCEMENT_INFO_BY_SIGNATURE = predefinedenhancementinfo3.build();
    }

    public static final Map<String, predefinedEnhancementInfo2> getPREDEFINED_FUNCTION_ENHANCEMENT_INFO_BY_SIGNATURE() {
        return PREDEFINED_FUNCTION_ENHANCEMENT_INFO_BY_SIGNATURE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: PREDEFINED_FUNCTION_ENHANCEMENT_INFO_BY_SIGNATURE$lambda$62$lambda$61$lambda$1$lambda$0 */
    public static final Unit m3670x57ff66e8(String str, predefinedEnhancementInfo3.ClassEnhancementBuilder.FunctionEnhancementBuilder function) {
        Intrinsics.checkNotNullParameter(function, "$this$function");
        typeQualifiers typequalifiers = NOT_PLATFORM;
        function.parameter(str, typequalifiers, typequalifiers);
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: PREDEFINED_FUNCTION_ENHANCEMENT_INFO_BY_SIGNATURE$lambda$62$lambda$61$lambda$3$lambda$2 */
    public static final Unit m3686x40924928(SignatureBuildingComponents signatureBuildingComponents, predefinedEnhancementInfo3.ClassEnhancementBuilder.FunctionEnhancementBuilder function) {
        Intrinsics.checkNotNullParameter(function, "$this$function");
        String strJavaUtil = signatureBuildingComponents.javaUtil("Spliterator");
        typeQualifiers typequalifiers = NOT_PLATFORM;
        function.returns(strJavaUtil, typequalifiers, typequalifiers);
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: PREDEFINED_FUNCTION_ENHANCEMENT_INFO_BY_SIGNATURE$lambda$62$lambda$61$lambda$7$lambda$4 */
    public static final Unit m3711x11b80da6(String str, predefinedEnhancementInfo3.ClassEnhancementBuilder.FunctionEnhancementBuilder function) {
        Intrinsics.checkNotNullParameter(function, "$this$function");
        typeQualifiers typequalifiers = NOT_PLATFORM;
        function.parameter(str, typequalifiers, typequalifiers);
        function.returns(JvmPrimitiveType.BOOLEAN);
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: PREDEFINED_FUNCTION_ENHANCEMENT_INFO_BY_SIGNATURE$lambda$62$lambda$61$lambda$7$lambda$5 */
    public static final Unit m3712x11b80da7(String str, predefinedEnhancementInfo3.ClassEnhancementBuilder.FunctionEnhancementBuilder function) {
        Intrinsics.checkNotNullParameter(function, "$this$function");
        typeQualifiers typequalifiers = NOT_PLATFORM;
        function.returns(str, typequalifiers, typequalifiers);
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: PREDEFINED_FUNCTION_ENHANCEMENT_INFO_BY_SIGNATURE$lambda$62$lambda$61$lambda$7$lambda$6 */
    public static final Unit m3713x11b80da8(String str, predefinedEnhancementInfo3.ClassEnhancementBuilder.FunctionEnhancementBuilder function) {
        Intrinsics.checkNotNullParameter(function, "$this$function");
        typeQualifiers typequalifiers = NOT_PLATFORM;
        function.returns(str, typequalifiers, typequalifiers);
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: PREDEFINED_FUNCTION_ENHANCEMENT_INFO_BY_SIGNATURE$lambda$62$lambda$61$lambda$13$lambda$8 */
    public static final Unit m3674x538965db(String str, predefinedEnhancementInfo3.ClassEnhancementBuilder.FunctionEnhancementBuilder function) {
        Intrinsics.checkNotNullParameter(function, "$this$function");
        typeQualifiers typequalifiers = NOT_PLATFORM;
        function.parameter(str, typequalifiers, typequalifiers);
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: PREDEFINED_FUNCTION_ENHANCEMENT_INFO_BY_SIGNATURE$lambda$62$lambda$61$lambda$13$lambda$9 */
    public static final Unit m3675x538965dc(String str, predefinedEnhancementInfo3.ClassEnhancementBuilder.FunctionEnhancementBuilder function) {
        Intrinsics.checkNotNullParameter(function, "$this$function");
        function.parameter(str, NOT_PLATFORM);
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: PREDEFINED_FUNCTION_ENHANCEMENT_INFO_BY_SIGNATURE$lambda$62$lambda$61$lambda$13$lambda$10 */
    public static final Unit m3671x1da354dc(String str, predefinedEnhancementInfo3.ClassEnhancementBuilder.FunctionEnhancementBuilder function) {
        Intrinsics.checkNotNullParameter(function, "$this$function");
        function.parameter(str, NOT_PLATFORM);
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: PREDEFINED_FUNCTION_ENHANCEMENT_INFO_BY_SIGNATURE$lambda$62$lambda$61$lambda$13$lambda$11 */
    public static final Unit m3672x1da354dd(String str, predefinedEnhancementInfo3.ClassEnhancementBuilder.FunctionEnhancementBuilder function) {
        Intrinsics.checkNotNullParameter(function, "$this$function");
        function.returns(str, NOT_PLATFORM);
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: PREDEFINED_FUNCTION_ENHANCEMENT_INFO_BY_SIGNATURE$lambda$62$lambda$61$lambda$13$lambda$12 */
    public static final Unit m3673x1da354de(String str, predefinedEnhancementInfo3.ClassEnhancementBuilder.FunctionEnhancementBuilder function) {
        Intrinsics.checkNotNullParameter(function, "$this$function");
        function.returns(str, NOT_PLATFORM);
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: PREDEFINED_FUNCTION_ENHANCEMENT_INFO_BY_SIGNATURE$lambda$62$lambda$61$lambda$18$lambda$14 */
    public static final Unit m3676x61ad2a5(String str, predefinedEnhancementInfo3.ClassEnhancementBuilder.FunctionEnhancementBuilder function) {
        Intrinsics.checkNotNullParameter(function, "$this$function");
        function.parameter(str, NOT_PLATFORM);
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: PREDEFINED_FUNCTION_ENHANCEMENT_INFO_BY_SIGNATURE$lambda$62$lambda$61$lambda$18$lambda$15 */
    public static final Unit m3677x61ad2a6(String str, predefinedEnhancementInfo3.ClassEnhancementBuilder.FunctionEnhancementBuilder function) {
        Intrinsics.checkNotNullParameter(function, "$this$function");
        function.parameter(str, NOT_PLATFORM);
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: PREDEFINED_FUNCTION_ENHANCEMENT_INFO_BY_SIGNATURE$lambda$62$lambda$61$lambda$18$lambda$16 */
    public static final Unit m3678x61ad2a7(String str, predefinedEnhancementInfo3.ClassEnhancementBuilder.FunctionEnhancementBuilder function) {
        Intrinsics.checkNotNullParameter(function, "$this$function");
        function.returns(str, NOT_PLATFORM);
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: PREDEFINED_FUNCTION_ENHANCEMENT_INFO_BY_SIGNATURE$lambda$62$lambda$61$lambda$18$lambda$17 */
    public static final Unit m3679x61ad2a8(String str, predefinedEnhancementInfo3.ClassEnhancementBuilder.FunctionEnhancementBuilder function) {
        Intrinsics.checkNotNullParameter(function, "$this$function");
        function.returns(str, NOT_PLATFORM);
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: PREDEFINED_FUNCTION_ENHANCEMENT_INFO_BY_SIGNATURE$lambda$62$lambda$61$lambda$25$lambda$19 */
    public static final Unit m3680x4f1e5fc6(String str, predefinedEnhancementInfo3.ClassEnhancementBuilder.FunctionEnhancementBuilder function) {
        Intrinsics.checkNotNullParameter(function, "$this$function");
        function.parameter(str, NOT_PLATFORM);
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: PREDEFINED_FUNCTION_ENHANCEMENT_INFO_BY_SIGNATURE$lambda$62$lambda$61$lambda$25$lambda$20 */
    public static final Unit m3681x4f1e5fdc(String str, predefinedEnhancementInfo3.ClassEnhancementBuilder.FunctionEnhancementBuilder function) {
        Intrinsics.checkNotNullParameter(function, "$this$function");
        function.parameter(str, NOT_PLATFORM);
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: PREDEFINED_FUNCTION_ENHANCEMENT_INFO_BY_SIGNATURE$lambda$62$lambda$61$lambda$25$lambda$21 */
    public static final Unit m3682x4f1e5fdd(String str, predefinedEnhancementInfo3.ClassEnhancementBuilder.FunctionEnhancementBuilder function) {
        Intrinsics.checkNotNullParameter(function, "$this$function");
        function.returns(str, NOT_PLATFORM);
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: PREDEFINED_FUNCTION_ENHANCEMENT_INFO_BY_SIGNATURE$lambda$62$lambda$61$lambda$25$lambda$22 */
    public static final Unit m3683x4f1e5fde(String str, predefinedEnhancementInfo3.ClassEnhancementBuilder.FunctionEnhancementBuilder function) {
        Intrinsics.checkNotNullParameter(function, "$this$function");
        function.returns(str, NOT_PLATFORM);
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: PREDEFINED_FUNCTION_ENHANCEMENT_INFO_BY_SIGNATURE$lambda$62$lambda$61$lambda$25$lambda$23 */
    public static final Unit m3684x4f1e5fdf(String str, predefinedEnhancementInfo3.ClassEnhancementBuilder.FunctionEnhancementBuilder function) {
        Intrinsics.checkNotNullParameter(function, "$this$function");
        function.returns(str, NOT_PLATFORM);
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: PREDEFINED_FUNCTION_ENHANCEMENT_INFO_BY_SIGNATURE$lambda$62$lambda$61$lambda$25$lambda$24 */
    public static final Unit m3685x4f1e5fe0(String str, predefinedEnhancementInfo3.ClassEnhancementBuilder.FunctionEnhancementBuilder function) {
        Intrinsics.checkNotNullParameter(function, "$this$function");
        function.returns(str, NOT_PLATFORM);
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: PREDEFINED_FUNCTION_ENHANCEMENT_INFO_BY_SIGNATURE$lambda$62$lambda$61$lambda$35$lambda$26 */
    public static final Unit m3687x56d00541(String str, predefinedEnhancementInfo3.ClassEnhancementBuilder.FunctionEnhancementBuilder function) {
        Intrinsics.checkNotNullParameter(function, "$this$function");
        typeQualifiers typequalifiers = NOT_PLATFORM;
        function.parameter(str, typequalifiers, typequalifiers, typequalifiers);
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: PREDEFINED_FUNCTION_ENHANCEMENT_INFO_BY_SIGNATURE$lambda$62$lambda$61$lambda$35$lambda$27 */
    public static final Unit m3688x56d00542(String str, predefinedEnhancementInfo3.ClassEnhancementBuilder.FunctionEnhancementBuilder function) {
        Intrinsics.checkNotNullParameter(function, "$this$function");
        typeQualifiers typequalifiers = NOT_PLATFORM;
        function.parameter(str, typequalifiers);
        function.parameter(str, typequalifiers);
        function.returns(str, NULLABLE);
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: PREDEFINED_FUNCTION_ENHANCEMENT_INFO_BY_SIGNATURE$lambda$62$lambda$61$lambda$35$lambda$28 */
    public static final Unit m3689x56d00543(String str, predefinedEnhancementInfo3.ClassEnhancementBuilder.FunctionEnhancementBuilder function) {
        Intrinsics.checkNotNullParameter(function, "$this$function");
        typeQualifiers typequalifiers = NOT_PLATFORM;
        function.parameter(str, typequalifiers);
        function.parameter(str, typequalifiers);
        function.returns(str, NULLABLE);
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: PREDEFINED_FUNCTION_ENHANCEMENT_INFO_BY_SIGNATURE$lambda$62$lambda$61$lambda$35$lambda$29 */
    public static final Unit m3690x56d00544(String str, predefinedEnhancementInfo3.ClassEnhancementBuilder.FunctionEnhancementBuilder function) {
        Intrinsics.checkNotNullParameter(function, "$this$function");
        typeQualifiers typequalifiers = NOT_PLATFORM;
        function.parameter(str, typequalifiers);
        function.parameter(str, typequalifiers);
        function.parameter(str, typequalifiers);
        function.returns(JvmPrimitiveType.BOOLEAN);
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: PREDEFINED_FUNCTION_ENHANCEMENT_INFO_BY_SIGNATURE$lambda$62$lambda$61$lambda$35$lambda$30 */
    public static final Unit m3691x56d0055a(String str, predefinedEnhancementInfo3.ClassEnhancementBuilder.FunctionEnhancementBuilder function) {
        Intrinsics.checkNotNullParameter(function, "$this$function");
        typeQualifiers typequalifiers = NOT_PLATFORM;
        function.parameter(str, typequalifiers, typequalifiers, typequalifiers, typequalifiers);
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: PREDEFINED_FUNCTION_ENHANCEMENT_INFO_BY_SIGNATURE$lambda$62$lambda$61$lambda$35$lambda$31 */
    public static final Unit m3692x56d0055b(String str, String str2, predefinedEnhancementInfo3.ClassEnhancementBuilder.FunctionEnhancementBuilder function) {
        Intrinsics.checkNotNullParameter(function, "$this$function");
        typeQualifiers typequalifiers = NOT_PLATFORM;
        function.parameter(str, typequalifiers);
        typeQualifiers typequalifiers2 = NULLABLE;
        function.parameter(str2, typequalifiers, typequalifiers, typequalifiers2, typequalifiers2);
        function.returns(str, typequalifiers2);
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: PREDEFINED_FUNCTION_ENHANCEMENT_INFO_BY_SIGNATURE$lambda$62$lambda$61$lambda$35$lambda$32 */
    public static final Unit m3693x56d0055c(String str, String str2, predefinedEnhancementInfo3.ClassEnhancementBuilder.FunctionEnhancementBuilder function) {
        Intrinsics.checkNotNullParameter(function, "$this$function");
        typeQualifiers typequalifiers = NOT_PLATFORM;
        function.parameter(str, typequalifiers);
        function.parameter(str2, typequalifiers, typequalifiers, typequalifiers);
        function.returns(str, typequalifiers);
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: PREDEFINED_FUNCTION_ENHANCEMENT_INFO_BY_SIGNATURE$lambda$62$lambda$61$lambda$35$lambda$33 */
    public static final Unit m3694x56d0055d(String str, String str2, predefinedEnhancementInfo3.ClassEnhancementBuilder.FunctionEnhancementBuilder function) {
        Intrinsics.checkNotNullParameter(function, "$this$function");
        typeQualifiers typequalifiers = NOT_PLATFORM;
        function.parameter(str, typequalifiers);
        typeQualifiers typequalifiers2 = NOT_NULLABLE;
        typeQualifiers typequalifiers3 = NULLABLE;
        function.parameter(str2, typequalifiers, typequalifiers, typequalifiers2, typequalifiers3);
        function.returns(str, typequalifiers3);
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: PREDEFINED_FUNCTION_ENHANCEMENT_INFO_BY_SIGNATURE$lambda$62$lambda$61$lambda$35$lambda$34 */
    public static final Unit m3695x56d0055e(String str, String str2, predefinedEnhancementInfo3.ClassEnhancementBuilder.FunctionEnhancementBuilder function) {
        Intrinsics.checkNotNullParameter(function, "$this$function");
        typeQualifiers typequalifiers = NOT_PLATFORM;
        function.parameter(str, typequalifiers);
        typeQualifiers typequalifiers2 = NOT_NULLABLE;
        function.parameter(str, typequalifiers2);
        typeQualifiers typequalifiers3 = NULLABLE;
        function.parameter(str2, typequalifiers, typequalifiers2, typequalifiers2, typequalifiers3);
        function.returns(str, typequalifiers3);
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: PREDEFINED_FUNCTION_ENHANCEMENT_INFO_BY_SIGNATURE$lambda$62$lambda$61$lambda$38$lambda$36 */
    public static final Unit m3696x157e1da3(String str, predefinedEnhancementInfo3.ClassEnhancementBuilder.FunctionEnhancementBuilder function) {
        Intrinsics.checkNotNullParameter(function, "$this$function");
        typeQualifiers typequalifiers = NOT_PLATFORM;
        function.parameter(str, typequalifiers);
        function.parameter(str, typequalifiers);
        function.returns(str, NULLABLE);
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: PREDEFINED_FUNCTION_ENHANCEMENT_INFO_BY_SIGNATURE$lambda$62$lambda$61$lambda$38$lambda$37 */
    public static final Unit m3697x157e1da4(String str, predefinedEnhancementInfo3.ClassEnhancementBuilder.FunctionEnhancementBuilder function) {
        Intrinsics.checkNotNullParameter(function, "$this$function");
        typeQualifiers typequalifiers = NOT_PLATFORM;
        function.parameter(str, typequalifiers);
        function.parameter(str, typequalifiers);
        function.returns(str, NULLABLE);
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: PREDEFINED_FUNCTION_ENHANCEMENT_INFO_BY_SIGNATURE$lambda$62$lambda$61$lambda$44$lambda$39 */
    public static final Unit m3698xc99cf801(String str, predefinedEnhancementInfo3.ClassEnhancementBuilder.FunctionEnhancementBuilder function) {
        Intrinsics.checkNotNullParameter(function, "$this$function");
        function.returns(str, NOT_PLATFORM, NOT_NULLABLE);
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: PREDEFINED_FUNCTION_ENHANCEMENT_INFO_BY_SIGNATURE$lambda$62$lambda$61$lambda$44$lambda$40 */
    public static final Unit m3699xc99cf817(String str, String str2, predefinedEnhancementInfo3.ClassEnhancementBuilder.FunctionEnhancementBuilder function) {
        Intrinsics.checkNotNullParameter(function, "$this$function");
        typeQualifiers typequalifiers = NOT_NULLABLE;
        function.parameter(str, typequalifiers);
        function.returns(str2, NOT_PLATFORM, typequalifiers);
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: PREDEFINED_FUNCTION_ENHANCEMENT_INFO_BY_SIGNATURE$lambda$62$lambda$61$lambda$44$lambda$41 */
    public static final Unit m3700xc99cf818(String str, String str2, predefinedEnhancementInfo3.ClassEnhancementBuilder.FunctionEnhancementBuilder function) {
        Intrinsics.checkNotNullParameter(function, "$this$function");
        function.parameter(str, NULLABLE);
        function.returns(str2, NOT_PLATFORM, NOT_NULLABLE);
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: PREDEFINED_FUNCTION_ENHANCEMENT_INFO_BY_SIGNATURE$lambda$62$lambda$61$lambda$44$lambda$42 */
    public static final Unit m3701xc99cf819(String str, predefinedEnhancementInfo3.ClassEnhancementBuilder.FunctionEnhancementBuilder function) {
        Intrinsics.checkNotNullParameter(function, "$this$function");
        function.returns(str, NOT_NULLABLE);
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: PREDEFINED_FUNCTION_ENHANCEMENT_INFO_BY_SIGNATURE$lambda$62$lambda$61$lambda$44$lambda$43 */
    public static final Unit m3702xc99cf81a(String str, predefinedEnhancementInfo3.ClassEnhancementBuilder.FunctionEnhancementBuilder function) {
        Intrinsics.checkNotNullParameter(function, "$this$function");
        function.parameter(str, NOT_PLATFORM, NOT_NULLABLE);
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: PREDEFINED_FUNCTION_ENHANCEMENT_INFO_BY_SIGNATURE$lambda$62$lambda$61$lambda$46$lambda$45 */
    public static final Unit m3703xf3665d9e(String str, predefinedEnhancementInfo3.ClassEnhancementBuilder.FunctionEnhancementBuilder function) {
        Intrinsics.checkNotNullParameter(function, "$this$function");
        function.returns(str, NULLABLE);
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: PREDEFINED_FUNCTION_ENHANCEMENT_INFO_BY_SIGNATURE$lambda$62$lambda$61$lambda$48$lambda$47 */
    public static final Unit m3704x1d2fc322(String str, predefinedEnhancementInfo3.ClassEnhancementBuilder.FunctionEnhancementBuilder function) {
        Intrinsics.checkNotNullParameter(function, "$this$function");
        function.parameter(str, NOT_PLATFORM);
        function.returns(JvmPrimitiveType.BOOLEAN);
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: PREDEFINED_FUNCTION_ENHANCEMENT_INFO_BY_SIGNATURE$lambda$62$lambda$61$lambda$50$lambda$49 */
    public static final Unit m3705x7dbbd27b(String str, predefinedEnhancementInfo3.ClassEnhancementBuilder.FunctionEnhancementBuilder function) {
        Intrinsics.checkNotNullParameter(function, "$this$function");
        typeQualifiers typequalifiers = NOT_PLATFORM;
        function.parameter(str, typequalifiers);
        function.parameter(str, typequalifiers);
        function.returns(JvmPrimitiveType.BOOLEAN);
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: PREDEFINED_FUNCTION_ENHANCEMENT_INFO_BY_SIGNATURE$lambda$62$lambda$61$lambda$52$lambda$51 */
    public static final Unit m3706xa7853814(String str, predefinedEnhancementInfo3.ClassEnhancementBuilder.FunctionEnhancementBuilder function) {
        Intrinsics.checkNotNullParameter(function, "$this$function");
        function.parameter(str, NOT_PLATFORM);
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: PREDEFINED_FUNCTION_ENHANCEMENT_INFO_BY_SIGNATURE$lambda$62$lambda$61$lambda$54$lambda$53 */
    public static final Unit m3707xd14e9d98(String str, predefinedEnhancementInfo3.ClassEnhancementBuilder.FunctionEnhancementBuilder function) {
        Intrinsics.checkNotNullParameter(function, "$this$function");
        typeQualifiers typequalifiers = NOT_PLATFORM;
        function.parameter(str, typequalifiers);
        function.parameter(str, typequalifiers);
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: PREDEFINED_FUNCTION_ENHANCEMENT_INFO_BY_SIGNATURE$lambda$62$lambda$61$lambda$56$lambda$55 */
    public static final Unit m3708xfb18031c(String str, predefinedEnhancementInfo3.ClassEnhancementBuilder.FunctionEnhancementBuilder function) {
        Intrinsics.checkNotNullParameter(function, "$this$function");
        typeQualifiers typequalifiers = NOT_PLATFORM;
        function.parameter(str, typequalifiers);
        function.returns(str, typequalifiers);
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: PREDEFINED_FUNCTION_ENHANCEMENT_INFO_BY_SIGNATURE$lambda$62$lambda$61$lambda$58$lambda$57 */
    public static final Unit m3709x24e168a0(String str, predefinedEnhancementInfo3.ClassEnhancementBuilder.FunctionEnhancementBuilder function) {
        Intrinsics.checkNotNullParameter(function, "$this$function");
        typeQualifiers typequalifiers = NOT_PLATFORM;
        function.parameter(str, typequalifiers);
        function.parameter(str, typequalifiers);
        function.returns(str, typequalifiers);
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: PREDEFINED_FUNCTION_ENHANCEMENT_INFO_BY_SIGNATURE$lambda$62$lambda$61$lambda$60$lambda$59 */
    public static final Unit m3710x856d77f9(String str, predefinedEnhancementInfo3.ClassEnhancementBuilder.FunctionEnhancementBuilder function) {
        Intrinsics.checkNotNullParameter(function, "$this$function");
        function.returns(str, NOT_PLATFORM);
        return Unit.INSTANCE;
    }
}
