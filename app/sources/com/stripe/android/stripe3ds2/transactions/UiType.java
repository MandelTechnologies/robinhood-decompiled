package com.stripe.android.stripe3ds2.transactions;

import java.util.Iterator;
import kotlin.Metadata;
import kotlin.enums.EnumEntries;
import kotlin.enums.EnumEntries2;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* compiled from: UiType.kt */
@Metadata(m3635d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u000b\n\u0002\b\f\b\u0086\u0081\u0002\u0018\u0000 \u00102\b\u0012\u0004\u0012\u00020\u00000\u0001:\u0001\u0010B\u0017\b\u0002\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005¢\u0006\u0002\u0010\u0006R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0007\u0010\bR\u0014\u0010\u0004\u001a\u00020\u0005X\u0080\u0004¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\nj\u0002\b\u000bj\u0002\b\fj\u0002\b\rj\u0002\b\u000ej\u0002\b\u000f¨\u0006\u0011"}, m3636d2 = {"Lcom/stripe/android/stripe3ds2/transactions/UiType;", "", "code", "", "requiresSubmitButton", "", "(Ljava/lang/String;ILjava/lang/String;Z)V", "getCode", "()Ljava/lang/String;", "getRequiresSubmitButton$3ds2sdk_release", "()Z", "Text", "SingleSelect", "MultiSelect", "OutOfBand", "Html", "Companion", "3ds2sdk_release"}, m3637k = 1, m3638mv = {1, 9, 0}, m3640xi = 48)
/* loaded from: classes26.dex */
public final class UiType {
    private static final /* synthetic */ EnumEntries $ENTRIES;
    private static final /* synthetic */ UiType[] $VALUES;

    /* renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE;
    private final String code;
    private final boolean requiresSubmitButton;
    public static final UiType Text = new UiType("Text", 0, "01", true);
    public static final UiType SingleSelect = new UiType("SingleSelect", 1, "02", true);
    public static final UiType MultiSelect = new UiType("MultiSelect", 2, "03", true);
    public static final UiType OutOfBand = new UiType("OutOfBand", 3, "04", false);
    public static final UiType Html = new UiType("Html", 4, "05", false);

    private static final /* synthetic */ UiType[] $values() {
        return new UiType[]{Text, SingleSelect, MultiSelect, OutOfBand, Html};
    }

    public static EnumEntries<UiType> getEntries() {
        return $ENTRIES;
    }

    public static UiType valueOf(String str) {
        return (UiType) Enum.valueOf(UiType.class, str);
    }

    public static UiType[] values() {
        return (UiType[]) $VALUES.clone();
    }

    private UiType(String str, int i, String str2, boolean z) {
        this.code = str2;
        this.requiresSubmitButton = z;
    }

    public final String getCode() {
        return this.code;
    }

    /* renamed from: getRequiresSubmitButton$3ds2sdk_release, reason: from getter */
    public final boolean getRequiresSubmitButton() {
        return this.requiresSubmitButton;
    }

    static {
        UiType[] uiTypeArr$values = $values();
        $VALUES = uiTypeArr$values;
        $ENTRIES = EnumEntries2.enumEntries(uiTypeArr$values);
        INSTANCE = new Companion(null);
    }

    /* compiled from: UiType.kt */
    @Metadata(m3635d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\b\u0080\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J\u0019\u0010\u0003\u001a\u0004\u0018\u00010\u00042\b\u0010\u0005\u001a\u0004\u0018\u00010\u0006H\u0000¢\u0006\u0002\b\u0007¨\u0006\b"}, m3636d2 = {"Lcom/stripe/android/stripe3ds2/transactions/UiType$Companion;", "", "()V", "fromCode", "Lcom/stripe/android/stripe3ds2/transactions/UiType;", "code", "", "fromCode$3ds2sdk_release", "3ds2sdk_release"}, m3637k = 1, m3638mv = {1, 9, 0}, m3640xi = 48)
    @SourceDebugExtension
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Companion() {
        }

        public final UiType fromCode$3ds2sdk_release(String code) {
            UiType next;
            Iterator<UiType> it = UiType.getEntries().iterator();
            while (true) {
                if (!it.hasNext()) {
                    next = null;
                    break;
                }
                next = it.next();
                if (Intrinsics.areEqual(code, next.getCode())) {
                    break;
                }
            }
            return next;
        }
    }
}
