package com.stripe.android.stripe3ds2.security;

import com.nimbusds.jose.jwk.KeyUse;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import java.util.Set;
import kotlin.Metadata;
import kotlin.collections.CollectionsKt;
import kotlin.collections.SetsKt;
import kotlin.enums.EnumEntries;
import kotlin.enums.EnumEntries2;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlin.text.StringsKt;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* compiled from: DirectoryServer.kt */
@Metadata(m3635d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0000\n\u0002\u0010 \n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0010\u000b\n\u0002\b\f\b\u0080\u0081\u0002\u0018\u0000 \u001d2\b\u0012\u0004\u0012\u00020\u00000\u0001:\u0001\u001dB1\b\u0002\u0012\f\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003\u0012\u0006\u0010\u0005\u001a\u00020\u0006\u0012\u0006\u0010\u0007\u001a\u00020\u0004\u0012\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\t¢\u0006\u0002\u0010\nR\u0011\u0010\u0005\u001a\u00020\u0006¢\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\fR\u0011\u0010\u0007\u001a\u00020\u0004¢\u0006\b\n\u0000\u001a\u0004\b\r\u0010\u000eR\u0017\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u000f\u0010\u0010R\u0011\u0010\u0011\u001a\u00020\u00128F¢\u0006\u0006\u001a\u0004\b\u0011\u0010\u0013R\u0013\u0010\b\u001a\u0004\u0018\u00010\t¢\u0006\b\n\u0000\u001a\u0004\b\u0014\u0010\u0015j\u0002\b\u0016j\u0002\b\u0017j\u0002\b\u0018j\u0002\b\u0019j\u0002\b\u001aj\u0002\b\u001bj\u0002\b\u001c¨\u0006\u001e"}, m3636d2 = {"Lcom/stripe/android/stripe3ds2/security/DirectoryServer;", "", "ids", "", "", "algorithm", "Lcom/stripe/android/stripe3ds2/security/Algorithm;", "fileName", "keyUse", "Lcom/nimbusds/jose/jwk/KeyUse;", "(Ljava/lang/String;ILjava/util/List;Lcom/stripe/android/stripe3ds2/security/Algorithm;Ljava/lang/String;Lcom/nimbusds/jose/jwk/KeyUse;)V", "getAlgorithm", "()Lcom/stripe/android/stripe3ds2/security/Algorithm;", "getFileName", "()Ljava/lang/String;", "getIds", "()Ljava/util/List;", "isCertificate", "", "()Z", "getKeyUse", "()Lcom/nimbusds/jose/jwk/KeyUse;", "TestRsa", "TestEc", "Visa", "Mastercard", "Amex", "Discover", "CartesBancaires", "Companion", "3ds2sdk_release"}, m3637k = 1, m3638mv = {1, 9, 0}, m3640xi = 48)
@SourceDebugExtension
/* loaded from: classes26.dex */
public final class DirectoryServer {
    private static final /* synthetic */ EnumEntries $ENTRIES;
    private static final /* synthetic */ DirectoryServer[] $VALUES;
    public static final DirectoryServer Amex;
    private static final Set<String> CERTIFICATE_EXTENSIONS;
    public static final DirectoryServer CartesBancaires;
    public static final DirectoryServer Discover;
    public static final DirectoryServer Mastercard;
    public static final DirectoryServer TestEc;
    public static final DirectoryServer TestRsa;
    public static final DirectoryServer Visa;
    private final Algorithm algorithm;
    private final String fileName;
    private final List<String> ids;
    private final KeyUse keyUse;

    private static final /* synthetic */ DirectoryServer[] $values() {
        return new DirectoryServer[]{TestRsa, TestEc, Visa, Mastercard, Amex, Discover, CartesBancaires};
    }

    public static EnumEntries<DirectoryServer> getEntries() {
        return $ENTRIES;
    }

    public static DirectoryServer valueOf(String str) {
        return (DirectoryServer) Enum.valueOf(DirectoryServer.class, str);
    }

    public static DirectoryServer[] values() {
        return (DirectoryServer[]) $VALUES.clone();
    }

    private DirectoryServer(String str, int i, List list, Algorithm algorithm, String str2, KeyUse keyUse) {
        this.ids = list;
        this.algorithm = algorithm;
        this.fileName = str2;
        this.keyUse = keyUse;
    }

    public final List<String> getIds() {
        return this.ids;
    }

    public final Algorithm getAlgorithm() {
        return this.algorithm;
    }

    public final String getFileName() {
        return this.fileName;
    }

    /* synthetic */ DirectoryServer(String str, int i, List list, Algorithm algorithm, String str2, KeyUse keyUse, int i2, DefaultConstructorMarker defaultConstructorMarker) {
        this(str, i, list, algorithm, str2, (i2 & 8) != 0 ? KeyUse.SIGNATURE : keyUse);
    }

    public final KeyUse getKeyUse() {
        return this.keyUse;
    }

    static {
        List listListOf = CollectionsKt.listOf("F055545342");
        Algorithm algorithm = Algorithm.RSA;
        TestRsa = new DirectoryServer("TestRsa", 0, listListOf, algorithm, "ds-test-rsa.txt", null, 8, null);
        TestEc = new DirectoryServer("TestEc", 1, CollectionsKt.listOf("F155545342"), Algorithm.f6423EC, "ds-test-ec.txt", null, 8, null);
        int i = 8;
        DefaultConstructorMarker defaultConstructorMarker = null;
        KeyUse keyUse = null;
        Visa = new DirectoryServer("Visa", 2, CollectionsKt.listOf("A000000003"), algorithm, "ds-visa.crt", keyUse, i, defaultConstructorMarker);
        Mastercard = new DirectoryServer("Mastercard", 3, CollectionsKt.listOf("A000000004"), algorithm, "ds-mastercard.crt", keyUse, i, defaultConstructorMarker);
        Amex = new DirectoryServer("Amex", 4, CollectionsKt.listOf("A000000025"), algorithm, "ds-amex.pem", keyUse, i, defaultConstructorMarker);
        Discover = new DirectoryServer("Discover", 5, CollectionsKt.listOf((Object[]) new String[]{"A000000152", "A000000324"}), algorithm, "ds-discover.cer", null);
        CartesBancaires = new DirectoryServer("CartesBancaires", 6, CollectionsKt.listOf("A000000042"), algorithm, "ds-cartesbancaires.pem", keyUse, i, defaultConstructorMarker);
        DirectoryServer[] directoryServerArr$values = $values();
        $VALUES = directoryServerArr$values;
        $ENTRIES = EnumEntries2.enumEntries(directoryServerArr$values);
        INSTANCE = new Companion(null);
        CERTIFICATE_EXTENSIONS = SetsKt.setOf((Object[]) new String[]{".crt", ".cer", ".pem"});
    }

    public final boolean isCertificate() {
        Set<String> set = CERTIFICATE_EXTENSIONS;
        if ((set instanceof Collection) && set.isEmpty()) {
            return false;
        }
        Iterator<T> it = set.iterator();
        while (it.hasNext()) {
            if (StringsKt.endsWith$default(this.fileName, (String) it.next(), false, 2, (Object) null)) {
                return true;
            }
        }
        return false;
    }
}
