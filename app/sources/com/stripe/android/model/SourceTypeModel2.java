package com.stripe.android.model;

import androidx.annotation.Keep;
import kotlin.Metadata;
import kotlin.enums.EnumEntries;
import kotlin.enums.EnumEntries2;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* compiled from: SourceTypeModel.kt */
@Metadata(m3635d1 = {"\u0000\u0012\n\u0000\n\u0002\u0010\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\r\b\u0086\u0081\u0002\u0018\u0000 \n2\b\u0012\u0004\u0012\u00020\u00020\u0001:\u0001\nB\u0011\b\u0002\u0012\u0006\u0010\u0004\u001a\u00020\u0003¢\u0006\u0004\b\u0005\u0010\u0006J\u000f\u0010\u0007\u001a\u00020\u0003H\u0017¢\u0006\u0004\b\u0007\u0010\bR\u0014\u0010\u0004\u001a\u00020\u00038\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0004\u0010\tj\u0002\b\u000bj\u0002\b\fj\u0002\b\rj\u0002\b\u000ej\u0002\b\u000f¨\u0006\u0010"}, m3636d2 = {"com/stripe/android/model/SourceTypeModel$Card$ThreeDSecureStatus", "", "Lcom/stripe/android/model/SourceTypeModel$Card$ThreeDSecureStatus;", "", "code", "<init>", "(Ljava/lang/String;ILjava/lang/String;)V", "toString", "()Ljava/lang/String;", "Ljava/lang/String;", "Companion", "Required", "Optional", "NotSupported", "Recommended", "Unknown", "payments-core_release"}, m3637k = 1, m3638mv = {1, 9, 0}, m3640xi = 48)
/* renamed from: com.stripe.android.model.SourceTypeModel$Card$ThreeDSecureStatus, reason: use source file name */
/* loaded from: classes15.dex */
public final class SourceTypeModel2 {
    private static final /* synthetic */ EnumEntries $ENTRIES;
    private static final /* synthetic */ SourceTypeModel2[] $VALUES;
    private final String code;
    public static final SourceTypeModel2 Required = new SourceTypeModel2("Required", 0, "required");
    public static final SourceTypeModel2 Optional = new SourceTypeModel2("Optional", 1, "optional");
    public static final SourceTypeModel2 NotSupported = new SourceTypeModel2("NotSupported", 2, "not_supported");
    public static final SourceTypeModel2 Recommended = new SourceTypeModel2("Recommended", 3, "recommended");
    public static final SourceTypeModel2 Unknown = new SourceTypeModel2("Unknown", 4, "unknown");

    private static final /* synthetic */ SourceTypeModel2[] $values() {
        return new SourceTypeModel2[]{Required, Optional, NotSupported, Recommended, Unknown};
    }

    public static EnumEntries<SourceTypeModel2> getEntries() {
        return $ENTRIES;
    }

    public static SourceTypeModel2 valueOf(String str) {
        return (SourceTypeModel2) Enum.valueOf(SourceTypeModel2.class, str);
    }

    public static SourceTypeModel2[] values() {
        return (SourceTypeModel2[]) $VALUES.clone();
    }

    private SourceTypeModel2(String str, int i, String str2) {
        this.code = str2;
    }

    static {
        SourceTypeModel2[] sourceTypeModel2Arr$values = $values();
        $VALUES = sourceTypeModel2Arr$values;
        $ENTRIES = EnumEntries2.enumEntries(sourceTypeModel2Arr$values);
        INSTANCE = new Companion(null);
    }

    @Override // java.lang.Enum
    @Keep
    public String toString() {
        return this.code;
    }
}
