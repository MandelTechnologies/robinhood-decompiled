package com.nimbusds.jose.shaded.ow2asm;

import java.io.IOException;

/* loaded from: classes27.dex */
public abstract class AnnotationVisitor {
    protected final int api;

    /* renamed from: av */
    protected AnnotationVisitor f1211av;

    public abstract void visit(String str, Object obj);

    public abstract AnnotationVisitor visitAnnotation(String str, String str2);

    public abstract AnnotationVisitor visitArray(String str);

    public abstract void visitEnd();

    public abstract void visitEnum(String str, String str2, String str3);

    public AnnotationVisitor(int i) {
        this(i, null);
    }

    public AnnotationVisitor(int i, AnnotationVisitor annotationVisitor) throws IOException {
        if (i != 589824 && i != 524288 && i != 458752 && i != 393216 && i != 327680 && i != 262144 && i != 17432576) {
            throw new IllegalArgumentException("Unsupported api " + i);
        }
        if (i == 17432576) {
            Constants.checkAsmExperimental(this);
        }
        this.api = i;
        this.f1211av = annotationVisitor;
    }
}
