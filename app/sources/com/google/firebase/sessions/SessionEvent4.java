package com.google.firebase.sessions;

import com.google.firebase.encoders.json.NumberedEnum;
import com.singular.sdk.internal.Constants;
import com.withpersona.sdk2.inquiry.network.dto.InquiryField;
import kotlin.Metadata;

/* compiled from: SessionEvent.kt */
@Metadata(m3635d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0006\b\u0080\u0001\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u00012\u00020\u0002B\u000f\b\u0002\u0012\u0006\u0010\u0003\u001a\u00020\u0004¢\u0006\u0002\u0010\u0005R\u0014\u0010\u0003\u001a\u00020\u0004X\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0007j\u0002\b\bj\u0002\b\t¨\u0006\n"}, m3636d2 = {"Lcom/google/firebase/sessions/EventType;", "", "Lcom/google/firebase/encoders/json/NumberedEnum;", InquiryField.FloatField.TYPE2, "", "(Ljava/lang/String;II)V", "getNumber", "()I", "EVENT_TYPE_UNKNOWN", Constants.API_TYPE_SESSION_START, "com.google.firebase-firebase-sessions"}, m3637k = 1, m3638mv = {1, 8, 0}, m3640xi = 48)
/* renamed from: com.google.firebase.sessions.EventType, reason: use source file name */
/* loaded from: classes.dex */
public enum SessionEvent4 implements NumberedEnum {
    EVENT_TYPE_UNKNOWN(0),
    SESSION_START(1);

    private final int number;

    SessionEvent4(int i) {
        this.number = i;
    }

    @Override // com.google.firebase.encoders.json.NumberedEnum
    public int getNumber() {
        return this.number;
    }
}
