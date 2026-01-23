package com.robinhood.shared.lists.quickadd;

import android.view.View;
import androidx.fragment.app.FragmentActivity;
import com.robinhood.android.autoeventlogging.AutoLoggingConfig;
import com.robinhood.android.autoeventlogging.UserInteractionEventDescriptor;
import com.robinhood.android.common.C11048R;
import com.robinhood.android.common.p088ui.BaseFragment;
import com.robinhood.android.common.util.HtmlCompat;
import com.robinhood.android.common.util.extensions.Snackbars;
import com.robinhood.android.designsystem.snackbar.RdsSnackbar;
import com.robinhood.android.libdesignsystem.C20690R;
import com.robinhood.api.utils.extensions.NetworkThrowables;
import com.robinhood.models.api.GenericErrorResponse;
import com.robinhood.rosetta.eventlogging.Screen;
import com.robinhood.utils.extensions.ViewsKt;
import kotlin.Metadata;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;

/* compiled from: BaseListsQuickAddFragment.kt */
@Metadata(m3635d1 = {"\u0000H\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u000e\n\u0002\u0010\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\u0003\n\u0000\b'\u0018\u00002\u00020\u0001B\u0011\u0012\b\b\u0001\u0010\u0002\u001a\u00020\u0003¢\u0006\u0004\b\u0004\u0010\u0005J\b\u0010%\u001a\u00020&H\u0016J\b\u0010'\u001a\u00020\u0011H\u0004J\u0010\u0010(\u001a\u00020&2\u0006\u0010)\u001a\u00020*H\u0004J\u0012\u0010+\u001a\u00020&2\b\u0010,\u001a\u0004\u0018\u00010-H\u0004R\u0014\u0010\u0006\u001a\u00020\u0007X\u0096D¢\u0006\b\n\u0000\u001a\u0004\b\b\u0010\tR\u0014\u0010\n\u001a\u00020\u0007X\u0096D¢\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\tR\u0012\u0010\f\u001a\u00020\rX¦\u0004¢\u0006\u0006\u001a\u0004\b\u000e\u0010\u000fR\u001c\u0010\u0010\u001a\u0004\u0018\u00010\u0011X\u0084\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0012\u0010\u0013\"\u0004\b\u0014\u0010\u0015R\u0014\u0010\u0016\u001a\u00020\u00178DX\u0084\u0004¢\u0006\u0006\u001a\u0004\b\u0018\u0010\u0019R\u0014\u0010\u001a\u001a\u00020\r8DX\u0084\u0004¢\u0006\u0006\u001a\u0004\b\u001b\u0010\u000fR\u001e\u0010\u001c\u001a\u0004\u0018\u00010\u0003X\u0086\u000e¢\u0006\u0010\n\u0002\u0010!\u001a\u0004\b\u001d\u0010\u001e\"\u0004\b\u001f\u0010 R\"\u0010\"\u001a\u0004\u0018\u00010\u00038\u0006@\u0006X\u0087\u000e¢\u0006\u0010\n\u0002\u0010!\u001a\u0004\b#\u0010\u001e\"\u0004\b$\u0010 ¨\u0006."}, m3636d2 = {"Lcom/robinhood/shared/lists/quickadd/BaseListsQuickAddFragment;", "Lcom/robinhood/android/common/ui/BaseFragment;", "layoutRes", "", "<init>", "(I)V", "excludeFromAnalyticsLogging", "", "getExcludeFromAnalyticsLogging", "()Z", "forceNightTheme", "getForceNightTheme", "eventScreen", "Lcom/robinhood/rosetta/eventlogging/Screen;", "getEventScreen", "()Lcom/robinhood/rosetta/eventlogging/Screen;", "currentSnackbar", "Lcom/robinhood/android/designsystem/snackbar/RdsSnackbar;", "getCurrentSnackbar", "()Lcom/robinhood/android/designsystem/snackbar/RdsSnackbar;", "setCurrentSnackbar", "(Lcom/robinhood/android/designsystem/snackbar/RdsSnackbar;)V", "container", "Landroid/view/View;", "getContainer", "()Landroid/view/View;", "screen", "getScreen", "snackbarContainerRes", "getSnackbarContainerRes", "()Ljava/lang/Integer;", "setSnackbarContainerRes", "(Ljava/lang/Integer;)V", "Ljava/lang/Integer;", "anchorView", "getAnchorView", "setAnchorView", "onStop", "", "ensureCurrentSnackbar", "showLoadingSnackbar", "message", "", "showErrorSnackbar", "throwable", "", "lib-lists-quickadd_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
@SourceDebugExtension
/* loaded from: classes6.dex */
public abstract class BaseListsQuickAddFragment extends BaseFragment {
    private Integer anchorView;
    private RdsSnackbar currentSnackbar;
    private final boolean excludeFromAnalyticsLogging;
    private final boolean forceNightTheme;
    private Integer snackbarContainerRes;

    public abstract Screen getEventScreen();

    public BaseListsQuickAddFragment(int i) {
        super(i);
        this.excludeFromAnalyticsLogging = true;
    }

    @Override // com.robinhood.android.common.p088ui.BaseFragment, com.robinhood.android.common.util.UiCallbacks.ScreenViewAnalyticable
    public boolean getExcludeFromAnalyticsLogging() {
        return this.excludeFromAnalyticsLogging;
    }

    public boolean getForceNightTheme() {
        return this.forceNightTheme;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public final RdsSnackbar getCurrentSnackbar() {
        return this.currentSnackbar;
    }

    protected final void setCurrentSnackbar(RdsSnackbar rdsSnackbar) {
        this.currentSnackbar = rdsSnackbar;
    }

    protected final View getContainer() {
        View viewFindViewById;
        Integer num = this.snackbarContainerRes;
        if (num != null) {
            viewFindViewById = requireActivity().findViewById(num.intValue());
        } else {
            viewFindViewById = null;
        }
        if (viewFindViewById != null) {
            return viewFindViewById;
        }
        Snackbars snackbars = Snackbars.INSTANCE;
        FragmentActivity fragmentActivityRequireActivity = requireActivity();
        Intrinsics.checkNotNullExpressionValue(fragmentActivityRequireActivity, "requireActivity(...)");
        return snackbars.findRoot(fragmentActivityRequireActivity);
    }

    protected final Screen getScreen() {
        return getEventScreen();
    }

    public final Integer getSnackbarContainerRes() {
        return this.snackbarContainerRes;
    }

    public final void setSnackbarContainerRes(Integer num) {
        this.snackbarContainerRes = num;
    }

    public final Integer getAnchorView() {
        return this.anchorView;
    }

    public final void setAnchorView(Integer num) {
        this.anchorView = num;
    }

    @Override // com.robinhood.android.common.p088ui.RxFragment, androidx.fragment.app.Fragment
    public void onStop() {
        super.onStop();
        RdsSnackbar rdsSnackbar = this.currentSnackbar;
        if (rdsSnackbar != null) {
            rdsSnackbar.dismiss();
        }
    }

    protected final RdsSnackbar ensureCurrentSnackbar() {
        View viewFindViewById;
        RdsSnackbar rdsSnackbar = this.currentSnackbar;
        if (rdsSnackbar != null) {
            return rdsSnackbar;
        }
        RdsSnackbar rdsSnackbarMake = RdsSnackbar.INSTANCE.make(getContainer(), "", -2);
        Integer num = this.anchorView;
        if (num != null) {
            viewFindViewById = requireActivity().findViewById(num.intValue());
        } else {
            viewFindViewById = null;
        }
        RdsSnackbar rdsSnackbarAddCallback = rdsSnackbarMake.setAnchorView(viewFindViewById).addCallback(new RdsSnackbar.Callback() { // from class: com.robinhood.shared.lists.quickadd.BaseListsQuickAddFragment.ensureCurrentSnackbar.2
            /* JADX WARN: Can't rename method to resolve collision */
            @Override // com.robinhood.android.designsystem.snackbar.RdsSnackbar.Callback, com.google.android.material.snackbar.BaseTransientBottomBar.BaseCallback
            public void onDismissed(RdsSnackbar transientBottomBar, int event) {
                if (event == 0 || event == 2 || event == 3) {
                    BaseListsQuickAddFragment.this.setCurrentSnackbar(null);
                }
            }
        });
        this.currentSnackbar = rdsSnackbarAddCallback;
        return rdsSnackbarAddCallback;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public final void showLoadingSnackbar(String message) {
        Intrinsics.checkNotNullParameter(message, "message");
        RdsSnackbar.setAction$default(ensureCurrentSnackbar().setMessage(HtmlCompat.fromHtml$default(message, 0, 2, null)).showLoading(true), (String) null, false, (UserInteractionEventDescriptor) null, (AutoLoggingConfig) null, (Function0) null, 14, (Object) null).setIndefiniteDuration().show();
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public final void showErrorSnackbar(Throwable throwable) {
        String string2;
        Object objExtractErrorResponse = throwable != null ? NetworkThrowables.extractErrorResponse(throwable) : null;
        GenericErrorResponse genericErrorResponse = objExtractErrorResponse instanceof GenericErrorResponse ? (GenericErrorResponse) objExtractErrorResponse : null;
        if (genericErrorResponse == null || (string2 = genericErrorResponse.getDisplayErrorText()) == null) {
            string2 = getString(C11048R.string.general_error_unable_to_save_changes);
            Intrinsics.checkNotNullExpressionValue(string2, "getString(...)");
        }
        RdsSnackbar.setAction$default(ensureCurrentSnackbar().setMessage(string2).showLoading(false).setLeadingIcon(ViewsKt.getDrawable(getContainer(), C20690R.drawable.ic_rds_alert_24dp)), (String) null, false, (UserInteractionEventDescriptor) null, (AutoLoggingConfig) null, (Function0) null, 14, (Object) null).setLongDuration().show();
    }
}
