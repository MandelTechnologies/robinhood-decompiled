package com.nimbusds.jose;

import com.nimbusds.jose.util.Base64URL;
import com.nimbusds.jose.util.StandardCharset;
import java.text.ParseException;
import java.util.concurrent.atomic.AtomicReference;

/* loaded from: classes27.dex */
public class JWSObject extends JOSEObject {
    private final JWSHeader header;
    private Base64URL signature;
    private final String signingInputString;
    private final AtomicReference<State> state;

    public enum State {
        UNSIGNED,
        SIGNED,
        VERIFIED
    }

    public JWSObject(Base64URL base64URL, Base64URL base64URL2, Base64URL base64URL3) throws ParseException {
        this(base64URL, new Payload(base64URL2), base64URL3);
    }

    public JWSObject(Base64URL base64URL, Payload payload, Base64URL base64URL2) throws ParseException {
        AtomicReference<State> atomicReference = new AtomicReference<>();
        this.state = atomicReference;
        if (base64URL == null) {
            throw new IllegalArgumentException("The first part must not be null");
        }
        try {
            this.header = JWSHeader.parse(base64URL);
            if (payload == null) {
                throw new IllegalArgumentException("The payload (second part) must not be null");
            }
            setPayload(payload);
            this.signingInputString = composeSigningInput();
            if (base64URL2 == null) {
                throw new IllegalArgumentException("The third part must not be null");
            }
            this.signature = base64URL2;
            atomicReference.set(State.SIGNED);
            if (getHeader().isBase64URLEncodePayload()) {
                setParsedParts(base64URL, payload.toBase64URL(), base64URL2);
            } else {
                setParsedParts(base64URL, new Base64URL(""), base64URL2);
            }
        } catch (ParseException e) {
            throw new ParseException("Invalid JWS header: " + e.getMessage(), 0);
        }
    }

    public JWSHeader getHeader() {
        return this.header;
    }

    private String composeSigningInput() {
        if (this.header.isBase64URLEncodePayload()) {
            return getHeader().toBase64URL().toString() + '.' + getPayload().toBase64URL().toString();
        }
        return getHeader().toBase64URL().toString() + '.' + getPayload().toString();
    }

    public byte[] getSigningInput() {
        return this.signingInputString.getBytes(StandardCharset.UTF_8);
    }

    public Base64URL getSignature() {
        return this.signature;
    }

    private void ensureSignedOrVerifiedState() {
        if (this.state.get() != State.SIGNED && this.state.get() != State.VERIFIED) {
            throw new IllegalStateException("The JWS object must be in a signed or verified state");
        }
    }

    public synchronized boolean verify(JWSVerifier jWSVerifier) throws JOSEException {
        boolean zVerify;
        ensureSignedOrVerifiedState();
        try {
            zVerify = jWSVerifier.verify(getHeader(), getSigningInput(), getSignature());
            if (zVerify) {
                this.state.set(State.VERIFIED);
            }
        } catch (JOSEException e) {
            throw e;
        } catch (Exception e2) {
            throw new JOSEException(e2.getMessage(), e2);
        }
        return zVerify;
    }

    public String serialize() {
        return serialize(false);
    }

    public String serialize(boolean z) {
        ensureSignedOrVerifiedState();
        if (z) {
            return this.header.toBase64URL().toString() + ".." + this.signature.toString();
        }
        return this.signingInputString + '.' + this.signature.toString();
    }

    public static JWSObject parse(String str) throws ParseException {
        Base64URL[] base64URLArrSplit = JOSEObject.split(str);
        if (base64URLArrSplit.length != 3) {
            throw new ParseException("Unexpected number of Base64URL parts, must be three", 0);
        }
        return new JWSObject(base64URLArrSplit[0], base64URLArrSplit[1], base64URLArrSplit[2]);
    }
}
