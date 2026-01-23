package com.nimbusds.jose.shaded.asm;

import com.nimbusds.jose.shaded.ow2asm.ClassWriter;
import com.nimbusds.jose.shaded.ow2asm.Label;
import com.nimbusds.jose.shaded.ow2asm.MethodVisitor;
import com.nimbusds.jose.shaded.ow2asm.Type;
import com.plaid.internal.EnumC7081g;
import java.lang.reflect.Method;
import java.util.HashMap;
import java.util.Iterator;

/* loaded from: classes27.dex */
public class BeansAccessBuilder {
    private static String METHOD_ACCESS_NAME = Type.getInternalName(BeansAccess.class);
    final String accessClassName;
    final String accessClassNameInternal;
    final Accessor[] accs;
    final String className;
    final String classNameInternal;
    final HashMap<Class<?>, Method> convMtds = new HashMap<>();
    Class<? extends Exception> exceptionClass = NoSuchFieldException.class;
    final DynamicClassLoader loader;

    /* renamed from: type, reason: collision with root package name */
    final Class<?> f9864type;

    public BeansAccessBuilder(Class<?> cls, Accessor[] accessorArr, DynamicClassLoader dynamicClassLoader) {
        this.f9864type = cls;
        this.accs = accessorArr;
        this.loader = dynamicClassLoader;
        String name = cls.getName();
        this.className = name;
        if (name.startsWith("java.")) {
            this.accessClassName = "com.nimbusds.jose.shaded.asm." + name + "AccAccess";
        } else {
            this.accessClassName = name.concat("AccAccess");
        }
        this.accessClassNameInternal = this.accessClassName.replace('.', '/');
        this.classNameInternal = name.replace('.', '/');
    }

    public void addConversion(Iterable<Class<?>> iterable) throws SecurityException {
        if (iterable == null) {
            return;
        }
        Iterator<Class<?>> it = iterable.iterator();
        while (it.hasNext()) {
            addConversion(it.next());
        }
    }

    public void addConversion(Class<?> cls) throws SecurityException {
        if (cls == null) {
            return;
        }
        for (Method method : cls.getMethods()) {
            if ((method.getModifiers() & 8) != 0) {
                Class<?>[] parameterTypes = method.getParameterTypes();
                if (parameterTypes.length == 1 && parameterTypes[0].equals(Object.class)) {
                    Class<?> returnType = method.getReturnType();
                    if (!returnType.equals(Void.TYPE)) {
                        this.convMtds.put(returnType, method);
                    }
                }
            }
        }
    }

    public Class<?> bulid() {
        Method method;
        Type type2;
        Method method2;
        int i;
        int i2;
        int i3;
        Type type3;
        Method method3;
        int i4 = 1;
        ClassWriter classWriter = new ClassWriter(1);
        boolean z = this.accs.length > 10;
        classWriter.visit(50, 33, this.accessClassNameInternal, "Lnet/minidev/asm/BeansAccess<L" + this.classNameInternal + ";>;", METHOD_ACCESS_NAME, null);
        MethodVisitor methodVisitorVisitMethod = classWriter.visitMethod(1, "<init>", "()V", null, null);
        methodVisitorVisitMethod.visitCode();
        methodVisitorVisitMethod.visitVarInsn(25, 0);
        methodVisitorVisitMethod.visitMethodInsn(EnumC7081g.SDK_ASSET_ILLUSTRATION_PLAID_PINWHEEL_VALUE, METHOD_ACCESS_NAME, "<init>", "()V", false);
        methodVisitorVisitMethod.visitInsn(EnumC7081g.SDK_ASSET_HEADER_FINAL_SUCCESS_DARK_APPEARANCE_VALUE);
        methodVisitorVisitMethod.visitMaxs(1, 1);
        methodVisitorVisitMethod.visitEnd();
        MethodVisitor methodVisitorVisitMethod2 = classWriter.visitMethod(1, "set", "(Ljava/lang/Object;ILjava/lang/Object;)V", null, null);
        methodVisitorVisitMethod2.visitCode();
        Accessor[] accessorArr = this.accs;
        if (accessorArr.length != 0) {
            if (accessorArr.length > 14) {
                methodVisitorVisitMethod2.visitVarInsn(21, 2);
                Label[] labelArrNewLabels = ASMUtil.newLabels(this.accs.length);
                Label label = new Label();
                methodVisitorVisitMethod2.visitTableSwitchInsn(0, labelArrNewLabels.length - 1, label, labelArrNewLabels);
                Accessor[] accessorArr2 = this.accs;
                int length = accessorArr2.length;
                int i5 = 0;
                int i6 = 0;
                while (i5 < length) {
                    Accessor accessor = accessorArr2[i5];
                    int i7 = i6 + 1;
                    methodVisitorVisitMethod2.visitLabel(labelArrNewLabels[i6]);
                    if (!accessor.isWritable()) {
                        methodVisitorVisitMethod2.visitInsn(EnumC7081g.SDK_ASSET_HEADER_FINAL_SUCCESS_DARK_APPEARANCE_VALUE);
                    } else {
                        internalSetFiled(methodVisitorVisitMethod2, accessor);
                    }
                    i5++;
                    i6 = i7;
                }
                methodVisitorVisitMethod2.visitLabel(label);
            } else {
                Label[] labelArrNewLabels2 = ASMUtil.newLabels(accessorArr.length);
                int i8 = 0;
                for (Accessor accessor2 : this.accs) {
                    ifNotEqJmp(methodVisitorVisitMethod2, 2, i8, labelArrNewLabels2[i8]);
                    internalSetFiled(methodVisitorVisitMethod2, accessor2);
                    methodVisitorVisitMethod2.visitLabel(labelArrNewLabels2[i8]);
                    methodVisitorVisitMethod2.visitFrame(3, 0, null, 0, null);
                    i8++;
                }
            }
        }
        Class<? extends Exception> cls = this.exceptionClass;
        if (cls != null) {
            throwExIntParam(methodVisitorVisitMethod2, cls);
        } else {
            methodVisitorVisitMethod2.visitInsn(EnumC7081g.SDK_ASSET_HEADER_FINAL_SUCCESS_DARK_APPEARANCE_VALUE);
        }
        methodVisitorVisitMethod2.visitMaxs(0, 0);
        methodVisitorVisitMethod2.visitEnd();
        MethodVisitor methodVisitorVisitMethod3 = classWriter.visitMethod(1, "get", "(Ljava/lang/Object;I)Ljava/lang/Object;", null, null);
        methodVisitorVisitMethod3.visitCode();
        Accessor[] accessorArr3 = this.accs;
        int i9 = 192;
        if (accessorArr3.length == 0) {
            methodVisitorVisitMethod3.visitFrame(3, 0, null, 0, null);
        } else if (accessorArr3.length > 14) {
            methodVisitorVisitMethod3.visitVarInsn(21, 2);
            Label[] labelArrNewLabels3 = ASMUtil.newLabels(this.accs.length);
            Label label2 = new Label();
            methodVisitorVisitMethod3.visitTableSwitchInsn(0, labelArrNewLabels3.length - 1, label2, labelArrNewLabels3);
            Accessor[] accessorArr4 = this.accs;
            int length2 = accessorArr4.length;
            int i10 = 0;
            int i11 = 0;
            while (i10 < length2) {
                Accessor accessor3 = accessorArr4[i10];
                int i12 = i11 + 1;
                methodVisitorVisitMethod3.visitLabel(labelArrNewLabels3[i11]);
                int i13 = i10;
                methodVisitorVisitMethod3.visitFrame(3, 0, null, 0, null);
                if (!accessor3.isReadable()) {
                    methodVisitorVisitMethod3.visitInsn(i4);
                    methodVisitorVisitMethod3.visitInsn(EnumC7081g.SDK_ASSET_ILLUSTRATION_PLAID_LOGO_NAVBAR_DARK_APPEARANCE_VALUE);
                } else {
                    methodVisitorVisitMethod3.visitVarInsn(25, i4);
                    methodVisitorVisitMethod3.visitTypeInsn(i9, this.classNameInternal);
                    Type type4 = Type.getType(accessor3.getType());
                    if (accessor3.isPublic() || (method2 = accessor3.getter) == null) {
                        type2 = type4;
                        methodVisitorVisitMethod3.visitFieldInsn(EnumC7081g.SDK_ASSET_HEADER_NOT_LISTED_ERROR_VALUE, this.classNameInternal, accessor3.getName(), type2.getDescriptor());
                    } else {
                        String methodDescriptor = Type.getMethodDescriptor(method2);
                        type2 = type4;
                        methodVisitorVisitMethod3.visitMethodInsn(182, this.classNameInternal, accessor3.getter.getName(), methodDescriptor, false);
                    }
                    ASMUtil.autoBoxing(methodVisitorVisitMethod3, type2);
                    methodVisitorVisitMethod3.visitInsn(EnumC7081g.SDK_ASSET_ILLUSTRATION_PLAID_LOGO_NAVBAR_DARK_APPEARANCE_VALUE);
                }
                i10 = i13 + 1;
                i11 = i12;
                i9 = 192;
                i4 = 1;
            }
            methodVisitorVisitMethod3.visitLabel(label2);
            methodVisitorVisitMethod3.visitFrame(3, 0, null, 0, null);
        } else {
            Label[] labelArrNewLabels4 = ASMUtil.newLabels(accessorArr3.length);
            int i14 = 0;
            for (Accessor accessor4 : this.accs) {
                ifNotEqJmp(methodVisitorVisitMethod3, 2, i14, labelArrNewLabels4[i14]);
                methodVisitorVisitMethod3.visitVarInsn(25, 1);
                methodVisitorVisitMethod3.visitTypeInsn(192, this.classNameInternal);
                Type type5 = Type.getType(accessor4.getType());
                if (accessor4.isPublic() || (method = accessor4.getter) == null) {
                    methodVisitorVisitMethod3.visitFieldInsn(EnumC7081g.SDK_ASSET_HEADER_NOT_LISTED_ERROR_VALUE, this.classNameInternal, accessor4.getName(), type5.getDescriptor());
                } else {
                    if (method == null) {
                        throw new RuntimeException("no Getter for field " + accessor4.getName() + " in class " + this.className);
                    }
                    methodVisitorVisitMethod3.visitMethodInsn(182, this.classNameInternal, accessor4.getter.getName(), Type.getMethodDescriptor(method), false);
                }
                ASMUtil.autoBoxing(methodVisitorVisitMethod3, type5);
                methodVisitorVisitMethod3.visitInsn(EnumC7081g.SDK_ASSET_ILLUSTRATION_PLAID_LOGO_NAVBAR_DARK_APPEARANCE_VALUE);
                methodVisitorVisitMethod3.visitLabel(labelArrNewLabels4[i14]);
                methodVisitorVisitMethod3.visitFrame(3, 0, null, 0, null);
                i14++;
            }
        }
        Class<? extends Exception> cls2 = this.exceptionClass;
        if (cls2 != null) {
            throwExIntParam(methodVisitorVisitMethod3, cls2);
        } else {
            methodVisitorVisitMethod3.visitInsn(1);
            methodVisitorVisitMethod3.visitInsn(EnumC7081g.SDK_ASSET_ILLUSTRATION_PLAID_LOGO_NAVBAR_DARK_APPEARANCE_VALUE);
        }
        methodVisitorVisitMethod3.visitMaxs(0, 0);
        methodVisitorVisitMethod3.visitEnd();
        int i15 = EnumC7081g.SDK_ASSET_ILLUSTRATION_SQUARE_CASH_GENERIC_INSTITUTION_VALUE;
        if (z) {
            i = 180;
            i2 = 176;
            i3 = 192;
        } else {
            i2 = 176;
            i = 180;
            i3 = 192;
            MethodVisitor methodVisitorVisitMethod4 = classWriter.visitMethod(1, "set", "(Ljava/lang/Object;Ljava/lang/String;Ljava/lang/Object;)V", null, null);
            methodVisitorVisitMethod4.visitCode();
            Label[] labelArrNewLabels5 = ASMUtil.newLabels(this.accs.length);
            int i16 = 0;
            for (Accessor accessor5 : this.accs) {
                methodVisitorVisitMethod4.visitVarInsn(25, 2);
                methodVisitorVisitMethod4.visitLdcInsn(accessor5.fieldName);
                methodVisitorVisitMethod4.visitMethodInsn(182, "java/lang/String", "equals", "(Ljava/lang/Object;)Z", false);
                methodVisitorVisitMethod4.visitJumpInsn(EnumC7081g.SDK_ASSET_ILLUSTRATION_SQUARE_CASH_GENERIC_INSTITUTION_VALUE, labelArrNewLabels5[i16]);
                internalSetFiled(methodVisitorVisitMethod4, accessor5);
                methodVisitorVisitMethod4.visitLabel(labelArrNewLabels5[i16]);
                methodVisitorVisitMethod4.visitFrame(3, 0, null, 0, null);
                i16++;
            }
            Class<? extends Exception> cls3 = this.exceptionClass;
            if (cls3 != null) {
                throwExStrParam(methodVisitorVisitMethod4, cls3);
            } else {
                methodVisitorVisitMethod4.visitInsn(EnumC7081g.SDK_ASSET_HEADER_FINAL_SUCCESS_DARK_APPEARANCE_VALUE);
            }
            methodVisitorVisitMethod4.visitMaxs(0, 0);
            methodVisitorVisitMethod4.visitEnd();
        }
        if (!z) {
            MethodVisitor methodVisitorVisitMethod5 = classWriter.visitMethod(1, "get", "(Ljava/lang/Object;Ljava/lang/String;)Ljava/lang/Object;", null, null);
            methodVisitorVisitMethod5.visitCode();
            Label[] labelArrNewLabels6 = ASMUtil.newLabels(this.accs.length);
            Accessor[] accessorArr5 = this.accs;
            int length3 = accessorArr5.length;
            int i17 = 0;
            int i18 = 0;
            while (i17 < length3) {
                Accessor accessor6 = accessorArr5[i17];
                methodVisitorVisitMethod5.visitVarInsn(25, 2);
                methodVisitorVisitMethod5.visitLdcInsn(accessor6.fieldName);
                methodVisitorVisitMethod5.visitMethodInsn(182, "java/lang/String", "equals", "(Ljava/lang/Object;)Z", false);
                methodVisitorVisitMethod5.visitJumpInsn(i15, labelArrNewLabels6[i18]);
                methodVisitorVisitMethod5.visitVarInsn(25, 1);
                methodVisitorVisitMethod5.visitTypeInsn(i3, this.classNameInternal);
                Type type6 = Type.getType(accessor6.getType());
                if (accessor6.isPublic() || (method3 = accessor6.getter) == null) {
                    type3 = type6;
                    methodVisitorVisitMethod5.visitFieldInsn(i, this.classNameInternal, accessor6.getName(), type3.getDescriptor());
                } else {
                    String methodDescriptor2 = Type.getMethodDescriptor(method3);
                    type3 = type6;
                    methodVisitorVisitMethod5.visitMethodInsn(182, this.classNameInternal, accessor6.getter.getName(), methodDescriptor2, false);
                }
                ASMUtil.autoBoxing(methodVisitorVisitMethod5, type3);
                methodVisitorVisitMethod5.visitInsn(i2);
                methodVisitorVisitMethod5.visitLabel(labelArrNewLabels6[i18]);
                methodVisitorVisitMethod5.visitFrame(3, 0, null, 0, null);
                i18++;
                i17++;
                i15 = EnumC7081g.SDK_ASSET_ILLUSTRATION_SQUARE_CASH_GENERIC_INSTITUTION_VALUE;
            }
            Class<? extends Exception> cls4 = this.exceptionClass;
            if (cls4 != null) {
                throwExStrParam(methodVisitorVisitMethod5, cls4);
            } else {
                methodVisitorVisitMethod5.visitInsn(1);
                methodVisitorVisitMethod5.visitInsn(i2);
            }
            methodVisitorVisitMethod5.visitMaxs(0, 0);
            methodVisitorVisitMethod5.visitEnd();
        }
        MethodVisitor methodVisitorVisitMethod6 = classWriter.visitMethod(1, "newInstance", "()Ljava/lang/Object;", null, null);
        methodVisitorVisitMethod6.visitCode();
        methodVisitorVisitMethod6.visitTypeInsn(EnumC7081g.SDK_ASSET_ILLUSTRATION_ATOMIC_LOGO_VALUE, this.classNameInternal);
        methodVisitorVisitMethod6.visitInsn(89);
        methodVisitorVisitMethod6.visitMethodInsn(EnumC7081g.SDK_ASSET_ILLUSTRATION_PLAID_PINWHEEL_VALUE, this.classNameInternal, "<init>", "()V", false);
        methodVisitorVisitMethod6.visitInsn(i2);
        methodVisitorVisitMethod6.visitMaxs(2, 1);
        methodVisitorVisitMethod6.visitEnd();
        classWriter.visitEnd();
        return this.loader.defineClass(this.accessClassName, classWriter.toByteArray());
    }

    private void internalSetFiled(MethodVisitor methodVisitor, Accessor accessor) {
        Method method;
        MethodVisitor methodVisitor2 = methodVisitor;
        methodVisitor2.visitVarInsn(25, 1);
        methodVisitor2.visitTypeInsn(192, this.classNameInternal);
        methodVisitor2.visitVarInsn(25, 3);
        Type type2 = Type.getType(accessor.getType());
        Class<?> type3 = accessor.getType();
        String internalName = Type.getInternalName(type3);
        Method method2 = this.convMtds.get(type3);
        if (method2 != null) {
            methodVisitor2.visitMethodInsn(EnumC7081g.SDK_ASSET_ILLUSTRATION_PLAID_PINWHEEL_TEXT_VALUE, Type.getInternalName(method2.getDeclaringClass()), method2.getName(), Type.getMethodDescriptor(method2), false);
        } else if (accessor.isEnum()) {
            Label label = new Label();
            methodVisitor2.visitJumpInsn(EnumC7081g.SDK_ASSET_ICON_ARROW_UP_VALUE, label);
            methodVisitor2.visitVarInsn(25, 3);
            methodVisitor2.visitMethodInsn(182, "java/lang/Object", "toString", "()Ljava/lang/String;", false);
            methodVisitor2 = methodVisitor;
            methodVisitor2.visitMethodInsn(EnumC7081g.SDK_ASSET_ILLUSTRATION_PLAID_PINWHEEL_TEXT_VALUE, internalName, "valueOf", "(Ljava/lang/String;)L" + internalName + ";", false);
            methodVisitor2.visitVarInsn(58, 3);
            methodVisitor2.visitLabel(label);
            methodVisitor2.visitFrame(3, 0, null, 0, null);
            methodVisitor2.visitVarInsn(25, 1);
            methodVisitor2.visitTypeInsn(192, this.classNameInternal);
            methodVisitor2.visitVarInsn(25, 3);
            methodVisitor2.visitTypeInsn(192, internalName);
        } else if (type3.equals(String.class)) {
            Label label2 = new Label();
            methodVisitor2.visitJumpInsn(EnumC7081g.SDK_ASSET_ICON_ARROW_UP_VALUE, label2);
            methodVisitor2.visitVarInsn(25, 3);
            methodVisitor2.visitMethodInsn(182, "java/lang/Object", "toString", "()Ljava/lang/String;", false);
            methodVisitor2.visitVarInsn(58, 3);
            methodVisitor2.visitLabel(label2);
            methodVisitor2.visitFrame(3, 0, null, 0, null);
            methodVisitor2.visitVarInsn(25, 1);
            methodVisitor2.visitTypeInsn(192, this.classNameInternal);
            methodVisitor2.visitVarInsn(25, 3);
            methodVisitor2.visitTypeInsn(192, internalName);
        } else {
            methodVisitor2.visitTypeInsn(192, internalName);
        }
        if (accessor.isPublic() || (method = accessor.setter) == null) {
            methodVisitor2.visitFieldInsn(EnumC7081g.SDK_ASSET_ILLUSTRATION_PLAID_REVIEW_CONNECTION_VALUE, this.classNameInternal, accessor.getName(), type2.getDescriptor());
        } else {
            methodVisitor2.visitMethodInsn(182, this.classNameInternal, accessor.setter.getName(), Type.getMethodDescriptor(method), false);
        }
        methodVisitor2.visitInsn(EnumC7081g.SDK_ASSET_HEADER_FINAL_SUCCESS_DARK_APPEARANCE_VALUE);
    }

    private void throwExIntParam(MethodVisitor methodVisitor, Class<?> cls) {
        String internalName = Type.getInternalName(cls);
        methodVisitor.visitTypeInsn(EnumC7081g.SDK_ASSET_ILLUSTRATION_ATOMIC_LOGO_VALUE, internalName);
        methodVisitor.visitInsn(89);
        methodVisitor.visitLdcInsn("mapping " + this.className + " failed to map field:");
        methodVisitor.visitVarInsn(21, 2);
        methodVisitor.visitMethodInsn(EnumC7081g.SDK_ASSET_ILLUSTRATION_PLAID_PINWHEEL_TEXT_VALUE, "java/lang/Integer", "toString", "(I)Ljava/lang/String;", false);
        methodVisitor.visitMethodInsn(182, "java/lang/String", "concat", "(Ljava/lang/String;)Ljava/lang/String;", false);
        methodVisitor.visitMethodInsn(EnumC7081g.SDK_ASSET_ILLUSTRATION_PLAID_PINWHEEL_VALUE, internalName, "<init>", "(Ljava/lang/String;)V", false);
        methodVisitor.visitInsn(EnumC7081g.SDK_ASSET_ILLUSTRATION_MD_ERROR_ATTEMPT_2_NEW_VALUE);
    }

    private void throwExStrParam(MethodVisitor methodVisitor, Class<?> cls) {
        String internalName = Type.getInternalName(cls);
        methodVisitor.visitTypeInsn(EnumC7081g.SDK_ASSET_ILLUSTRATION_ATOMIC_LOGO_VALUE, internalName);
        methodVisitor.visitInsn(89);
        methodVisitor.visitLdcInsn("mapping " + this.className + " failed to map field:");
        methodVisitor.visitVarInsn(25, 2);
        methodVisitor.visitMethodInsn(182, "java/lang/String", "concat", "(Ljava/lang/String;)Ljava/lang/String;", false);
        methodVisitor.visitMethodInsn(EnumC7081g.SDK_ASSET_ILLUSTRATION_PLAID_PINWHEEL_VALUE, internalName, "<init>", "(Ljava/lang/String;)V", false);
        methodVisitor.visitInsn(EnumC7081g.SDK_ASSET_ILLUSTRATION_MD_ERROR_ATTEMPT_2_NEW_VALUE);
    }

    private void ifNotEqJmp(MethodVisitor methodVisitor, int i, int i2, Label label) {
        methodVisitor.visitVarInsn(21, i);
        if (i2 == 0) {
            methodVisitor.visitJumpInsn(EnumC7081g.SDK_ASSET_ILLUSTRATION_UPLOAD_VALUE, label);
            return;
        }
        if (i2 == 1) {
            methodVisitor.visitInsn(4);
            methodVisitor.visitJumpInsn(EnumC7081g.SDK_ASSET_ILLUSTRATION_SECURE_TOKENIZATION_VALUE, label);
            return;
        }
        if (i2 == 2) {
            methodVisitor.visitInsn(5);
            methodVisitor.visitJumpInsn(EnumC7081g.SDK_ASSET_ILLUSTRATION_SECURE_TOKENIZATION_VALUE, label);
            return;
        }
        if (i2 == 3) {
            methodVisitor.visitInsn(6);
            methodVisitor.visitJumpInsn(EnumC7081g.SDK_ASSET_ILLUSTRATION_SECURE_TOKENIZATION_VALUE, label);
            return;
        }
        if (i2 == 4) {
            methodVisitor.visitInsn(7);
            methodVisitor.visitJumpInsn(EnumC7081g.SDK_ASSET_ILLUSTRATION_SECURE_TOKENIZATION_VALUE, label);
        } else if (i2 == 5) {
            methodVisitor.visitInsn(8);
            methodVisitor.visitJumpInsn(EnumC7081g.SDK_ASSET_ILLUSTRATION_SECURE_TOKENIZATION_VALUE, label);
        } else {
            if (i2 >= 6) {
                methodVisitor.visitIntInsn(16, i2);
                methodVisitor.visitJumpInsn(EnumC7081g.SDK_ASSET_ILLUSTRATION_SECURE_TOKENIZATION_VALUE, label);
                return;
            }
            throw new RuntimeException("non supported negative values");
        }
    }
}
