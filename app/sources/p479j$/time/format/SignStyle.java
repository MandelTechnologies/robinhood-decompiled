package p479j$.time.format;

import com.robinhood.android.transfers.contracts.transfercontext.TransferContext3;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* loaded from: classes29.dex */
public final class SignStyle {
    public static final SignStyle ALWAYS;
    public static final SignStyle EXCEEDS_PAD;
    public static final SignStyle NEVER;
    public static final SignStyle NORMAL;
    public static final SignStyle NOT_NEGATIVE;

    /* renamed from: a */
    public static final /* synthetic */ SignStyle[] f6822a;

    public static SignStyle valueOf(String str) {
        return (SignStyle) Enum.valueOf(SignStyle.class, str);
    }

    public static SignStyle[] values() {
        return (SignStyle[]) f6822a.clone();
    }

    static {
        SignStyle signStyle = new SignStyle(TransferContext3.NORMAL, 0);
        NORMAL = signStyle;
        SignStyle signStyle2 = new SignStyle("ALWAYS", 1);
        ALWAYS = signStyle2;
        SignStyle signStyle3 = new SignStyle("NEVER", 2);
        NEVER = signStyle3;
        SignStyle signStyle4 = new SignStyle("NOT_NEGATIVE", 3);
        NOT_NEGATIVE = signStyle4;
        SignStyle signStyle5 = new SignStyle("EXCEEDS_PAD", 4);
        EXCEEDS_PAD = signStyle5;
        f6822a = new SignStyle[]{signStyle, signStyle2, signStyle3, signStyle4, signStyle5};
    }
}
