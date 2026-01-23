package com.google.crypto.tink.subtle;

import com.google.crypto.tink.subtle.EngineWrapper;
import java.security.GeneralSecurityException;
import java.security.KeyFactory;
import java.security.KeyPairGenerator;
import java.security.MessageDigest;
import java.security.Provider;
import java.security.Security;
import java.security.Signature;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.logging.Logger;
import javax.crypto.Cipher;
import javax.crypto.KeyAgreement;
import javax.crypto.Mac;

/* loaded from: classes27.dex */
public final class EngineFactory<T_WRAPPER extends EngineWrapper<T_ENGINE>, T_ENGINE> {
    public static final EngineFactory<EngineWrapper.TCipher, Cipher> CIPHER;
    public static final EngineFactory<EngineWrapper.TKeyAgreement, KeyAgreement> KEY_AGREEMENT;
    public static final EngineFactory<EngineWrapper.TKeyFactory, KeyFactory> KEY_FACTORY;
    public static final EngineFactory<EngineWrapper.TKeyPairGenerator, KeyPairGenerator> KEY_PAIR_GENERATOR;
    public static final EngineFactory<EngineWrapper.TMac, Mac> MAC;
    public static final EngineFactory<EngineWrapper.TMessageDigest, MessageDigest> MESSAGE_DIGEST;
    public static final EngineFactory<EngineWrapper.TSignature, Signature> SIGNATURE;
    private static final List<Provider> defaultPolicy;
    private static final Logger logger = Logger.getLogger(EngineFactory.class.getName());
    private T_WRAPPER instanceBuilder;
    private List<Provider> policy = defaultPolicy;
    private boolean letFallback = true;

    static {
        if (SubtleUtil.isAndroid()) {
            defaultPolicy = toProviderList("GmsCore_OpenSSL", "AndroidOpenSSL");
        } else {
            defaultPolicy = new ArrayList();
        }
        CIPHER = new EngineFactory<>(new EngineWrapper.TCipher());
        MAC = new EngineFactory<>(new EngineWrapper.TMac());
        SIGNATURE = new EngineFactory<>(new EngineWrapper.TSignature());
        MESSAGE_DIGEST = new EngineFactory<>(new EngineWrapper.TMessageDigest());
        KEY_AGREEMENT = new EngineFactory<>(new EngineWrapper.TKeyAgreement());
        KEY_PAIR_GENERATOR = new EngineFactory<>(new EngineWrapper.TKeyPairGenerator());
        KEY_FACTORY = new EngineFactory<>(new EngineWrapper.TKeyFactory());
    }

    public static List<Provider> toProviderList(String... providerNames) {
        ArrayList arrayList = new ArrayList();
        for (String str : providerNames) {
            Provider provider = Security.getProvider(str);
            if (provider != null) {
                arrayList.add(provider);
            } else {
                logger.info(String.format("Provider %s not available", str));
            }
        }
        return arrayList;
    }

    public EngineFactory(T_WRAPPER instanceBuilder) {
        this.instanceBuilder = instanceBuilder;
    }

    public T_ENGINE getInstance(String str) throws GeneralSecurityException {
        Iterator<Provider> it = this.policy.iterator();
        Exception exc = null;
        while (it.hasNext()) {
            try {
                return (T_ENGINE) this.instanceBuilder.getInstance(str, it.next());
            } catch (Exception e) {
                if (exc == null) {
                    exc = e;
                }
            }
        }
        if (this.letFallback) {
            return (T_ENGINE) this.instanceBuilder.getInstance(str, null);
        }
        throw new GeneralSecurityException("No good Provider found.", exc);
    }
}
