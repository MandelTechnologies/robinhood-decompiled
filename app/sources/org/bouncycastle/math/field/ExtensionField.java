package org.bouncycastle.math.field;

/* loaded from: classes25.dex */
public interface ExtensionField extends FiniteField {
    int getDegree();

    FiniteField getSubfield();
}
