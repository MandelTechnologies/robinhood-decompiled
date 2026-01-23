package p479j$.sun.nio.p480cs;

import java.nio.charset.Charset;
import java.nio.charset.CharsetDecoder;
import java.nio.charset.CharsetEncoder;
import org.bouncycastle.i18n.LocalizedMessage;

/* renamed from: j$.sun.nio.cs.c */
/* loaded from: classes29.dex */
public final class C45718c extends Charset {

    /* renamed from: a */
    public static final C45718c f6659a;

    static {
        int i = AbstractC45719d.f6660a;
        f6659a = new C45718c(LocalizedMessage.DEFAULT_ENCODING, new String[]{"iso-ir-100", "ISO_8859-1", "latin1", "l1", "IBM819", "cp819", "csISOLatin1", "819", "IBM-819", "ISO8859_1", "ISO_8859-1:1987", "ISO_8859_1", "8859_1", "ISO8859-1"});
    }

    @Override // java.nio.charset.Charset
    public final boolean contains(Charset charset) {
        return charset instanceof C45718c;
    }

    @Override // java.nio.charset.Charset
    public final CharsetDecoder newDecoder() {
        return new C45716a(this);
    }

    @Override // java.nio.charset.Charset
    public final CharsetEncoder newEncoder() {
        return new C45717b(this);
    }
}
