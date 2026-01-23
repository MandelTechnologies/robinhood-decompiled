package com.nimbusds.jose.shaded.ow2asm;

import java.io.DataInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.util.regex.Pattern;

/* loaded from: classes27.dex */
final class Constants {
    static void checkAsmExperimental(Object obj) throws IOException {
        Class<?> cls = obj.getClass();
        String strReplace = cls.getName().replace('.', '/');
        if (isWhitelisted(strReplace)) {
            return;
        }
        checkIsPreview(cls.getClassLoader().getResourceAsStream(strReplace + ".class"));
    }

    static boolean isWhitelisted(String str) {
        if (!str.startsWith("com/nimbusds/jose/shaded/ow2asm/")) {
            return false;
        }
        if (str.contains("Test$")) {
            return true;
        }
        if (Pattern.matches("com/nimbusds/jose/shaded/ow2asm/util/Trace(Annotation|Class|Field|Method|Module|RecordComponent|Signature)Visitor(\\$.*)?", str)) {
            return true;
        }
        StringBuilder sb = new StringBuilder();
        sb.append("com/nimbusds/jose/shaded/ow2asm/util/Check");
        sb.append("(Annotation|Class|Field|Method|Module|RecordComponent|Signature)");
        sb.append("Adapter(\\$.*)?");
        return Pattern.matches(sb.toString(), str);
    }

    static void checkIsPreview(InputStream inputStream) throws IOException {
        if (inputStream == null) {
            throw new IllegalStateException("Bytecode not available, can't check class version");
        }
        try {
            DataInputStream dataInputStream = new DataInputStream(inputStream);
            try {
                dataInputStream.readInt();
                int unsignedShort = dataInputStream.readUnsignedShort();
                dataInputStream.close();
                if (unsignedShort != 65535) {
                    throw new IllegalStateException("ASM9_EXPERIMENTAL can only be used by classes compiled with --enable-preview");
                }
            } catch (Throwable th) {
                try {
                    dataInputStream.close();
                } catch (Throwable unused) {
                }
                throw th;
            }
        } catch (IOException e) {
            throw new IllegalStateException("I/O error, can't check class version", e);
        }
    }
}
