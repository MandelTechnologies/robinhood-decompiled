package com.robinhood.shared.login.lib.p385ui;

import com.robinhood.shared.user.contracts.auth.UserCreationFlow;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: BaseLoginViewState.kt */
@Metadata(m3635d1 = {"\u00008\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u001c\n\u0002\u0010\u000e\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001BK\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0003\u0012\u0006\u0010\u0007\u001a\u00020\b\u0012\b\u0010\t\u001a\u0004\u0018\u00010\n\u0012\b\b\u0001\u0010\u000b\u001a\u00020\f\u0012\u0006\u0010\r\u001a\u00020\u000e\u0012\u0006\u0010\u000f\u001a\u00020\u0003¢\u0006\u0004\b\u0010\u0010\u0011J\t\u0010\u001e\u001a\u00020\u0003HÆ\u0003J\t\u0010\u001f\u001a\u00020\u0005HÆ\u0003J\t\u0010 \u001a\u00020\u0003HÆ\u0003J\t\u0010!\u001a\u00020\bHÆ\u0003J\u000b\u0010\"\u001a\u0004\u0018\u00010\nHÆ\u0003J\t\u0010#\u001a\u00020\fHÆ\u0003J\t\u0010$\u001a\u00020\u000eHÆ\u0003J\t\u0010%\u001a\u00020\u0003HÆ\u0003J[\u0010&\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00052\b\b\u0002\u0010\u0006\u001a\u00020\u00032\b\b\u0002\u0010\u0007\u001a\u00020\b2\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\n2\b\b\u0003\u0010\u000b\u001a\u00020\f2\b\b\u0002\u0010\r\u001a\u00020\u000e2\b\b\u0002\u0010\u000f\u001a\u00020\u0003HÆ\u0001J\u0013\u0010'\u001a\u00020\u00032\b\u0010(\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010)\u001a\u00020\fHÖ\u0001J\t\u0010*\u001a\u00020+HÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0002\u0010\u0012R\u0011\u0010\u0004\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u0013\u0010\u0014R\u0011\u0010\u0006\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0012R\u0011\u0010\u0007\u001a\u00020\b¢\u0006\b\n\u0000\u001a\u0004\b\u0015\u0010\u0016R\u0013\u0010\t\u001a\u0004\u0018\u00010\n¢\u0006\b\n\u0000\u001a\u0004\b\u0017\u0010\u0018R\u0011\u0010\u000b\u001a\u00020\f¢\u0006\b\n\u0000\u001a\u0004\b\u0019\u0010\u001aR\u0011\u0010\r\u001a\u00020\u000e¢\u0006\b\n\u0000\u001a\u0004\b\u001b\u0010\u001cR\u0011\u0010\u000f\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u001d\u0010\u0012¨\u0006,"}, m3636d2 = {"Lcom/robinhood/shared/login/lib/ui/BaseLoginViewState;", "", "isLoading", "", "genericResponseType", "Lcom/robinhood/shared/login/lib/ui/GenericLoginErrorResponseType;", "isAchromatic", "header", "Lcom/robinhood/shared/login/lib/ui/LoginHeader;", BaseLoginComposable.SubTextTestTag, "Lcom/robinhood/shared/login/lib/ui/LoginSubtext;", "helpButtonTextResId", "", "userCreationFlow", "Lcom/robinhood/shared/user/contracts/auth/UserCreationFlow;", "showSuvBottomSheet", "<init>", "(ZLcom/robinhood/shared/login/lib/ui/GenericLoginErrorResponseType;ZLcom/robinhood/shared/login/lib/ui/LoginHeader;Lcom/robinhood/shared/login/lib/ui/LoginSubtext;ILcom/robinhood/shared/user/contracts/auth/UserCreationFlow;Z)V", "()Z", "getGenericResponseType", "()Lcom/robinhood/shared/login/lib/ui/GenericLoginErrorResponseType;", "getHeader", "()Lcom/robinhood/shared/login/lib/ui/LoginHeader;", "getSubtext", "()Lcom/robinhood/shared/login/lib/ui/LoginSubtext;", "getHelpButtonTextResId", "()I", "getUserCreationFlow", "()Lcom/robinhood/shared/user/contracts/auth/UserCreationFlow;", "getShowSuvBottomSheet", "component1", "component2", "component3", "component4", "component5", "component6", "component7", "component8", "copy", "equals", "other", "hashCode", "toString", "", "feature-lib-login_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
/* loaded from: classes6.dex */
public final /* data */ class BaseLoginViewState {
    public static final int $stable = 0;
    private final LoginErrorHandler2 genericResponseType;
    private final BaseLoginViewState2 header;
    private final int helpButtonTextResId;
    private final boolean isAchromatic;
    private final boolean isLoading;
    private final boolean showSuvBottomSheet;
    private final LoginSubtext subtext;
    private final UserCreationFlow userCreationFlow;

    public static /* synthetic */ BaseLoginViewState copy$default(BaseLoginViewState baseLoginViewState, boolean z, LoginErrorHandler2 loginErrorHandler2, boolean z2, BaseLoginViewState2 baseLoginViewState2, LoginSubtext loginSubtext, int i, UserCreationFlow userCreationFlow, boolean z3, int i2, Object obj) {
        if ((i2 & 1) != 0) {
            z = baseLoginViewState.isLoading;
        }
        if ((i2 & 2) != 0) {
            loginErrorHandler2 = baseLoginViewState.genericResponseType;
        }
        if ((i2 & 4) != 0) {
            z2 = baseLoginViewState.isAchromatic;
        }
        if ((i2 & 8) != 0) {
            baseLoginViewState2 = baseLoginViewState.header;
        }
        if ((i2 & 16) != 0) {
            loginSubtext = baseLoginViewState.subtext;
        }
        if ((i2 & 32) != 0) {
            i = baseLoginViewState.helpButtonTextResId;
        }
        if ((i2 & 64) != 0) {
            userCreationFlow = baseLoginViewState.userCreationFlow;
        }
        if ((i2 & 128) != 0) {
            z3 = baseLoginViewState.showSuvBottomSheet;
        }
        UserCreationFlow userCreationFlow2 = userCreationFlow;
        boolean z4 = z3;
        LoginSubtext loginSubtext2 = loginSubtext;
        int i3 = i;
        return baseLoginViewState.copy(z, loginErrorHandler2, z2, baseLoginViewState2, loginSubtext2, i3, userCreationFlow2, z4);
    }

    /* renamed from: component1, reason: from getter */
    public final boolean getIsLoading() {
        return this.isLoading;
    }

    /* renamed from: component2, reason: from getter */
    public final LoginErrorHandler2 getGenericResponseType() {
        return this.genericResponseType;
    }

    /* renamed from: component3, reason: from getter */
    public final boolean getIsAchromatic() {
        return this.isAchromatic;
    }

    /* renamed from: component4, reason: from getter */
    public final BaseLoginViewState2 getHeader() {
        return this.header;
    }

    /* renamed from: component5, reason: from getter */
    public final LoginSubtext getSubtext() {
        return this.subtext;
    }

    /* renamed from: component6, reason: from getter */
    public final int getHelpButtonTextResId() {
        return this.helpButtonTextResId;
    }

    /* renamed from: component7, reason: from getter */
    public final UserCreationFlow getUserCreationFlow() {
        return this.userCreationFlow;
    }

    /* renamed from: component8, reason: from getter */
    public final boolean getShowSuvBottomSheet() {
        return this.showSuvBottomSheet;
    }

    public final BaseLoginViewState copy(boolean isLoading, LoginErrorHandler2 genericResponseType, boolean isAchromatic, BaseLoginViewState2 header, LoginSubtext subtext, int helpButtonTextResId, UserCreationFlow userCreationFlow, boolean showSuvBottomSheet) {
        Intrinsics.checkNotNullParameter(genericResponseType, "genericResponseType");
        Intrinsics.checkNotNullParameter(header, "header");
        Intrinsics.checkNotNullParameter(userCreationFlow, "userCreationFlow");
        return new BaseLoginViewState(isLoading, genericResponseType, isAchromatic, header, subtext, helpButtonTextResId, userCreationFlow, showSuvBottomSheet);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof BaseLoginViewState)) {
            return false;
        }
        BaseLoginViewState baseLoginViewState = (BaseLoginViewState) other;
        return this.isLoading == baseLoginViewState.isLoading && this.genericResponseType == baseLoginViewState.genericResponseType && this.isAchromatic == baseLoginViewState.isAchromatic && Intrinsics.areEqual(this.header, baseLoginViewState.header) && Intrinsics.areEqual(this.subtext, baseLoginViewState.subtext) && this.helpButtonTextResId == baseLoginViewState.helpButtonTextResId && this.userCreationFlow == baseLoginViewState.userCreationFlow && this.showSuvBottomSheet == baseLoginViewState.showSuvBottomSheet;
    }

    public int hashCode() {
        int iHashCode = ((((((Boolean.hashCode(this.isLoading) * 31) + this.genericResponseType.hashCode()) * 31) + Boolean.hashCode(this.isAchromatic)) * 31) + this.header.hashCode()) * 31;
        LoginSubtext loginSubtext = this.subtext;
        return ((((((iHashCode + (loginSubtext == null ? 0 : loginSubtext.hashCode())) * 31) + Integer.hashCode(this.helpButtonTextResId)) * 31) + this.userCreationFlow.hashCode()) * 31) + Boolean.hashCode(this.showSuvBottomSheet);
    }

    public String toString() {
        return "BaseLoginViewState(isLoading=" + this.isLoading + ", genericResponseType=" + this.genericResponseType + ", isAchromatic=" + this.isAchromatic + ", header=" + this.header + ", subtext=" + this.subtext + ", helpButtonTextResId=" + this.helpButtonTextResId + ", userCreationFlow=" + this.userCreationFlow + ", showSuvBottomSheet=" + this.showSuvBottomSheet + ")";
    }

    public BaseLoginViewState(boolean z, LoginErrorHandler2 genericResponseType, boolean z2, BaseLoginViewState2 header, LoginSubtext loginSubtext, int i, UserCreationFlow userCreationFlow, boolean z3) {
        Intrinsics.checkNotNullParameter(genericResponseType, "genericResponseType");
        Intrinsics.checkNotNullParameter(header, "header");
        Intrinsics.checkNotNullParameter(userCreationFlow, "userCreationFlow");
        this.isLoading = z;
        this.genericResponseType = genericResponseType;
        this.isAchromatic = z2;
        this.header = header;
        this.subtext = loginSubtext;
        this.helpButtonTextResId = i;
        this.userCreationFlow = userCreationFlow;
        this.showSuvBottomSheet = z3;
    }

    public final boolean isLoading() {
        return this.isLoading;
    }

    public final LoginErrorHandler2 getGenericResponseType() {
        return this.genericResponseType;
    }

    public final boolean isAchromatic() {
        return this.isAchromatic;
    }

    public final BaseLoginViewState2 getHeader() {
        return this.header;
    }

    public final LoginSubtext getSubtext() {
        return this.subtext;
    }

    public final int getHelpButtonTextResId() {
        return this.helpButtonTextResId;
    }

    public final UserCreationFlow getUserCreationFlow() {
        return this.userCreationFlow;
    }

    public final boolean getShowSuvBottomSheet() {
        return this.showSuvBottomSheet;
    }
}
