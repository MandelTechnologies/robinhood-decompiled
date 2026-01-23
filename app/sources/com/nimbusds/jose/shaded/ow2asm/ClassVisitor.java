package com.nimbusds.jose.shaded.ow2asm;

import java.io.IOException;

/* loaded from: classes27.dex */
public abstract class ClassVisitor {
    protected final int api;

    /* renamed from: cv */
    protected ClassVisitor f1213cv;

    public abstract void visit(int i, int i2, String str, String str2, String str3, String[] strArr);

    public abstract AnnotationVisitor visitAnnotation(String str, boolean z);

    public abstract void visitAttribute(Attribute attribute);

    public abstract void visitEnd();

    public abstract FieldVisitor visitField(int i, String str, String str2, String str3, Object obj);

    public abstract void visitInnerClass(String str, String str2, String str3, int i);

    public abstract MethodVisitor visitMethod(int i, String str, String str2, String str3, String[] strArr);

    public abstract ModuleVisitor visitModule(String str, int i, String str2);

    public abstract void visitNestHost(String str);

    public abstract void visitNestMember(String str);

    public abstract void visitOuterClass(String str, String str2, String str3);

    public abstract void visitPermittedSubclass(String str);

    public abstract RecordComponentVisitor visitRecordComponent(String str, String str2, String str3);

    public abstract void visitSource(String str, String str2);

    public abstract AnnotationVisitor visitTypeAnnotation(int i, TypePath typePath, String str, boolean z);

    public ClassVisitor(int i) {
        this(i, null);
    }

    public ClassVisitor(int i, ClassVisitor classVisitor) throws IOException {
        if (i != 589824 && i != 524288 && i != 458752 && i != 393216 && i != 327680 && i != 262144 && i != 17432576) {
            throw new IllegalArgumentException("Unsupported api " + i);
        }
        if (i == 17432576) {
            Constants.checkAsmExperimental(this);
        }
        this.api = i;
        this.f1213cv = classVisitor;
    }
}
