package com.withpersona.sdk2.inquiry;

import android.os.Bundle;
import androidx.fragment.app.Fragment;
import com.withpersona.sdk2.inquiry.internal.InquiryFragment;
import java.lang.reflect.InvocationTargetException;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;

/* compiled from: InlineInquiry.kt */
@Metadata(m3635d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\u0018\u00002\u00020\u0001BC\b\u0000\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0005\u0012\b\u0010\u0006\u001a\u0004\u0018\u00010\u0007\u0012\b\u0010\b\u001a\u0004\u0018\u00010\u0007\u0012\b\u0010\t\u001a\u0004\u0018\u00010\u0007\u0012\b\u0010\n\u001a\u0004\u0018\u00010\u0007¢\u0006\u0004\b\u000b\u0010\fJ\n\u0010\u000e\u001a\u0004\u0018\u00010\u000fH\u0007J\u0010\u0010\u0010\u001a\u00020\u00112\u0006\u0010\u0012\u001a\u00020\u0013H\u0002R\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004¢\u0006\u0002\n\u0000R\u0010\u0010\u0004\u001a\u0004\u0018\u00010\u0005X\u0082\u0004¢\u0006\u0002\n\u0000R\u0012\u0010\u0006\u001a\u0004\u0018\u00010\u0007X\u0082\u0004¢\u0006\u0004\n\u0002\u0010\rR\u0012\u0010\b\u001a\u0004\u0018\u00010\u0007X\u0082\u0004¢\u0006\u0004\n\u0002\u0010\rR\u0012\u0010\t\u001a\u0004\u0018\u00010\u0007X\u0082\u0004¢\u0006\u0004\n\u0002\u0010\rR\u0012\u0010\n\u001a\u0004\u0018\u00010\u0007X\u0082\u0004¢\u0006\u0004\n\u0002\u0010\r¨\u0006\u0014"}, m3636d2 = {"Lcom/withpersona/sdk2/inquiry/InlineInquiry;", "", "inquiry", "Lcom/withpersona/sdk2/inquiry/Inquiry;", "requestKey", "", "isNavBarEnabled", "", "controlNavigationBar", "controlStatusBar", "handleBackPress", "<init>", "(Lcom/withpersona/sdk2/inquiry/Inquiry;Ljava/lang/String;Ljava/lang/Boolean;Ljava/lang/Boolean;Ljava/lang/Boolean;Ljava/lang/Boolean;)V", "Ljava/lang/Boolean;", "createFragment", "Landroidx/fragment/app/Fragment;", "addArgumentsToBundle", "", "bundle", "Landroid/os/Bundle;", "inquiry-dynamic-feature_release"}, m3637k = 1, m3638mv = {2, 0, 0}, m3640xi = 48)
@SourceDebugExtension
/* loaded from: classes18.dex */
public final class InlineInquiry {
    private final Boolean controlNavigationBar;
    private final Boolean controlStatusBar;
    private final Boolean handleBackPress;
    private final Inquiry inquiry;
    private final Boolean isNavBarEnabled;
    private final String requestKey;

    public InlineInquiry(Inquiry inquiry, String str, Boolean bool, Boolean bool2, Boolean bool3, Boolean bool4) {
        Intrinsics.checkNotNullParameter(inquiry, "inquiry");
        this.inquiry = inquiry;
        this.requestKey = str;
        this.isNavBarEnabled = bool;
        this.controlNavigationBar = bool2;
        this.controlStatusBar = bool3;
        this.handleBackPress = bool4;
    }

    @ExperimentalInlineApi
    public final Fragment createFragment() throws IllegalAccessException, InstantiationException, IllegalArgumentException, InvocationTargetException {
        Object objNewInstance;
        try {
            int i = InquiryFragment.$r8$clinit;
            objNewInstance = InquiryFragment.class.getDeclaredConstructor(null).newInstance(null);
        } catch (ClassNotFoundException unused) {
        }
        Fragment fragment = objNewInstance instanceof Fragment ? (Fragment) objNewInstance : null;
        if (fragment == null) {
            return null;
        }
        Bundle bundle = new Bundle();
        this.inquiry.addArgumentsToBundle$inquiry_dynamic_feature_release(bundle);
        addArgumentsToBundle(bundle);
        fragment.setArguments(bundle);
        return fragment;
    }

    private final void addArgumentsToBundle(Bundle bundle) {
        String str = this.requestKey;
        if (str != null) {
            bundle.putString("REQUEST_KEY", str);
        }
        Boolean bool = this.isNavBarEnabled;
        if (bool != null) {
            bundle.putBoolean("IS_NAV_BAR_ENABLED", bool.booleanValue());
        }
        Boolean bool2 = this.controlNavigationBar;
        if (bool2 != null) {
            bundle.putBoolean("CONTROL_NAVIGATION_BAR", bool2.booleanValue());
        }
        Boolean bool3 = this.controlStatusBar;
        if (bool3 != null) {
            bundle.putBoolean("CONTROL_STATUS_BAR", bool3.booleanValue());
        }
        Boolean bool4 = this.handleBackPress;
        if (bool4 != null) {
            bundle.putBoolean("HANDLE_BACK_PRESS", bool4.booleanValue());
        }
    }
}
