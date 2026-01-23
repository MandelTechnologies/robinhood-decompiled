package org.bouncycastle.pqc.crypto.lms;

/* loaded from: classes25.dex */
public interface LMSContextBasedVerifier {
    LMSContext generateLMSContext(byte[] bArr);

    boolean verify(LMSContext lMSContext);
}
