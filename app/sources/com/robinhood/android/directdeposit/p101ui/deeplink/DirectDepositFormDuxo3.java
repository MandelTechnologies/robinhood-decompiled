package com.robinhood.android.directdeposit.p101ui.deeplink;

import com.robinhood.enums.RhEnum;
import com.robinhood.models.api.MarginCall;
import com.squareup.moshi.JsonClass;
import kotlin.Metadata;
import kotlin.enums.EnumEntries;
import kotlin.enums.EnumEntries2;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: DirectDepositFormDuxo.kt */
@JsonClass(generateAdapter = true)
@Metadata(m3635d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\f\b\u0007\u0018\u00002\u00020\u0001:\u0001\u0010B'\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0005\u0012\u0006\u0010\u0007\u001a\u00020\u0005¢\u0006\u0004\b\b\u0010\tR\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\u000bR\u0011\u0010\u0004\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\f\u0010\rR\u0011\u0010\u0006\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u000e\u0010\rR\u0011\u0010\u0007\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u000f\u0010\r¨\u0006\u0011"}, m3636d2 = {"Lcom/robinhood/android/directdeposit/ui/deeplink/ErrorResponse;", "", "type", "Lcom/robinhood/android/directdeposit/ui/deeplink/ErrorResponse$ErrorType;", "header", "", "subtitle", "button_copy", "<init>", "(Lcom/robinhood/android/directdeposit/ui/deeplink/ErrorResponse$ErrorType;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V", "getType", "()Lcom/robinhood/android/directdeposit/ui/deeplink/ErrorResponse$ErrorType;", "getHeader", "()Ljava/lang/String;", "getSubtitle", "getButton_copy", "ErrorType", "feature-direct-deposit_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
/* renamed from: com.robinhood.android.directdeposit.ui.deeplink.ErrorResponse, reason: use source file name */
/* loaded from: classes27.dex */
public final class DirectDepositFormDuxo3 {
    public static final int $stable = 0;
    private final String button_copy;
    private final String header;
    private final String subtitle;
    private final ErrorType type;

    public DirectDepositFormDuxo3(ErrorType type2, String header, String subtitle, String button_copy) {
        Intrinsics.checkNotNullParameter(type2, "type");
        Intrinsics.checkNotNullParameter(header, "header");
        Intrinsics.checkNotNullParameter(subtitle, "subtitle");
        Intrinsics.checkNotNullParameter(button_copy, "button_copy");
        this.type = type2;
        this.header = header;
        this.subtitle = subtitle;
        this.button_copy = button_copy;
    }

    public final ErrorType getType() {
        return this.type;
    }

    public final String getHeader() {
        return this.header;
    }

    public final String getSubtitle() {
        return this.subtitle;
    }

    public final String getButton_copy() {
        return this.button_copy;
    }

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    /* compiled from: DirectDepositFormDuxo.kt */
    @Metadata(m3635d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0000\n\u0002\u0010\u000e\n\u0002\b\b\b\u0086\u0081\u0002\u0018\u0000 \u000b2\b\u0012\u0004\u0012\u00020\u00000\u00012\b\u0012\u0004\u0012\u00020\u00000\u0002:\u0001\u000bB\u0011\b\u0002\u0012\u0006\u0010\u0003\u001a\u00020\u0004¢\u0006\u0004\b\u0005\u0010\u0006R\u0014\u0010\u0003\u001a\u00020\u0004X\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0007\u0010\bj\u0002\b\tj\u0002\b\n¨\u0006\f"}, m3636d2 = {"Lcom/robinhood/android/directdeposit/ui/deeplink/ErrorResponse$ErrorType;", "Lcom/robinhood/enums/RhEnum;", "", "serverValue", "", "<init>", "(Ljava/lang/String;ILjava/lang/String;)V", "getServerValue", "()Ljava/lang/String;", "INVALID", "EXPIRED", "Companion", "feature-direct-deposit_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    /* renamed from: com.robinhood.android.directdeposit.ui.deeplink.ErrorResponse$ErrorType */
    public static final class ErrorType implements RhEnum<ErrorType> {
        private static final /* synthetic */ EnumEntries $ENTRIES;
        private static final /* synthetic */ ErrorType[] $VALUES;
        private final String serverValue;
        public static final ErrorType INVALID = new ErrorType("INVALID", 0, "invalid");
        public static final ErrorType EXPIRED = new ErrorType("EXPIRED", 1, MarginCall.STATE_EXPIRED);

        private static final /* synthetic */ ErrorType[] $values() {
            return new ErrorType[]{INVALID, EXPIRED};
        }

        public static EnumEntries<ErrorType> getEntries() {
            return $ENTRIES;
        }

        private ErrorType(String str, int i, String str2) {
            this.serverValue = str2;
        }

        @Override // com.robinhood.enums.RhEnum
        public String getServerValue() {
            return this.serverValue;
        }

        static {
            ErrorType[] errorTypeArr$values = $values();
            $VALUES = errorTypeArr$values;
            $ENTRIES = EnumEntries2.enumEntries(errorTypeArr$values);
            INSTANCE = new Companion(null);
        }

        public static ErrorType valueOf(String str) {
            return (ErrorType) Enum.valueOf(ErrorType.class, str);
        }

        public static ErrorType[] values() {
            return (ErrorType[]) $VALUES.clone();
        }
    }
}
