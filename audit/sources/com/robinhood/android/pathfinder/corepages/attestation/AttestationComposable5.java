package com.robinhood.android.pathfinder.corepages.attestation;

import kotlin.Metadata;
import kotlin.enums.EnumEntries;
import kotlin.enums.EnumEntries2;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* compiled from: AttestationComposable.kt */
@Metadata(m3635d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\u0005\b\u0082\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003j\u0002\b\u0004j\u0002\b\u0005¨\u0006\u0006"}, m3636d2 = {"Lcom/robinhood/android/pathfinder/corepages/attestation/ContentType;", "", "<init>", "(Ljava/lang/String;I)V", "Heading", "Agreement", "feature-pathfinder-core-pages_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
/* renamed from: com.robinhood.android.pathfinder.corepages.attestation.ContentType, reason: use source file name */
/* loaded from: classes11.dex */
final class AttestationComposable5 {
    private static final /* synthetic */ EnumEntries $ENTRIES;
    private static final /* synthetic */ AttestationComposable5[] $VALUES;
    public static final AttestationComposable5 Heading = new AttestationComposable5("Heading", 0);
    public static final AttestationComposable5 Agreement = new AttestationComposable5("Agreement", 1);

    private static final /* synthetic */ AttestationComposable5[] $values() {
        return new AttestationComposable5[]{Heading, Agreement};
    }

    public static EnumEntries<AttestationComposable5> getEntries() {
        return $ENTRIES;
    }

    private AttestationComposable5(String str, int i) {
    }

    static {
        AttestationComposable5[] attestationComposable5Arr$values = $values();
        $VALUES = attestationComposable5Arr$values;
        $ENTRIES = EnumEntries2.enumEntries(attestationComposable5Arr$values);
    }

    public static AttestationComposable5 valueOf(String str) {
        return (AttestationComposable5) Enum.valueOf(AttestationComposable5.class, str);
    }

    public static AttestationComposable5[] values() {
        return (AttestationComposable5[]) $VALUES.clone();
    }
}
