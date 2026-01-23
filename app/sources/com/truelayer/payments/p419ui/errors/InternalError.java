package com.truelayer.payments.p419ui.errors;

import kotlin.Metadata;
import kotlin.enums.EnumEntries;
import kotlin.enums.EnumEntries2;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* compiled from: InternalError.kt */
@Metadata(m3635d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\b\b\u0086\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\u000f\b\u0002\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0002\u0010\u0004J\u0006\u0010\u0005\u001a\u00020\u0006R\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004¢\u0006\u0002\n\u0000j\u0002\b\u0007j\u0002\b\bj\u0002\b\tj\u0002\b\nj\u0002\b\u000bj\u0002\b\fj\u0002\b\r¨\u0006\u000e"}, m3636d2 = {"Lcom/truelayer/payments/ui/errors/InternalError;", "", "code", "", "(Ljava/lang/String;II)V", "getErrorCode", "", "FlowCoordinatorInternalInconsistency", "ResponseValidationUnableToParseResponse", "ActivityNotFound", "FlowCoordinatorInternalInconsistencyWait", "AuthorizationFlowHasNoActions", "UnsupportedUseCase", "UnsupportedPaymentMethod", "payments-ui_release"}, m3637k = 1, m3638mv = {1, 9, 0}, m3640xi = 48)
/* loaded from: classes12.dex */
public final class InternalError {
    private static final /* synthetic */ EnumEntries $ENTRIES;
    private static final /* synthetic */ InternalError[] $VALUES;
    private final int code;
    public static final InternalError FlowCoordinatorInternalInconsistency = new InternalError("FlowCoordinatorInternalInconsistency", 0, 1);
    public static final InternalError ResponseValidationUnableToParseResponse = new InternalError("ResponseValidationUnableToParseResponse", 1, 2);
    public static final InternalError ActivityNotFound = new InternalError("ActivityNotFound", 2, 3);
    public static final InternalError FlowCoordinatorInternalInconsistencyWait = new InternalError("FlowCoordinatorInternalInconsistencyWait", 3, 4);
    public static final InternalError AuthorizationFlowHasNoActions = new InternalError("AuthorizationFlowHasNoActions", 4, 5);
    public static final InternalError UnsupportedUseCase = new InternalError("UnsupportedUseCase", 5, 6);
    public static final InternalError UnsupportedPaymentMethod = new InternalError("UnsupportedPaymentMethod", 6, 7);

    private static final /* synthetic */ InternalError[] $values() {
        return new InternalError[]{FlowCoordinatorInternalInconsistency, ResponseValidationUnableToParseResponse, ActivityNotFound, FlowCoordinatorInternalInconsistencyWait, AuthorizationFlowHasNoActions, UnsupportedUseCase, UnsupportedPaymentMethod};
    }

    public static EnumEntries<InternalError> getEntries() {
        return $ENTRIES;
    }

    public static InternalError valueOf(String str) {
        return (InternalError) Enum.valueOf(InternalError.class, str);
    }

    public static InternalError[] values() {
        return (InternalError[]) $VALUES.clone();
    }

    private InternalError(String str, int i, int i2) {
        this.code = i2;
    }

    static {
        InternalError[] internalErrorArr$values = $values();
        $VALUES = internalErrorArr$values;
        $ENTRIES = EnumEntries2.enumEntries(internalErrorArr$values);
    }

    public final String getErrorCode() {
        return "UI-" + this.code;
    }
}
