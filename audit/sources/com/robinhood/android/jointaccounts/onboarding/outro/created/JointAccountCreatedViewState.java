package com.robinhood.android.jointaccounts.onboarding.outro.created;

import bonfire.proto.idl.joint_accounts_onboarding.p035v1.FetchJointAccountCreatedResponseDto;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: JointAccountCreatedViewState.kt */
@Metadata(m3635d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\n\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005¢\u0006\u0004\b\u0006\u0010\u0007J\t\u0010\f\u001a\u00020\u0003HÆ\u0003J\t\u0010\r\u001a\u00020\u0005HÆ\u0003J\u001d\u0010\u000e\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u0005HÆ\u0001J\u0013\u0010\u000f\u001a\u00020\u00102\b\u0010\u0011\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u0012\u001a\u00020\u0013HÖ\u0001J\t\u0010\u0014\u001a\u00020\u0005HÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\b\u0010\tR\u0011\u0010\u0004\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\u000b¨\u0006\u0015"}, m3636d2 = {"Lcom/robinhood/android/jointaccounts/onboarding/outro/created/JointAccountCreatedViewState;", "", "response", "Lbonfire/proto/idl/joint_accounts_onboarding/v1/FetchJointAccountCreatedResponseDto;", "source", "", "<init>", "(Lbonfire/proto/idl/joint_accounts_onboarding/v1/FetchJointAccountCreatedResponseDto;Ljava/lang/String;)V", "getResponse", "()Lbonfire/proto/idl/joint_accounts_onboarding/v1/FetchJointAccountCreatedResponseDto;", "getSource", "()Ljava/lang/String;", "component1", "component2", "copy", "equals", "", "other", "hashCode", "", "toString", "feature-joint-account-onboarding_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
/* loaded from: classes10.dex */
public final /* data */ class JointAccountCreatedViewState {
    public static final int $stable = 8;
    private final FetchJointAccountCreatedResponseDto response;
    private final String source;

    public static /* synthetic */ JointAccountCreatedViewState copy$default(JointAccountCreatedViewState jointAccountCreatedViewState, FetchJointAccountCreatedResponseDto fetchJointAccountCreatedResponseDto, String str, int i, Object obj) {
        if ((i & 1) != 0) {
            fetchJointAccountCreatedResponseDto = jointAccountCreatedViewState.response;
        }
        if ((i & 2) != 0) {
            str = jointAccountCreatedViewState.source;
        }
        return jointAccountCreatedViewState.copy(fetchJointAccountCreatedResponseDto, str);
    }

    /* renamed from: component1, reason: from getter */
    public final FetchJointAccountCreatedResponseDto getResponse() {
        return this.response;
    }

    /* renamed from: component2, reason: from getter */
    public final String getSource() {
        return this.source;
    }

    public final JointAccountCreatedViewState copy(FetchJointAccountCreatedResponseDto response, String source) {
        Intrinsics.checkNotNullParameter(response, "response");
        Intrinsics.checkNotNullParameter(source, "source");
        return new JointAccountCreatedViewState(response, source);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof JointAccountCreatedViewState)) {
            return false;
        }
        JointAccountCreatedViewState jointAccountCreatedViewState = (JointAccountCreatedViewState) other;
        return Intrinsics.areEqual(this.response, jointAccountCreatedViewState.response) && Intrinsics.areEqual(this.source, jointAccountCreatedViewState.source);
    }

    public int hashCode() {
        return (this.response.hashCode() * 31) + this.source.hashCode();
    }

    public String toString() {
        return "JointAccountCreatedViewState(response=" + this.response + ", source=" + this.source + ")";
    }

    public JointAccountCreatedViewState(FetchJointAccountCreatedResponseDto response, String source) {
        Intrinsics.checkNotNullParameter(response, "response");
        Intrinsics.checkNotNullParameter(source, "source");
        this.response = response;
        this.source = source;
    }

    public final FetchJointAccountCreatedResponseDto getResponse() {
        return this.response;
    }

    public final String getSource() {
        return this.source;
    }
}
