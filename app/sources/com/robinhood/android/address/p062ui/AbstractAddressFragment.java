package com.robinhood.android.address.p062ui;

import android.content.res.Resources;
import android.view.View;
import androidx.appcompat.app.ActionBar;
import com.robinhood.analytics.AnalyticsLogger;
import com.robinhood.android.common.p088ui.BaseActivity;
import com.robinhood.android.common.p088ui.BaseFragment;
import com.robinhood.android.common.p088ui.view.RhToolbar;
import com.robinhood.android.common.util.extensions.ErrorResponses;
import com.robinhood.android.common.util.extensions.Views;
import com.robinhood.android.designsystem.C13997R;
import com.robinhood.android.designsystem.button.RdsButton;
import com.robinhood.librobinhood.data.store.UserInfoStore;
import com.robinhood.librobinhood.data.store.identi.AddressStore;
import com.robinhood.librobinhood.data.store.identi.ProfileInfoStore;
import com.robinhood.models.api.ErrorResponse;
import com.robinhood.shared.store.user.UserStore;
import com.robinhood.utils.Preconditions;
import kotlin.Deprecated;
import kotlin.ExceptionsH;
import kotlin.Metadata;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: AbstractAddressFragment.kt */
@Metadata(m3635d1 = {"\u0000\u0082\u0001\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\b\n\u0002\u0010\u0003\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0011\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\b'\u0018\u00002\u00020\u0001B\u0011\u0012\b\b\u0001\u0010\u0002\u001a\u00020\u0003¢\u0006\u0004\b\u0004\u0010\u0005B\t\b\u0016¢\u0006\u0004\b\u0004\u0010\u0006J\u0010\u0010)\u001a\u00020*2\u0006\u0010+\u001a\u00020,H\u0016J\u0010\u0010-\u001a\u00020*2\u0006\u0010.\u001a\u00020/H\u0004J\u0010\u00100\u001a\u00020*2\u0006\u00101\u001a\u00020/H\u0004J\u001b\u00102\u001a\u00020*\"\u0004\b\u0000\u001032\u0006\u00104\u001a\u0002H3H\u0004¢\u0006\u0002\u00105J\u0010\u00106\u001a\u00020*2\u0006\u00107\u001a\u000208H&J&\u00109\u001a\b\u0012\u0004\u0012\u0002H30:\"\u0004\b\u0000\u001032\u0012\u0010;\u001a\u000e\u0012\u0004\u0012\u00020=\u0012\u0004\u0012\u00020/0<J3\u0010>\u001a\b\u0012\u0004\u0012\u0002H30:\"\u0004\b\u0000\u001032\f\u0010?\u001a\b\u0012\u0004\u0012\u00020A0@2\f\u0010B\u001a\b\u0012\u0004\u0012\u00020C0@¢\u0006\u0002\u0010DJ\"\u0010>\u001a\b\u0012\u0004\u0012\u0002H30:\"\u0004\b\u0000\u001032\u0006\u0010E\u001a\u00020A2\u0006\u0010F\u001a\u00020CR\u001e\u0010\u0007\u001a\u00020\b8\u0006@\u0006X\u0087.¢\u0006\u000e\n\u0000\u001a\u0004\b\t\u0010\n\"\u0004\b\u000b\u0010\fR\u001e\u0010\r\u001a\u00020\u000e8\u0006@\u0006X\u0087.¢\u0006\u000e\n\u0000\u001a\u0004\b\u000f\u0010\u0010\"\u0004\b\u0011\u0010\u0012R\u001e\u0010\u0013\u001a\u00020\u00148\u0006@\u0006X\u0087.¢\u0006\u000e\n\u0000\u001a\u0004\b\u0015\u0010\u0016\"\u0004\b\u0017\u0010\u0018R\u001e\u0010\u0019\u001a\u00020\u001a8G@\u0006X\u0087.¢\u0006\u000e\n\u0000\u001a\u0004\b\u001b\u0010\u001c\"\u0004\b\u001d\u0010\u001eR\u001e\u0010\u001f\u001a\u00020 8\u0006@\u0006X\u0087.¢\u0006\u000e\n\u0000\u001a\u0004\b!\u0010\"\"\u0004\b#\u0010$R\u0014\u0010%\u001a\u0004\u0018\u00010&X¤\u0004¢\u0006\u0006\u001a\u0004\b'\u0010(¨\u0006G"}, m3636d2 = {"Lcom/robinhood/android/address/ui/AbstractAddressFragment;", "Lcom/robinhood/android/common/ui/BaseFragment;", "layoutRes", "", "<init>", "(I)V", "()V", "analytics", "Lcom/robinhood/analytics/AnalyticsLogger;", "getAnalytics", "()Lcom/robinhood/analytics/AnalyticsLogger;", "setAnalytics", "(Lcom/robinhood/analytics/AnalyticsLogger;)V", "userStore", "Lcom/robinhood/shared/store/user/UserStore;", "getUserStore", "()Lcom/robinhood/shared/store/user/UserStore;", "setUserStore", "(Lcom/robinhood/shared/store/user/UserStore;)V", "addressStore", "Lcom/robinhood/librobinhood/data/store/identi/AddressStore;", "getAddressStore", "()Lcom/robinhood/librobinhood/data/store/identi/AddressStore;", "setAddressStore", "(Lcom/robinhood/librobinhood/data/store/identi/AddressStore;)V", "userInfoStore", "Lcom/robinhood/librobinhood/data/store/UserInfoStore;", "getUserInfoStore", "()Lcom/robinhood/librobinhood/data/store/UserInfoStore;", "setUserInfoStore", "(Lcom/robinhood/librobinhood/data/store/UserInfoStore;)V", "profileInfoStore", "Lcom/robinhood/librobinhood/data/store/identi/ProfileInfoStore;", "getProfileInfoStore", "()Lcom/robinhood/librobinhood/data/store/identi/ProfileInfoStore;", "setProfileInfoStore", "(Lcom/robinhood/librobinhood/data/store/identi/ProfileInfoStore;)V", "continueButton", "Lcom/robinhood/android/designsystem/button/RdsButton;", "getContinueButton", "()Lcom/robinhood/android/designsystem/button/RdsButton;", "configureToolbar", "", "toolbar", "Lcom/robinhood/android/common/ui/view/RhToolbar;", "onLoading", "loading", "", "setContinueEnabled", "enabled", "validationShouldFail", "T", "result", "(Ljava/lang/Object;)V", "logError", "t", "", "handleOnboardingErrorResponse", "Lcom/robinhood/android/address/ui/AddressErrorHandler;", "validation", "Lkotlin/Function1;", "Lcom/robinhood/models/api/ErrorResponse;", "validateOnboardingErrorResponse", "fieldNames", "", "", "fieldViews", "Landroid/view/View;", "([Ljava/lang/String;[Landroid/view/View;)Lcom/robinhood/android/address/ui/AddressErrorHandler;", "fieldName", "fieldView", "feature-address_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
/* loaded from: classes24.dex */
public abstract class AbstractAddressFragment extends BaseFragment {
    public AddressStore addressStore;
    public AnalyticsLogger analytics;
    public ProfileInfoStore profileInfoStore;
    public UserInfoStore userInfoStore;
    public UserStore userStore;

    protected abstract RdsButton getContinueButton();

    public abstract void logError(Throwable t);

    public AbstractAddressFragment(int i) {
        super(i);
    }

    public AbstractAddressFragment() {
        this(0);
    }

    public final AnalyticsLogger getAnalytics() {
        AnalyticsLogger analyticsLogger = this.analytics;
        if (analyticsLogger != null) {
            return analyticsLogger;
        }
        Intrinsics.throwUninitializedPropertyAccessException("analytics");
        return null;
    }

    public final void setAnalytics(AnalyticsLogger analyticsLogger) {
        Intrinsics.checkNotNullParameter(analyticsLogger, "<set-?>");
        this.analytics = analyticsLogger;
    }

    public final UserStore getUserStore() {
        UserStore userStore = this.userStore;
        if (userStore != null) {
            return userStore;
        }
        Intrinsics.throwUninitializedPropertyAccessException("userStore");
        return null;
    }

    public final void setUserStore(UserStore userStore) {
        Intrinsics.checkNotNullParameter(userStore, "<set-?>");
        this.userStore = userStore;
    }

    public final AddressStore getAddressStore() {
        AddressStore addressStore = this.addressStore;
        if (addressStore != null) {
            return addressStore;
        }
        Intrinsics.throwUninitializedPropertyAccessException("addressStore");
        return null;
    }

    public final void setAddressStore(AddressStore addressStore) {
        Intrinsics.checkNotNullParameter(addressStore, "<set-?>");
        this.addressStore = addressStore;
    }

    @Deprecated
    public final UserInfoStore getUserInfoStore() {
        UserInfoStore userInfoStore = this.userInfoStore;
        if (userInfoStore != null) {
            return userInfoStore;
        }
        Intrinsics.throwUninitializedPropertyAccessException("userInfoStore");
        return null;
    }

    public final void setUserInfoStore(UserInfoStore userInfoStore) {
        Intrinsics.checkNotNullParameter(userInfoStore, "<set-?>");
        this.userInfoStore = userInfoStore;
    }

    public final ProfileInfoStore getProfileInfoStore() {
        ProfileInfoStore profileInfoStore = this.profileInfoStore;
        if (profileInfoStore != null) {
            return profileInfoStore;
        }
        Intrinsics.throwUninitializedPropertyAccessException("profileInfoStore");
        return null;
    }

    public final void setProfileInfoStore(ProfileInfoStore profileInfoStore) {
        Intrinsics.checkNotNullParameter(profileInfoStore, "<set-?>");
        this.profileInfoStore = profileInfoStore;
    }

    @Override // com.robinhood.android.common.p088ui.BaseFragment, com.robinhood.android.common.p088ui.RhFragment
    public void configureToolbar(RhToolbar toolbar) throws Resources.NotFoundException {
        ActionBar supportActionBar;
        Intrinsics.checkNotNullParameter(toolbar, "toolbar");
        super.configureToolbar(toolbar);
        BaseActivity baseActivity = getBaseActivity();
        if (baseActivity != null && (supportActionBar = baseActivity.getSupportActionBar()) != null) {
            supportActionBar.setHomeButtonEnabled(false);
            supportActionBar.setDisplayHomeAsUpEnabled(false);
        }
        int dimensionPixelOffset = getResources().getDimensionPixelOffset(C13997R.dimen.rds_spacing_large);
        toolbar.getToolbar().setContentInsetsRelative(dimensionPixelOffset, dimensionPixelOffset);
    }

    protected final void onLoading(boolean loading) {
        BaseActivity baseActivity = getBaseActivity();
        if (baseActivity != null) {
            baseActivity.showProgressBar(loading);
        }
        RdsButton continueButton = getContinueButton();
        if (continueButton != null) {
            continueButton.setLoading(loading);
        }
    }

    protected final void setContinueEnabled(boolean enabled) {
        RdsButton continueButton = getContinueButton();
        if (continueButton != null) {
            continueButton.setEnabled(enabled);
        }
    }

    protected final <T> void validationShouldFail(T result) {
        Preconditions.INSTANCE.failUnexpectedItemKotlin(result);
        throw new ExceptionsH();
    }

    public final <T> AddressErrorHandler<T> handleOnboardingErrorResponse(final Function1<? super ErrorResponse, Boolean> validation) {
        Intrinsics.checkNotNullParameter(validation, "validation");
        return new AddressErrorHandler<T>(this) { // from class: com.robinhood.android.address.ui.AbstractAddressFragment.handleOnboardingErrorResponse.1
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            /* JADX WARN: Multi-variable type inference failed */
            {
                super(this);
            }

            @Override // com.robinhood.android.util.p275rx.AbsErrorHandler
            public boolean handleErrorResponse(ErrorResponse errorResponse) {
                Intrinsics.checkNotNullParameter(errorResponse, "errorResponse");
                return validation.invoke(errorResponse).booleanValue() || super.handleErrorResponse(errorResponse);
            }
        };
    }

    public final <T> AddressErrorHandler<T> validateOnboardingErrorResponse(final String[] fieldNames, final View[] fieldViews) {
        Intrinsics.checkNotNullParameter(fieldNames, "fieldNames");
        Intrinsics.checkNotNullParameter(fieldViews, "fieldViews");
        return handleOnboardingErrorResponse(new Function1() { // from class: com.robinhood.android.address.ui.AbstractAddressFragment$$ExternalSyntheticLambda1
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return Boolean.valueOf(AbstractAddressFragment.validateOnboardingErrorResponse$lambda$1(fieldViews, fieldNames, (ErrorResponse) obj));
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final boolean validateOnboardingErrorResponse$lambda$1(View[] viewArr, String[] strArr, ErrorResponse errorResponse) {
        Intrinsics.checkNotNullParameter(errorResponse, "errorResponse");
        Views.applyErrors(viewArr, errorResponse, strArr);
        return ErrorResponses.containsError(errorResponse, strArr);
    }

    public final <T> AddressErrorHandler<T> validateOnboardingErrorResponse(final String fieldName, final View fieldView) {
        Intrinsics.checkNotNullParameter(fieldName, "fieldName");
        Intrinsics.checkNotNullParameter(fieldView, "fieldView");
        return handleOnboardingErrorResponse(new Function1() { // from class: com.robinhood.android.address.ui.AbstractAddressFragment$$ExternalSyntheticLambda0
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return Boolean.valueOf(AbstractAddressFragment.validateOnboardingErrorResponse$lambda$2(fieldView, fieldName, (ErrorResponse) obj));
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final boolean validateOnboardingErrorResponse$lambda$2(View view, String str, ErrorResponse errorResponse) {
        Intrinsics.checkNotNullParameter(errorResponse, "errorResponse");
        Views.applyError(view, errorResponse, str);
        return ErrorResponses.containsError(errorResponse, str);
    }
}
