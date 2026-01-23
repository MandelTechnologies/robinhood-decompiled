package com.robinhood.shared.login.lib.p385ui;

import android.graphics.drawable.Drawable;
import com.robinhood.scarlet.util.resource.DirectResourceReference;
import com.robinhood.shared.app.type.AppType;
import com.robinhood.shared.login.lib.C39090R;
import com.robinhood.shared.login.lib.p385ui.BaseLoginViewState2;
import com.robinhood.shared.user.contracts.auth.UserCreationFlow;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: BaseLoginDataState.kt */
@Metadata(m3635d1 = {"\u0000R\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\r\n\u0002\u0010\u000e\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001B1\u0012\b\b\u0002\u0010\u0002\u001a\u00020\u0003\u0012\b\b\u0002\u0010\u0004\u001a\u00020\u0003\u0012\u0006\u0010\u0005\u001a\u00020\u0006\u0012\f\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\t0\b¢\u0006\u0004\b\n\u0010\u000bJ\t\u0010%\u001a\u00020\u0003HÆ\u0003J\t\u0010&\u001a\u00020\u0003HÂ\u0003J\t\u0010'\u001a\u00020\u0006HÂ\u0003J\u000f\u0010(\u001a\b\u0012\u0004\u0012\u00020\t0\bHÂ\u0003J7\u0010)\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00032\b\b\u0002\u0010\u0005\u001a\u00020\u00062\u000e\b\u0002\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\t0\bHÆ\u0001J\u0013\u0010*\u001a\u00020\u00032\b\u0010+\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010,\u001a\u00020\u000fHÖ\u0001J\t\u0010-\u001a\u00020.HÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0002\u0010\fR\u000e\u0010\u0004\u001a\u00020\u0003X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0005\u001a\u00020\u0006X\u0082\u0004¢\u0006\u0002\n\u0000R\u0014\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\t0\bX\u0082\u0004¢\u0006\u0002\n\u0000R\u0014\u0010\r\u001a\u00020\u00038BX\u0082\u0004¢\u0006\u0006\u001a\u0004\b\r\u0010\fR\u0011\u0010\u000e\u001a\u00020\u000f8G¢\u0006\u0006\u001a\u0004\b\u0010\u0010\u0011R\u0011\u0010\u0012\u001a\u00020\u00138F¢\u0006\u0006\u001a\u0004\b\u0014\u0010\u0015R\u0011\u0010\u0016\u001a\u00020\u00038F¢\u0006\u0006\u001a\u0004\b\u0016\u0010\fR\u0013\u0010\u0017\u001a\u0004\u0018\u00010\u00188F¢\u0006\u0006\u001a\u0004\b\u0019\u0010\u001aR\u0011\u0010\u001b\u001a\u00020\u001c8F¢\u0006\u0006\u001a\u0004\b\u001d\u0010\u001eR\u0011\u0010\u001f\u001a\u00020 8F¢\u0006\u0006\u001a\u0004\b!\u0010\"R\u0011\u0010#\u001a\u00020\u00038F¢\u0006\u0006\u001a\u0004\b$\u0010\f¨\u0006/"}, m3636d2 = {"Lcom/robinhood/shared/login/lib/ui/BaseLoginDataState;", "", "isLoading", "", "targetBackendIsApollo", "appType", "Lcom/robinhood/shared/app/type/AppType;", "logo", "Lcom/robinhood/scarlet/util/resource/DirectResourceReference;", "Landroid/graphics/drawable/Drawable;", "<init>", "(ZZLcom/robinhood/shared/app/type/AppType;Lcom/robinhood/scarlet/util/resource/DirectResourceReference;)V", "()Z", "isRhc", "helpButtonResId", "", "getHelpButtonResId", "()I", "userCreationFlow", "Lcom/robinhood/shared/user/contracts/auth/UserCreationFlow;", "getUserCreationFlow", "()Lcom/robinhood/shared/user/contracts/auth/UserCreationFlow;", "isAchromatic", BaseLoginComposable.SubTextTestTag, "Lcom/robinhood/shared/login/lib/ui/LoginSubtext;", "getSubtext", "()Lcom/robinhood/shared/login/lib/ui/LoginSubtext;", "header", "Lcom/robinhood/shared/login/lib/ui/LoginHeader;", "getHeader", "()Lcom/robinhood/shared/login/lib/ui/LoginHeader;", "genericLoginErrorResponseType", "Lcom/robinhood/shared/login/lib/ui/GenericLoginErrorResponseType;", "getGenericLoginErrorResponseType", "()Lcom/robinhood/shared/login/lib/ui/GenericLoginErrorResponseType;", "showSuvBottomSheet", "getShowSuvBottomSheet", "component1", "component2", "component3", "component4", "copy", "equals", "other", "hashCode", "toString", "", "feature-lib-login_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
/* loaded from: classes6.dex */
public final /* data */ class BaseLoginDataState {
    public static final int $stable = DirectResourceReference.$stable;
    private final AppType appType;
    private final boolean isLoading;
    private final DirectResourceReference<Drawable> logo;
    private final boolean targetBackendIsApollo;

    /* renamed from: component2, reason: from getter */
    private final boolean getTargetBackendIsApollo() {
        return this.targetBackendIsApollo;
    }

    /* renamed from: component3, reason: from getter */
    private final AppType getAppType() {
        return this.appType;
    }

    private final DirectResourceReference<Drawable> component4() {
        return this.logo;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ BaseLoginDataState copy$default(BaseLoginDataState baseLoginDataState, boolean z, boolean z2, AppType appType, DirectResourceReference directResourceReference, int i, Object obj) {
        if ((i & 1) != 0) {
            z = baseLoginDataState.isLoading;
        }
        if ((i & 2) != 0) {
            z2 = baseLoginDataState.targetBackendIsApollo;
        }
        if ((i & 4) != 0) {
            appType = baseLoginDataState.appType;
        }
        if ((i & 8) != 0) {
            directResourceReference = baseLoginDataState.logo;
        }
        return baseLoginDataState.copy(z, z2, appType, directResourceReference);
    }

    /* renamed from: component1, reason: from getter */
    public final boolean getIsLoading() {
        return this.isLoading;
    }

    public final BaseLoginDataState copy(boolean isLoading, boolean targetBackendIsApollo, AppType appType, DirectResourceReference<Drawable> logo) {
        Intrinsics.checkNotNullParameter(appType, "appType");
        Intrinsics.checkNotNullParameter(logo, "logo");
        return new BaseLoginDataState(isLoading, targetBackendIsApollo, appType, logo);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof BaseLoginDataState)) {
            return false;
        }
        BaseLoginDataState baseLoginDataState = (BaseLoginDataState) other;
        return this.isLoading == baseLoginDataState.isLoading && this.targetBackendIsApollo == baseLoginDataState.targetBackendIsApollo && this.appType == baseLoginDataState.appType && Intrinsics.areEqual(this.logo, baseLoginDataState.logo);
    }

    public int hashCode() {
        return (((((Boolean.hashCode(this.isLoading) * 31) + Boolean.hashCode(this.targetBackendIsApollo)) * 31) + this.appType.hashCode()) * 31) + this.logo.hashCode();
    }

    public final boolean isAchromatic() {
        return true;
    }

    public String toString() {
        return "BaseLoginDataState(isLoading=" + this.isLoading + ", targetBackendIsApollo=" + this.targetBackendIsApollo + ", appType=" + this.appType + ", logo=" + this.logo + ")";
    }

    public BaseLoginDataState(boolean z, boolean z2, AppType appType, DirectResourceReference<Drawable> logo) {
        Intrinsics.checkNotNullParameter(appType, "appType");
        Intrinsics.checkNotNullParameter(logo, "logo");
        this.isLoading = z;
        this.targetBackendIsApollo = z2;
        this.appType = appType;
        this.logo = logo;
    }

    public /* synthetic */ BaseLoginDataState(boolean z, boolean z2, AppType appType, DirectResourceReference directResourceReference, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? false : z, (i & 2) != 0 ? false : z2, appType, directResourceReference);
    }

    public final boolean isLoading() {
        return this.isLoading;
    }

    private final boolean isRhc() {
        return this.appType == AppType.RHC;
    }

    public final int getHelpButtonResId() {
        return isRhc() ? C39090R.string.login_get_help_action : C39090R.string.login_need_help_action;
    }

    public final UserCreationFlow getUserCreationFlow() {
        return isRhc() ? UserCreationFlow.RHC : UserCreationFlow.TRADER;
    }

    public final LoginSubtext getSubtext() {
        if (isRhc()) {
            return new LoginSubtext(C39090R.string.login_subtext_start, C39090R.string.login_subtext_end);
        }
        return null;
    }

    public final BaseLoginViewState2 getHeader() {
        if (isRhc()) {
            return new BaseLoginViewState2.Title(C39090R.string.login_title);
        }
        return new BaseLoginViewState2.Logo(this.logo.getResId());
    }

    public final LoginErrorHandler2 getGenericLoginErrorResponseType() {
        if (isRhc()) {
            return LoginErrorHandler2.CREATE_ACCOUNT;
        }
        return LoginErrorHandler2.DEFAULT;
    }

    public final boolean getShowSuvBottomSheet() {
        return this.appType == AppType.TRADER;
    }
}
