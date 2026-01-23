package kotlin.reflect.jvm.internal.impl.load.kotlin;

import kotlin.NoWhenBranchMatchedException;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlin.reflect.jvm.internal.impl.builtins.PrimitiveType;
import kotlin.reflect.jvm.internal.impl.load.kotlin.methodSignatureMapping;
import kotlin.reflect.jvm.internal.impl.resolve.jvm.JvmClassName;
import kotlin.reflect.jvm.internal.impl.resolve.jvm.JvmPrimitiveType;
import kotlin.text.StringsKt;
import org.bouncycastle.pqc.math.linearalgebra.Matrix;

/* compiled from: methodSignatureMapping.kt */
@SourceDebugExtension
/* renamed from: kotlin.reflect.jvm.internal.impl.load.kotlin.JvmTypeFactoryImpl, reason: use source file name */
/* loaded from: classes14.dex */
final class methodSignatureMapping2 implements typeSignatureMapping2<methodSignatureMapping> {
    public static final methodSignatureMapping2 INSTANCE = new methodSignatureMapping2();

    /* compiled from: methodSignatureMapping.kt */
    /* renamed from: kotlin.reflect.jvm.internal.impl.load.kotlin.JvmTypeFactoryImpl$WhenMappings */
    public /* synthetic */ class WhenMappings {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;

        static {
            int[] iArr = new int[PrimitiveType.values().length];
            try {
                iArr[PrimitiveType.BOOLEAN.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[PrimitiveType.CHAR.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[PrimitiveType.BYTE.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                iArr[PrimitiveType.SHORT.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                iArr[PrimitiveType.INT.ordinal()] = 5;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                iArr[PrimitiveType.FLOAT.ordinal()] = 6;
            } catch (NoSuchFieldError unused6) {
            }
            try {
                iArr[PrimitiveType.LONG.ordinal()] = 7;
            } catch (NoSuchFieldError unused7) {
            }
            try {
                iArr[PrimitiveType.DOUBLE.ordinal()] = 8;
            } catch (NoSuchFieldError unused8) {
            }
            $EnumSwitchMapping$0 = iArr;
        }
    }

    private methodSignatureMapping2() {
    }

    @Override // kotlin.reflect.jvm.internal.impl.load.kotlin.typeSignatureMapping2
    public methodSignatureMapping boxType(methodSignatureMapping possiblyPrimitiveType) {
        Intrinsics.checkNotNullParameter(possiblyPrimitiveType, "possiblyPrimitiveType");
        if (!(possiblyPrimitiveType instanceof methodSignatureMapping.Primitive)) {
            return possiblyPrimitiveType;
        }
        methodSignatureMapping.Primitive primitive = (methodSignatureMapping.Primitive) possiblyPrimitiveType;
        if (primitive.getJvmPrimitiveType() == null) {
            return possiblyPrimitiveType;
        }
        String internalName = JvmClassName.byFqNameWithoutInnerClasses(primitive.getJvmPrimitiveType().getWrapperFqName()).getInternalName();
        Intrinsics.checkNotNullExpressionValue(internalName, "getInternalName(...)");
        return createObjectType(internalName);
    }

    @Override // kotlin.reflect.jvm.internal.impl.load.kotlin.typeSignatureMapping2
    public methodSignatureMapping createFromString(String representation) {
        JvmPrimitiveType jvmPrimitiveType;
        Intrinsics.checkNotNullParameter(representation, "representation");
        representation.length();
        char cCharAt = representation.charAt(0);
        JvmPrimitiveType[] jvmPrimitiveTypeArrValues = JvmPrimitiveType.values();
        int length = jvmPrimitiveTypeArrValues.length;
        int i = 0;
        while (true) {
            if (i >= length) {
                jvmPrimitiveType = null;
                break;
            }
            jvmPrimitiveType = jvmPrimitiveTypeArrValues[i];
            if (jvmPrimitiveType.getDesc().charAt(0) == cCharAt) {
                break;
            }
            i++;
        }
        if (jvmPrimitiveType != null) {
            return new methodSignatureMapping.Primitive(jvmPrimitiveType);
        }
        if (cCharAt == 'V') {
            return new methodSignatureMapping.Primitive(null);
        }
        if (cCharAt != '[') {
            if (cCharAt == 'L') {
                StringsKt.endsWith$default((CharSequence) representation, ';', false, 2, (Object) null);
            }
            String strSubstring = representation.substring(1, representation.length() - 1);
            Intrinsics.checkNotNullExpressionValue(strSubstring, "substring(...)");
            return new methodSignatureMapping.Object(strSubstring);
        }
        String strSubstring2 = representation.substring(1);
        Intrinsics.checkNotNullExpressionValue(strSubstring2, "substring(...)");
        return new methodSignatureMapping.Array(createFromString(strSubstring2));
    }

    @Override // kotlin.reflect.jvm.internal.impl.load.kotlin.typeSignatureMapping2
    public methodSignatureMapping createPrimitiveType(PrimitiveType primitiveType) {
        Intrinsics.checkNotNullParameter(primitiveType, "primitiveType");
        switch (WhenMappings.$EnumSwitchMapping$0[primitiveType.ordinal()]) {
            case 1:
                return methodSignatureMapping.Companion.getBOOLEAN$descriptors_jvm();
            case 2:
                return methodSignatureMapping.Companion.getCHAR$descriptors_jvm();
            case 3:
                return methodSignatureMapping.Companion.getBYTE$descriptors_jvm();
            case 4:
                return methodSignatureMapping.Companion.getSHORT$descriptors_jvm();
            case 5:
                return methodSignatureMapping.Companion.getINT$descriptors_jvm();
            case 6:
                return methodSignatureMapping.Companion.getFLOAT$descriptors_jvm();
            case 7:
                return methodSignatureMapping.Companion.getLONG$descriptors_jvm();
            case 8:
                return methodSignatureMapping.Companion.getDOUBLE$descriptors_jvm();
            default:
                throw new NoWhenBranchMatchedException();
        }
    }

    @Override // kotlin.reflect.jvm.internal.impl.load.kotlin.typeSignatureMapping2
    public methodSignatureMapping createObjectType(String internalName) {
        Intrinsics.checkNotNullParameter(internalName, "internalName");
        return new methodSignatureMapping.Object(internalName);
    }

    @Override // kotlin.reflect.jvm.internal.impl.load.kotlin.typeSignatureMapping2
    public String toString(methodSignatureMapping type2) {
        String desc;
        Intrinsics.checkNotNullParameter(type2, "type");
        if (type2 instanceof methodSignatureMapping.Array) {
            return '[' + toString(((methodSignatureMapping.Array) type2).getElementType());
        }
        if (type2 instanceof methodSignatureMapping.Primitive) {
            JvmPrimitiveType jvmPrimitiveType = ((methodSignatureMapping.Primitive) type2).getJvmPrimitiveType();
            return (jvmPrimitiveType == null || (desc = jvmPrimitiveType.getDesc()) == null) ? "V" : desc;
        }
        if (!(type2 instanceof methodSignatureMapping.Object)) {
            throw new NoWhenBranchMatchedException();
        }
        return Matrix.MATRIX_TYPE_RANDOM_LT + ((methodSignatureMapping.Object) type2).getInternalName() + ';';
    }

    @Override // kotlin.reflect.jvm.internal.impl.load.kotlin.typeSignatureMapping2
    public methodSignatureMapping getJavaLangClassType() {
        return createObjectType("java/lang/Class");
    }
}
