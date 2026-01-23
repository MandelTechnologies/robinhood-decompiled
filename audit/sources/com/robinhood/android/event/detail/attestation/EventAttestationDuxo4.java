package com.robinhood.android.event.detail.attestation;

import com.robinhood.android.agreements.models.UiAgreementWithContent;
import com.robinhood.android.event.detail.attestation.EventAttestationDuxo5;
import com.robinhood.android.udf.StateProvider;
import kotlin.Metadata;
import kotlin.Result;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: EventAttestationDuxo.kt */
@Metadata(m3635d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\bÇ\u0002\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001B\t\b\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0010\u0010\u0006\u001a\u00020\u00032\u0006\u0010\u0007\u001a\u00020\u0002H\u0016¨\u0006\b"}, m3636d2 = {"Lcom/robinhood/android/event/detail/attestation/EventAttestationStateProvider;", "Lcom/robinhood/android/udf/StateProvider;", "Lcom/robinhood/android/event/detail/attestation/EventAttestationDataState;", "Lcom/robinhood/android/event/detail/attestation/EventAttestationViewState;", "<init>", "()V", "reduce", "dataState", "feature-event-detail_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
/* renamed from: com.robinhood.android.event.detail.attestation.EventAttestationStateProvider, reason: use source file name */
/* loaded from: classes3.dex */
public final class EventAttestationDuxo4 implements StateProvider<EventAttestationDataState, EventAttestationDuxo5> {
    public static final int $stable = 0;
    public static final EventAttestationDuxo4 INSTANCE = new EventAttestationDuxo4();

    private EventAttestationDuxo4() {
    }

    @Override // com.robinhood.android.udf.StateProvider
    public EventAttestationDuxo5 reduce(EventAttestationDataState dataState) {
        Intrinsics.checkNotNullParameter(dataState, "dataState");
        if (dataState.m14125getResultxLWZpok() == null) {
            return EventAttestationDuxo5.Loading.INSTANCE;
        }
        Throwable thM28553exceptionOrNullimpl = Result.m28553exceptionOrNullimpl(dataState.m14125getResultxLWZpok().getValue());
        if (thM28553exceptionOrNullimpl != null) {
            return new EventAttestationDuxo5.Error(thM28553exceptionOrNullimpl);
        }
        Object value = dataState.m14125getResultxLWZpok().getValue();
        if (Result.m28555isFailureimpl(value)) {
            value = null;
        }
        UiAgreementWithContent uiAgreementWithContent = (UiAgreementWithContent) value;
        if (uiAgreementWithContent != null) {
            return new EventAttestationDuxo5.Loaded(uiAgreementWithContent, dataState.getSigningAgreement());
        }
        return EventAttestationDuxo5.Loading.INSTANCE;
    }
}
