package com.robinhood.vault.internal;

import com.robinhood.vault.VaultExceptions2;
import java.security.NoSuchAlgorithmException;
import java.security.ProviderException;
import javax.crypto.Cipher;
import javax.crypto.NoSuchPaddingException;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: CreateCipher.kt */
@Metadata(m3635d1 = {"\u0000\u001c\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\u0018\u0002\n\u0000\u001a)\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u00032\u0017\u0010\u0004\u001a\u0013\u0012\u0004\u0012\u00020\u0001\u0012\u0004\u0012\u00020\u00060\u0005¢\u0006\u0002\b\u0007H\u0000¨\u0006\b"}, m3636d2 = {"createCipher", "Ljavax/crypto/Cipher;", "transformation", "", "initializer", "Lkotlin/Function1;", "", "Lkotlin/ExtensionFunctionType;", "lib-vault_externalDebug"}, m3637k = 2, m3638mv = {2, 1, 0}, m3640xi = 48)
/* renamed from: com.robinhood.vault.internal.CreateCipherKt, reason: use source file name */
/* loaded from: classes12.dex */
public final class CreateCipher {
    public static final Cipher createCipher(String transformation, Function1<? super Cipher, Unit> initializer) throws VaultExceptions2, InterruptedException, NoSuchPaddingException, NoSuchAlgorithmException {
        Intrinsics.checkNotNullParameter(transformation, "transformation");
        Intrinsics.checkNotNullParameter(initializer, "initializer");
        ProviderException e = null;
        for (int i = 0; i < 3; i++) {
            if (i > 0) {
                Thread.sleep(100L);
            }
            try {
                Cipher cipher = Cipher.getInstance(transformation);
                initializer.invoke(cipher);
                Intrinsics.checkNotNullExpressionValue(cipher, "apply(...)");
                return cipher;
            } catch (ProviderException e2) {
                e = e2;
                if (!Intrinsics.areEqual(e.getClass().getName(), "android.security.keystore.KeyStoreConnectException")) {
                    throw e;
                }
            }
        }
        throw new VaultExceptions2("Failed initializing cipher", e);
    }
}
