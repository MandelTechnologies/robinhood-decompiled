package com.robinhood.android.event.detail.attestation;

import com.robinhood.android.agreements.models.UiAgreementWithContent;
import kotlin.Metadata;
import kotlin.Result;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: EventAttestationDuxo.kt */
@Metadata(m3635d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\r\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001B#\u0012\u0010\b\u0002\u0010\u0002\u001a\n\u0012\u0004\u0012\u00020\u0004\u0018\u00010\u0003\u0012\b\b\u0002\u0010\u0005\u001a\u00020\u0006¢\u0006\u0004\b\u0007\u0010\bJ\u0016\u0010\r\u001a\n\u0012\u0004\u0012\u00020\u0004\u0018\u00010\u0003HÆ\u0003¢\u0006\u0002\b\u000eJ\t\u0010\u000f\u001a\u00020\u0006HÆ\u0003J%\u0010\u0010\u001a\u00020\u00002\u0010\b\u0002\u0010\u0002\u001a\n\u0012\u0004\u0012\u00020\u0004\u0018\u00010\u00032\b\b\u0002\u0010\u0005\u001a\u00020\u0006HÆ\u0001J\u0013\u0010\u0011\u001a\u00020\u00062\b\u0010\u0012\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u0013\u001a\u00020\u0014HÖ\u0001J\t\u0010\u0015\u001a\u00020\u0016HÖ\u0001R\u0019\u0010\u0002\u001a\n\u0012\u0004\u0012\u00020\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\nR\u0011\u0010\u0005\u001a\u00020\u0006¢\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\f¨\u0006\u0017"}, m3636d2 = {"Lcom/robinhood/android/event/detail/attestation/EventAttestationDataState;", "", "result", "Lkotlin/Result;", "Lcom/robinhood/android/agreements/models/UiAgreementWithContent;", "signingAgreement", "", "<init>", "(Lkotlin/Result;Z)V", "getResult-xLWZpok", "()Lkotlin/Result;", "getSigningAgreement", "()Z", "component1", "component1-xLWZpok", "component2", "copy", "equals", "other", "hashCode", "", "toString", "", "feature-event-detail_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
/* loaded from: classes3.dex */
public final /* data */ class EventAttestationDataState {
    public static final int $stable = 8;
    private final Result<UiAgreementWithContent> result;
    private final boolean signingAgreement;

    /* JADX WARN: Multi-variable type inference failed */
    public EventAttestationDataState() {
        this(null, false, 3, 0 == true ? 1 : 0);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ EventAttestationDataState copy$default(EventAttestationDataState eventAttestationDataState, Result result, boolean z, int i, Object obj) {
        if ((i & 1) != 0) {
            result = eventAttestationDataState.result;
        }
        if ((i & 2) != 0) {
            z = eventAttestationDataState.signingAgreement;
        }
        return eventAttestationDataState.copy(result, z);
    }

    /* renamed from: component1-xLWZpok, reason: not valid java name */
    public final Result<UiAgreementWithContent> m14124component1xLWZpok() {
        return this.result;
    }

    /* renamed from: component2, reason: from getter */
    public final boolean getSigningAgreement() {
        return this.signingAgreement;
    }

    public final EventAttestationDataState copy(Result<UiAgreementWithContent> result, boolean signingAgreement) {
        return new EventAttestationDataState(result, signingAgreement);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof EventAttestationDataState)) {
            return false;
        }
        EventAttestationDataState eventAttestationDataState = (EventAttestationDataState) other;
        return Intrinsics.areEqual(this.result, eventAttestationDataState.result) && this.signingAgreement == eventAttestationDataState.signingAgreement;
    }

    public int hashCode() {
        Result<UiAgreementWithContent> result = this.result;
        return ((result == null ? 0 : Result.m28554hashCodeimpl(result.getValue())) * 31) + Boolean.hashCode(this.signingAgreement);
    }

    public String toString() {
        return "EventAttestationDataState(result=" + this.result + ", signingAgreement=" + this.signingAgreement + ")";
    }

    public EventAttestationDataState(Result<UiAgreementWithContent> result, boolean z) {
        this.result = result;
        this.signingAgreement = z;
    }

    public /* synthetic */ EventAttestationDataState(Result result, boolean z, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? null : result, (i & 2) != 0 ? false : z);
    }

    /* renamed from: getResult-xLWZpok, reason: not valid java name */
    public final Result<UiAgreementWithContent> m14125getResultxLWZpok() {
        return this.result;
    }

    public final boolean getSigningAgreement() {
        return this.signingAgreement;
    }
}
